package com.iwhalecloud;

import com.iwhalecloud.service.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ConsumerTest
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
       // context.start();
        IOrderService orderService = context.getBean(IOrderService.class);
        orderService.initOrder("22");
    }
}
