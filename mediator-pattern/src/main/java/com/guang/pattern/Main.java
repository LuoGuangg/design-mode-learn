package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 中介者模式
 * @date: 2018/11/9 15:02
 */
public class Main {
    
    public static void main(String[] args){
        Mediator mediator = new Mediator();
        Man man = new Man("张三",21,mediator);
        Man woman = new Man("小芳",21,mediator);
        man.getSpouse(woman);
    }
}
