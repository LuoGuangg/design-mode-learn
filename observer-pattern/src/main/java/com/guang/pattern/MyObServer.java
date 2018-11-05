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
 * @date: 2018/11/5 15:30
 */
public class MyObServer implements Observer{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void update(Observable o, Object arg) {
        logger.info(arg+"发送消息了,快去查看");
    }
}
