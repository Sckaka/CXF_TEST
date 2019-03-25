package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldClient {

    // 单java应用测试
    // public static void main(String[] args) {
    // JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
    // svr.setServiceClass(HelloWorld.class);
    // svr.setAddress("http://localhost:8089/helloWorld");
    // HelloWorld hw = (HelloWorld) svr.create();
    // User user = new User();
    // user.setName("Tony");
    // user.setDescription("test");
    // System.out.println(hw.sayHiToUser(user));
    // }
    // web应用测试
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld client = (HelloWorld) context.getBean("client");
        User user1 = new User();
        user1.setName("Tony");
        user1.setDescription("test");
        User user2 = new User();
        user2.setName("freeman");
        user2.setDescription("test");
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        String[] res = client.SayHiToUserList(userList);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }
}
