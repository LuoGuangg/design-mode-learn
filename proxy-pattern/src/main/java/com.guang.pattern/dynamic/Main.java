package com.guang.pattern.dynamic;

import com.guang.pattern.DogReadBook;

import java.lang.reflect.Proxy;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 动态代理
 * @date: 2018/11/7 15:24
 */
public class Main {

    public static void main(String[] args){
        ReadBookImpl readBook = new ReadBookImpl();
        MyHandler myHandler = new MyHandler();
        myHandler.setReadBook(readBook);
        ReadBook readBook1 = (ReadBook) Proxy.newProxyInstance(ReadBookImpl.class.getClassLoader(),readBook.getClass().getInterfaces(),myHandler);
        readBook1.read();
    }
}
