package com.mybatis;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatis.entity.User;
import com.mybatis.userMapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

	 @Autowired
	    private UserMapper userMapper;

	    @Test
	    public void testSelect() {
	        System.out.println(("----- selectAll method test ------"));
	        List<User> userList = userMapper.selectList(null);
	        Assert.assertEquals(5, userList.size());
	        userList.forEach(System.out::println);
	    }
}
