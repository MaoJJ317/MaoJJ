package cn.jiyun.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
		//1:请求路劲中包含用户模块   
				String url = request.getRequestURI();  
				if(url.contains("user")){
					return true;
				}
				
				//2：用户无登录 访问其他模块要求强制登录
				Object user = request.getSession().getAttribute("user");
				if(user !=null){
					return true;
				}
				
				//3：拦截成功后的处理，直接返回用户登录页面 //重定向
				response.sendRedirect(request.getContextPath()+"/user/toLogin.action"); 
		return false;
	}

}
