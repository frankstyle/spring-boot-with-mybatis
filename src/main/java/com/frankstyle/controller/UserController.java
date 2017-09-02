package com.frankstyle.controller;


import com.frankstyle.ResponseData;
import com.frankstyle.bean.User;
import com.frankstyle.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData login(@RequestBody User user) {
//        System.out.println("usermapper : " + userMapper);
        User dbUser = userMapper.selectByUsername(user.getUsername());
        dbUser.setPassword(null);

        ResponseData responseData = new ResponseData(dbUser, "0", "ok");

        return responseData;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
