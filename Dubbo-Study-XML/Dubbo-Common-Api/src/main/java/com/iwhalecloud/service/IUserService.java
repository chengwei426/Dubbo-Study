package com.iwhalecloud.service;

import com.iwhalecloud.entity.UserAddress;

import java.util.List;


public interface IUserService {

    List<UserAddress> getUserAddressList(String userId);
}
