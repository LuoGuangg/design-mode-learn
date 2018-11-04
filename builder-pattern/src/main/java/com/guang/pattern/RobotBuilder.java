package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/4 15:14
 */
public interface RobotBuilder {

    void setHand();
    void setBody();
    void setHeat();
    void setFoot();

    Robot getRobot();

}
