package com.guang.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/5 12:13
 */
public class LocationFile implements FileUpload{

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public void upload() {
        logger.info("使用了本地上传");
    }
}
