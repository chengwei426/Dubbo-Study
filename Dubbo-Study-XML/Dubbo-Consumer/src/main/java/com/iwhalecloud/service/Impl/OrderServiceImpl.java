package com.iwhalecloud.service.Impl;

import com.iwhalecloud.entity.UserAddress;
import com.iwhalecloud.service.IOrderService;
import com.iwhalecloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IUserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("start initOrder");
        System.out.println("userId >>> " + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList.toString());
        System.out.println("end initOrder");

        return userAddressList;
    }
}
