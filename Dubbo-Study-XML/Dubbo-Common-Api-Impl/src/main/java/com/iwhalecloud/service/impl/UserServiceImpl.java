package com.iwhalecloud.service.impl;

import com.iwhalecloud.entity.UserAddress;
import com.iwhalecloud.service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // Integer id, String userId, String userAddress, String consignee, String phoneNum, String iFDefault
        UserAddress userAddress = new UserAddress(1, "22", "广州巨大", "Tom", "6811672", "Y");
        UserAddress userAddress1 = new UserAddress(3, "24", "广州东晓南", "Kite", "6811673", "Y");

        ArrayList<UserAddress> addressArrayList = new ArrayList<UserAddress>(2);
        addressArrayList.add(userAddress);
        addressArrayList.add(userAddress1);

        return addressArrayList;
    }
}
