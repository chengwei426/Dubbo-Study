package com.iwhalecloud;

import com.iwhalecloud.entity.UserAddress;
import com.iwhalecloud.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class ProviderTest
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        //context.start();
        IUserService userService = context.getBean("userService", IUserService.class);
        List<UserAddress> userAddressList = userService.getUserAddressList("22");
        System.out.println(userAddressList.toString());
        System.in.read();
    }
}
