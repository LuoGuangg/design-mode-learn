package com.guang.pattern.dynamic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/7 15:26
 */
public class ReadBookImpl implements ReadBook {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void read() {
        logger.info("正在读书");
    }
}
