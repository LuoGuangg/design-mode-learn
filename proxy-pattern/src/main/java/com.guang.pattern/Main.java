package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 代理模式
 * @date: 2018/11/7 15:24
 */
public class Main {

    public static void main(String[] args){
        ReadBook dogReadBook = new DogReadBook();
        dogReadBook.read();
    }
}
