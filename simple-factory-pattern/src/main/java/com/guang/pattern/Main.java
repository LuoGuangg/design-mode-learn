package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 简单工厂
 * @date: 2018/11/2 9:25
 */
public class Main {
    
    public static void main(String[] args){
        FileStore fileStore = FileFactory.getInstance("locationStore");
        FileStore fileStore2 = FileFactory.getInstance("ossStore");
        fileStore.save();
        fileStore2.save();
    }
}
