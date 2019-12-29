package com.iwhalecloud.service.Impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.iwhalecloud.entity.UserAddress;
import com.iwhalecloud.service.IUserService;

import java.util.List;

/**
 * @Description 本地存根 <br>
 * 
 * @author cheng.wei <br>
 * @version 1.0<br>
 * @taskId $ <br>
 * @CreateDate 2019/12/20 <br>
 * @since V8.1<br>
 * @see UserServiceStub <br>
 */
public class UserServiceStub implements IUserService {

    private final IUserService userService;

    // 传入远程调用的地址对象
    public UserServiceStub(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("执行本地存根.... userId: " + userId);
        if (StringUtils.isNotEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }

        return null;
    }
}
