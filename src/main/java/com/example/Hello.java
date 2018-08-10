package com.example;

/**
 * Created by weiyang on 2018/8/10.
 *
 * @Author: weiyang
 * @Package com.example
 * @Project: JMeter-java-test
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/10 10:16
 */

public class Hello {
    public String sayHello()
    {
        return "Hello";
    }
    public String sayHelloToPerson(String s)
    {
        if(s == null || s.equals(""))
            s = "nobody";
        return (new StringBuilder()).append("Hello ").append(s).toString();
    }
    public int sum(int a,int b)
    {
        return a+b;
    }
}