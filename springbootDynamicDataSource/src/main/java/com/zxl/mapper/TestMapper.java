package com.zxl.mapper;


import com.zxl.bean.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Auther: zxl
 */
public interface TestMapper {

    User getUserByID(Integer id);

    int addUser(User user);

    List<User> getAll();
}
