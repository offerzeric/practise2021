package com.eric.project.service.impl;


import com.eric.project.dao.HelloDao;
import com.eric.project.mapper.DemoMapper;
import com.eric.project.pojo.Person;
import com.eric.project.pojo.User;
import com.eric.project.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author ericzhang 2021/11/12 3:46 下午
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private Person person;

    @Autowired
    private DemoMapper demoMapper;

    @Autowired
    private HelloDao helloDao;


    @Override
    public void Hello() {
        helloDao.testRedis();

    }

    @Override
    public void Mysql() {
        List<User> all = demoMapper.findAll();
        for (User user : all) {
            System.out.println(user.getUserId()+" "+user.getUserGender()+" "+user.getUserName());
        }
    }
}
