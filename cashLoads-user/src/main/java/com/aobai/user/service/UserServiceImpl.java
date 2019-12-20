package com.aobai.user.service;

import com.aobai.user.domain.User;
import com.aobai.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName userServiceImpl
 * @Description TODO
 * @Author angshuai
 * @Date 2019/12/12 13:12
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }
}
