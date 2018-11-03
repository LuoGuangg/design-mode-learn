package com.guang.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/2 9:38
 */
public class OssStore implements FileStore{

    private Logger logger = LoggerFactory.getLogger(getClass());

    public String save() {
        logger.info("调用了OSS存储");
        return "OSS存储";
    }
}
