package com.guang.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/2 9:39
 */
public class FileFactory {

    private static Logger logger = LoggerFactory.getLogger("fileFactory");

    public static FileStore getInstance(String name){
        if ("ossStore".equals(name)){
            return new OssStore();
        }else if ("locationStore".equals(name)){
            return new LocationStore();
        }else{
            logger.info("工厂内未找到该方法");
            return null;
        }
    }


}
