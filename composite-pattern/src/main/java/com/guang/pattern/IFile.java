package com.guang.pattern;

import java.util.List;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 10:28
 */
public interface IFile {

    void display();

    boolean add(IFile iFile);

    boolean remove(IFile iFile);

    List<IFile> getChild();

    String getFileName();

}
