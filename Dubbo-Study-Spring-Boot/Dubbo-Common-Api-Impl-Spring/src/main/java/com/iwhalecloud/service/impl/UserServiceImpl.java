package com.iwhalecloud.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.iwhalecloud.entity.UserAddress;
import com.iwhalecloud.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements IUserService {
    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // Integer id, String userId, String userAddress, String consignee, String phoneNum, String iFDefault
        UserAddress userAddress = new UserAddress(1, "22", "广州会将站", "Tom", "68118772", "Y");
        UserAddress userAddress1 = new UserAddress(3, "24", "广州东晓南", "Kite", "68116778", "Y");

        ArrayList<UserAddress> addressArrayList = new ArrayList<UserAddress>(2);
        addressArrayList.add(userAddress);
        addressArrayList.add(userAddress1);


        /*if (Math.random() > 0.5) {
            throw new RuntimeException("哈哈哈");
        }*/


        return addressArrayList;
    }
}
