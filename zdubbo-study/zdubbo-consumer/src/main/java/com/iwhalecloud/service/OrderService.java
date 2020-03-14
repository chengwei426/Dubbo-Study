package com.iwhalecloud.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iwhalecloud.api.IUserService;
import com.iwhalecloud.common.ResponseData;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Reference
    private IUserService userService;

    public String getUser() {
        return userService.getUser();
    }

    public ResponseData order(){
        return userService.order();
    }
}
