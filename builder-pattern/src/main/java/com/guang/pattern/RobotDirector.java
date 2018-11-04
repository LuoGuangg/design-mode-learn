package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/4 15:22
 */
public class RobotDirector {

    public Robot getRobot(RobotBuilder rb){
        rb.setBody();
        rb.setHand();
        rb.setHeat();
        rb.setFoot();
        return rb.getRobot();
    }
}
