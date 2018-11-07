package com.guang.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/7 15:28
 */
public class DogReadBook implements ReadBook{

    private Logger logger = LoggerFactory.getLogger(getClass());

    private ReadBookImpl readBook;

    @Override
    public void read() {
        heshui();
        if (readBook == null){
            readBook = new ReadBookImpl();
        }
        readBook.read();
        sleep();
    }

    public void heshui(){
        logger.info("喝点水");
    }

    public void sleep(){
        logger.info("睡会觉");
    }
}
