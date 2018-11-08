package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 15:15
 */
public abstract class Report {

    private Data data;

    public Report(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public abstract void show();
}
