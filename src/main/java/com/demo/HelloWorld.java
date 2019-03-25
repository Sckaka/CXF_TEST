package com.demo;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    @WebMethod(action="sayHi")//给soapAction添加值
    String sayHi(@WebParam(name="text")String text);
    String sayHiToUser(User user);
    String[] SayHiToUserList(List<User> userList);
}
