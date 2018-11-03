package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/2 10:18
 */
public class OssStoreFactory implements FileFactory{
    public FileStore getInstance() {
        return new OssStore();
    }
}
