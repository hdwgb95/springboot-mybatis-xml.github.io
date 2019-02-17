package com.xinjock.nbteam.controller;

import com.alibaba.fastjson.JSONObject;
import com.xinjock.nbteam.entity.User;
import com.xinjock.nbteam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public JSONObject findAll(){
        List<User> users = userService.findAll();
        JSONObject json = new JSONObject();
        json.put("data",users);
        return json;
    }

    @RequestMapping("/find")
    public JSONObject findOne(Integer id){
        User user = userService.findOne(id);
        JSONObject json = new JSONObject();
        json.put("data",user);
        return json;
    }

    @RequestMapping("/add")
    public void addOne(User user){
        userService.addOne(user);
    }

    @RequestMapping("/update1")
    public void updateOne(User user){
        userService.updateOne(user);
    }

    @RequestMapping("/del")
    public void delOne(Integer id){
        userService.delOne(id);
    }
}
