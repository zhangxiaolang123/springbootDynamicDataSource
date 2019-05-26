package com.zxl.service.impl;

import com.zxl.bean.annotation.DataSource;
import com.zxl.bean.pojo.User;
import com.zxl.mapper.TestMapper;
import com.zxl.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Auther: zxl
 */
@Service
/*@DataSource(dataSource = "dataSource2")*/
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public User quety1(Integer id) {
        return testMapper.getUserByID(id);
    }

    @Override
    public User quety2(Integer id)  {
        return testMapper.getUserByID(id);
    }

    @Override
    public int addUser(User user) {
        return testMapper.addUser(user);
    }

    @Override
    public List<User> getAll() {
        return testMapper.getAll();
    }

    public static void main(String[] args){

    }
}
