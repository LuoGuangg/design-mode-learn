package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 桥接模式
 * @date: 2018/11/8 15:14
 */
public class Main {

    public static void main(String[] args){
        Report report = new ReportShow2(new TestData());
        report.show();
    }
}
