package com.lwt.simple.web.controller;

import com.lwt.simple.common.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "user")
@Slf4j
public class UserController {

    @RequestMapping(value = "query", method = RequestMethod.GET)
    public List<User> query() {
        log.info("查询用户成功");
        List<User> list=new ArrayList<>();
        User user=new User();
        user.setName("用户");
        user.setAge(30);
        user.setStyle("稳重");
        list.add(user);
        return list;
    }
}
