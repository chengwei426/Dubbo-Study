package com.iwhalecloud.controller;

import com.iwhalecloud.entity.UserAddress;
import com.iwhalecloud.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private IOrderService orderService;


    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        System.out.println("start initOrder .... ");
        List<UserAddress> userAddresses = orderService.initOrder(userId);

        return userAddresses;
    }

}
