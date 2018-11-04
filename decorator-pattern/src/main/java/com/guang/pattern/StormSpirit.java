package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 蓝猫
 * @date: 2018/11/4 16:12
 */
public class StormSpirit implements Hero{

    /**
     * 名字
     */
    private String name;

    public StormSpirit(String name){
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了技能！");
    }
}
