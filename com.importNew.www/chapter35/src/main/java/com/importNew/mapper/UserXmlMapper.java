package com.importNew.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.importNew.dto.User;

public interface UserXmlMapper {

	User queryOne(Long id);
	
	int insert(User user);
	
	void update(User user);
	
	void delete(Long id);
		
	List<User> queryByParams(@Param("code")String code);
}