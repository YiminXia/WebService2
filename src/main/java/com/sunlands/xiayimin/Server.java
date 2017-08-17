package com.sunlands.xiayimin;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by sunlandsxym on 2017/8/17.
 */
public class Server {
    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorld implementor = new HelloWorldImpl();
        String address = "http://172.16.103.189/ws";

        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress(address); // 设置暴露地址
        factoryBean.setServiceClass(HelloWorld.class); // 接口类
        factoryBean.setServiceBean(implementor); // 设置实现类
        factoryBean.create(); // 创建webservice接口
        System.out.println("web service started");
        System.out.println("请求地址为为：" + address + "?WSDL");
    }
}
