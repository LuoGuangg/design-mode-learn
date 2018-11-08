package com.guang.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/8 10:34
 */
public class Folder implements IFile{

    private String fileName;

    private List<IFile> iFiles;


    public void setiFiles(List<IFile> iFiles) {
        this.iFiles = iFiles;
    }

    public Folder(String fileName) {
        this.fileName = fileName;
        iFiles = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(fileName);
    }

    @Override
    public boolean add(IFile iFile) {
        return iFiles.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {
        return iFiles.remove(iFile);
    }

    @Override
    public List<IFile> getChild() {
        return iFiles;
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
