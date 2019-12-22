package cmo.aobai.service;

import cmo.aobai.domain.User;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @ClassName userServiceImpl
 * @Description TODO
 * @Author angshuai
 * @Date 2019/12/12 13:12
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserMapper userMapper;

    public  User  selectList() {
//        return userMapper.selectList();
        User user=new User();
        user.setAddress("2");
        return user;
    }
}
