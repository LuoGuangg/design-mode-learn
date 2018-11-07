package com.guang.pattern.dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern.dynamic
 * @Description:
 * @date: 2018/11/7 16:10
 */
public class MyHandler implements InvocationHandler{

    private ReadBookImpl readBook;

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void setReadBook(ReadBookImpl readBook) {
        this.readBook = readBook;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        heshui();
        result = method.invoke(readBook,args);
        sleep();
        return result;
    }


    public void heshui(){
        logger.info("喝点水");
    }

    public void sleep(){
        logger.info("睡会觉");
    }
}
