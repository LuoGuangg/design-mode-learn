package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 技能基类
 * @date: 2018/11/4 16:14
 */
public class Skills implements Hero{

    private Hero hero;

    public Skills(Hero hero){
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        hero.learnSkills();
    }
}
