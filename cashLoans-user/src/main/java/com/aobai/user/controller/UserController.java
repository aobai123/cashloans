package com.aobai.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api("UserController|用户信息相关")
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @ApiOperation(value = "用户信息列表")
    @RequestMapping("/inform")
    public List<User> inform(){
        return userService.selectList();
    }
}
