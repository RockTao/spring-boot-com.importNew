package com.importNew;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.importNew.dto.StatusEnum;
import com.importNew.dto.User;
import com.importNew.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ActiveProfiles("anno")
@ActiveProfiles("xml")

@Slf4j
public class UserMapperTest {
	
	@Autowired
	UserMapper userMpper;
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setCode("003");
		user.setName("name003");
		user.setStatus(StatusEnum.ENABLE);
		
		//新增
		userMpper.insert(user);
	}
	
	@Test
	public void testQueryOne() {
		User user = userMpper.queryOne(4L);
		log.info("id为1的查询结果为：{}", user);
	}
	
	@Test
	public void testUpdate() {
		User user = new User();
		user.setCode("002");
		user.setName("testUpdate");
		user.setStatus(StatusEnum.ENABLE);
		userMpper.insert(user);
		
		User userUpd = userMpper.queryOne(user.getId());
		userUpd.setName("更新name");
		userMpper.update(userUpd);
		
		Assert.assertEquals("更新失败",userUpd.getName(), userMpper.queryOne(user.getId()).getName());
	}
	
	@Test
	public void testParamSelect() {
		String code = "002";
		List<User> list = userMpper.queryByParams(code);
		
		log.info("查询编码为002,查询结果为：{}条,结果集为：{}",list.size(), Arrays.toString(list.toArray()));
	}

}