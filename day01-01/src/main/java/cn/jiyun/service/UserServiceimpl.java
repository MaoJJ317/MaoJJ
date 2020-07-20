package cn.jiyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiyun.mapper.UserMapper;
import cn.jiyun.pojo.User;

@Service
@Transactional
public class UserServiceimpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User findAll(User user) {
		// TODO Auto-generated method stub
		return userMapper.findAll(user);
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
	}

	public List<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.findByUsername(username);
	}
}
