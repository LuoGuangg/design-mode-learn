package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:  策略模式
 * @date: 2018/11/5 12:09
 */
public class Main {

    public static void main(String[] args){
        FileContext fileContext = new FileContext(new OssFile());
        fileContext.upload();

        FileContext fileContext2 = new FileContext(new LocationFile());
        fileContext2.upload();

    }
}
