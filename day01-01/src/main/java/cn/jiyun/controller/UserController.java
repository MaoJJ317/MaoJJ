package cn.jiyun.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;

@Controller

public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("toLogin")
	public String toLogin(){
		return "login";
		}
	
	//登录，校验
		@RequestMapping("login")
		public String login(HttpServletRequest request,User user,Model model){
			String msg="";
			User u=userService.findAll(user);
			if (u==null) {
				msg="用户或者密码错误";
				model.addAttribute("msg",msg);
				return "login";
			}
			request.getSession().setAttribute("user", u);
			return "list";
			
		}
		
		//去注册
		@RequestMapping("toRegist")
		public String toRegist(){
			return "regist";
			
		}
		//注册
		@RequestMapping("regist")
		public String regist(User user){
			userService.addUser(user);
			return "list";
			
		}
		//用户名不能重复
		@RequestMapping("findByUsername")
		public void findByUsername(String username,HttpServletResponse response) throws IOException{
			List<User>list=userService.findByUsername(username);
			if(list.size()>0){
				response.getWriter().write("0");
			}
		}
}
