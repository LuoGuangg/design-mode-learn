package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 建造者模式
 * @date: 2018/11/4 15:05
 */
public class Main {
    
    public static void main(String[] args){

        Robot robot = new RobotDirector().getRobot(new SteelRobot());

        robot.getHand().meterial();
        robot.getBody().meterial();
        robot.getHeat().meterial();
        robot.getFoot().meterial();

        Robot robot2 = new RobotDirector().getRobot(new WoodRobot());

        robot2.getHand().meterial();
        robot2.getBody().meterial();
        robot2.getHeat().meterial();
        robot2.getFoot().meterial();

    }
}
