package cmo.aobai.mapper;

import cmo.aobai.domain.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author angshuai
 * @Date 2019/12/12 13:09
 * @Version 1.0
 **/
//@Mapper
public interface UserMapper {

    List<User> selectList();
}
