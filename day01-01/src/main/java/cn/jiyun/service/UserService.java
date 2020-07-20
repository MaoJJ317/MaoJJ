package cn.jiyun.service;

import java.util.List;

import cn.jiyun.pojo.User;

public interface UserService {

	User findAll(User user);

	void addUser(User user);

	List<User> findByUsername(String username);

}
