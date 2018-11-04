package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/4 15:16
 */
public class SteelRobot implements RobotBuilder{

    private Robot robot = new Robot();

    @Override
    public void setHand() {
        robot.setHand(new SteelHand());
    }

    @Override
    public void setBody() {
        robot.setBody(new SteelBody());
    }

    @Override
    public void setHeat() {
        robot.setHeat(new SteelHeat());
    }

    @Override
    public void setFoot() {
        robot.setFoot(new SteelFoot());
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
