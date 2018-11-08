package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 15:22
 */
public class ReportShow2 extends Report{

    public ReportShow2(Data data) {
        super(data);
    }

    @Override
    public void show() {
        System.out.print("展示二");
        this.getData().readData();
    }
}
