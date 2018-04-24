package com.client.client1.controller;

import com.client.client1.service.UserService;
import com.client.dataaccess.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RefreshScope
@Api(value = "用户接口", description = "用户服务接口")
public class WebController {

    @Autowired
    private UserService userSev;

    @Value("${test}")
    String val;

    @ApiOperation(value = "获取用户接口", notes = "获取所有用户")
    @GetMapping("/getUser")
    public List<User> getUser(){
       return userSev.getUser();
    }

    @ApiOperation(value = "获取用户接口1", notes = "获取所有用户1")
    @ApiImplicitParam(name = "uid", value = "主键", paramType = "path", required = true, dataType = "String")
    @GetMapping("/getUid")
    public String  getUid(String uid){
        return uid;
    }

    @GetMapping("/test")
    public String hello(){
        return "this hello client1";
    }

    @GetMapping("/getConfig")
    public String getConfig(){
       return val;
    }
}
