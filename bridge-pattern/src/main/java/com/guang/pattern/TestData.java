package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 15:19
 */
public class TestData implements Data{
    @Override
    public void readData() {
        System.out.println("使用文本读取数据");
    }
}
