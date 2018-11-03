package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 工厂方法
 * @date: 2018/11/2 9:25
 */
public class Main {
    
    public static void main(String[] args){
        FileFactory location = new LocationStoreFactory();
        FileFactory oss = new OssStoreFactory();
        FileStore locationStore = location.getInstance();
        FileStore ossStore = oss.getInstance();
        locationStore.save();
        ossStore.save();
    }
}
