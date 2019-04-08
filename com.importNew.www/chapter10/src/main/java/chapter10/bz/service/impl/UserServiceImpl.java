package chapter10.bz.service.impl;




import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import chapter10.bz.dao.UserDao;
import chapter10.bz.entity.User;
import chapter10.bz.service.IUserService;


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