package cn.jiyun.mapper;

import java.util.List;

import cn.jiyun.pojo.User;

public interface UserMapper {

	User findAll(User user);

	void addUser(User user);

	List<User> findByUsername(String username);

}
