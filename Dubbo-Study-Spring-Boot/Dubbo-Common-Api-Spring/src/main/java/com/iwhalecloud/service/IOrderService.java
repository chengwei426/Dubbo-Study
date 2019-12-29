package com.iwhalecloud.service;

import com.iwhalecloud.entity.UserAddress;

import java.util.List;

public interface IOrderService {

    List<UserAddress> initOrder(String userId);
}
