package com.aobai.user.mapper;

import com.aobai.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author angshuai
 * @Date 2019/12/12 13:09
 * @Version 1.0
 **/
@Mapper
public interface UserMapper {

    List<User> selectList();
}
