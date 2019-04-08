package com.importNew.bz.service.impl;




import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.importNew.bz.dao.UserDao;
import com.importNew.bz.entity.User;
import com.importNew.bz.service.IUserService;



/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oKong
 * @since 2018-07-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}