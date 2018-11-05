package com.guang.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/5 15:24
 */
public class Message extends Observable {

    private String name;

    private Logger logger = LoggerFactory.getLogger(getClass());

    public Message(String name) {
        this.name = name;
    }

    public void send(){
        logger.info(name+"发送了消息");
        this.setChanged();
        this.notifyObservers(name);
    }

}
