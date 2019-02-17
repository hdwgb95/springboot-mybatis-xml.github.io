package com.xinjock.nbteam.service;

import com.xinjock.nbteam.entity.User;
import com.xinjock.nbteam.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }
    public User findOne(int id){
        return userMapper.findOne(id);
    }

    public void addOne(User user){
        userMapper.addOne(user);
    }
    public void updateOne(User user){
        userMapper.updateOne(user);
    }
    public void delOne(int id){
        userMapper.delOne(id);
    }
}
