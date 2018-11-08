package com.guang.pattern;

import java.util.List;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description: 组合模式
 * @date: 2018/11/8 10:27
 */
public class Main {

    public static void main(String[] args){

        Folder f1 = new Folder("第一层");


        Folder f2 = new Folder("第二层");
        File f22 = new File("二文件");
        f1.add(f2);
        f1.add(f22);


        Folder f3 = new Folder("第三层");
        File f33 = new File("三文件");
        f2.add(f3);
        f2.add(f33);
        displayTree(f1,0);

    }

    public static void displayTree(IFile iFile, int deep){
        List<IFile> iFiles = iFile.getChild();
        for (int i = 0; i<deep; i++){
            System.out.print("--");
        }
        System.out.println(iFile.getFileName());
        for (IFile ifl: iFiles){
            if (ifl instanceof File){
                for (int i = 0; i<=deep; i++){
                    System.out.print("--");
                }
                System.out.println(ifl.getFileName());
            }else{
                displayTree(ifl,deep+1);
            }
        }

    }

}
