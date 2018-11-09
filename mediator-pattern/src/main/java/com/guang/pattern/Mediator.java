package com.guang.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/9 15:27
 */
public class Mediator {

    Logger logger = LoggerFactory.getLogger(getClass());

    private Man man;
    private Woman woman;

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public void isSpouse(Person person){
        if (person instanceof Man){
            this.man = (Man) person;
        }else{
            this.woman = (Woman) person;
        }

        if (man == null || woman == null){
            logger.info("同性");
            return;
        }

        if (man.getAge().equals(woman.getAge())){
            logger.info("合适");
        }else{
            logger.info("不合适");
        }

    }

}
