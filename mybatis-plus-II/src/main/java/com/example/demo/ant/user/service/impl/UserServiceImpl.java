package com.example.demo.ant.user.service.impl;

import com.example.demo.ant.user.entity.User;
import com.example.demo.ant.user.mapper.UserMapper;
import com.example.demo.ant.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author demo
 * @since 2019-04-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
