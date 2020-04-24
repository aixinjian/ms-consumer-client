package com.ms.consumer.client.controller;

import com.ms.consumer.client.service.UserClient;
import com.ms.consumer.client.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserClient userClient;

    @GetMapping
    public List<UserVo> users() {
        List<UserVo> users = userClient.getUserList();
        return users;
    }

}
