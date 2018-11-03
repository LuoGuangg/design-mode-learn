package com.guang.pattern;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 本地存储
 * @date: 2018/11/2 9:32
 */
public class LocationStore implements FileStore{


    private Logger logger = LoggerFactory.getLogger(getClass());

    public String save() {
        logger.info("调用了本地存储");
        return "本地存储返回的URL";
    }
}
