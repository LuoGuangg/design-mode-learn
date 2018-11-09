package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/9 15:27
 */
public class Woman extends Person{

    public Woman(String name, Integer age, Mediator mediator) {
        super(name, age, mediator);
    }

    @Override
    public void getSpouse(Person person) {
        this.getMediator().setWoman(this);
        this.getMediator().isSpouse(person);
    }
}
