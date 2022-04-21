package com.sf.app.helloworld;

public class HelloWorld{
    public String sayHello(){
        return "Hello World";
    }

    public static void main(String[] args){
        System.out.println(new HelloWorld().sayHello());
    }
}
