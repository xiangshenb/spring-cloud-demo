package com.client.client1.service.impl;

import com.client.client1.service.UserService;
import com.client.dataaccess.mapper.UserMapper;
import com.client.dataaccess.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper uMapper;

    @Override
    public List<User> getUser() {
        List<User> res = null;
        try{
           res = uMapper.selectAll();
        }catch (Exception e){
            System.out.println(e);
        }
        return res;
    }
}
