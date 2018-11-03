package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 单例模式
 * @date: 2018/11/3 9:36
 */
public class Main {
    
    
    public static void main(String[] args){  
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println("LuoGuang:Main.main():"+(p1==p2));
    }
}
