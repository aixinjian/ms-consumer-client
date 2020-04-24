package com.ms.consumer.client.service;

import com.ms.consumer.client.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("MS-CONFIG-CLIENT")
public interface UserClient {

    @GetMapping("/test")
    List<UserVo> getUserList();
}
