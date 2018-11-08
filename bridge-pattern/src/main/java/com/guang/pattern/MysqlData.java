package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 15:17
 */
public class MysqlData implements Data{

    @Override
    public void readData() {
        System.out.println("使用Mysql读取数据");
    }
}
