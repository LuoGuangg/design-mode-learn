package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 15:22
 */
public class ReportShow1 extends Report{

    public ReportShow1(Data data) {
        super(data);
    }

    @Override
    public void show() {
        System.out.print("展示一");
        this.getData().readData();
    }
}
