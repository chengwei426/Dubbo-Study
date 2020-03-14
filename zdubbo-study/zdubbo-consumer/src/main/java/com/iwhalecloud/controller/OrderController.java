package com.iwhalecloud.controller;

import com.iwhalecloud.common.ResponseData;
import com.iwhalecloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping("/getUser")
    public String getUser() {
        return orderService.getUser();
    }

    @RequestMapping("/order")
    public ResponseData order(){
        return orderService.order();
    }


}
