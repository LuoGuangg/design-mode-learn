package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 装饰模式
 * @date: 2018/11/4 16:09
 */
public class Main {

    public static void main(String[] args){
        Hero hero = new StormSpirit("蓝猫");
        hero = new SkillsOne(hero, "残影");
        hero = new SkillsOne(hero, "超负荷");
        hero.learnSkills();
    }
}
