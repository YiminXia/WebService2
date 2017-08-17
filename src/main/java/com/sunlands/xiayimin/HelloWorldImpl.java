package com.sunlands.xiayimin;

import javax.jws.WebService;

/**
 * Created by sunlandsxym on 2017/8/17.
 */
@WebService
public class HelloWorldImpl implements HelloWorld {
    public String sayHello(String str) {
        return "Hello" + str;
    }
}
