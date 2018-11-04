package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/4 16:16
 */
public class SkillsOne extends Skills{

    private String skillName;

    public SkillsOne(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了第一个技能:" +skillName);
        super.learnSkills();
    }
}
