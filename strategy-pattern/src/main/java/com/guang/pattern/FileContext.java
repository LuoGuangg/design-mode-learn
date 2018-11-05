package com.guang.pattern;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.pattern
 * @Description:
 * @date: 2018/11/5 12:16
 */
public class FileContext {

    private FileUpload fileUpload;

    public FileContext(FileUpload fileUpload) {
        this.fileUpload = fileUpload;
    }

    public void upload(){
        fileUpload.upload();
    }
}
