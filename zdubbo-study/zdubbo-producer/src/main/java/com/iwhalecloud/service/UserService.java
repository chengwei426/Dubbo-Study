package com.iwhalecloud.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.iwhalecloud.api.IUserService;
import com.iwhalecloud.common.ResponseData;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserService implements IUserService {
    @Override
    public String getUser() {
        return "你好";
    }

    @Override
    public ResponseData order() {
        ResponseData<String> responseData = new ResponseData<>("200", "success");
        responseData.setData("hello world");
        return responseData;
    }
}
