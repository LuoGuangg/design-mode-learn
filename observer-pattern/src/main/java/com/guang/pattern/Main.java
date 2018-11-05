package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 观察者模式
 * @date: 2018/11/5 15:22
 */
public class Main {

    public static void main(String[] args){
        Message message = new Message("小明");
        message.addObserver(new MyObServer());
        message.send();
    }
}
