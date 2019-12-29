package com.iwhalecloud.service.Impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.iwhalecloud.entity.UserAddress;
import com.iwhalecloud.service.IOrderService;
import com.iwhalecloud.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    // 设置url将采用直连, 不走zk
    // @Reference(url = "127.0.0.1:20882")
    @Reference
    private IUserService userService;

    @HystrixCommand(fallbackMethod = "failResp")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("start initOrder");
        System.out.println("userId >>> " + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList.toString());
        System.out.println("end initOrder");

        return userAddressList;
    }

    public List<UserAddress> failResp(String userId) {

        return Arrays.asList(new UserAddress(999, "9999", "广州美院", "Tom", "6811672", "Y"));
    }
}
