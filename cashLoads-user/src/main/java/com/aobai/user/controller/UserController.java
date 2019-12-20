package com.aobai.user.controller;

import com.aobai.user.domain.User;
import com.aobai.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author angshuai
 * @Date 2019/12/12 13:14
 * @Version 1.0
 **/
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("/inform")
    public List<User> inform(){
        return userService.selectList();
    }
}
