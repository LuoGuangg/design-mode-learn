package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/3 9:37
 */
public class Person {

    /**
     * 饿汉式
     */
//    private static final Person person = new Person();


    /***************************************/

    /**
     * 懒汉式
     */
    private static Person person;

    private Person(){

    }

    /**
     * 饿汉式
     */
//    public static Person getInstance(){
//        return person;
//    }

    /***************************************/

    /**
     * 懒汉式 - 双重检查
     * @return
     */
    public static Person getInstance(){
        if (null == person){
            synchronized(Person.class){
                if (null == person){
                    person = new Person();
                }
            }
        }

        return person;
    }
}
