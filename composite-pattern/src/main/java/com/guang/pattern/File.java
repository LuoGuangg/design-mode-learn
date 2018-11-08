package com.guang.pattern;

import java.util.List;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 10:31
 */
public class File implements IFile{

    private String fileName;


    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println(fileName);
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
