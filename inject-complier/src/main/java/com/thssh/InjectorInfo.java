package com.thssh;

/**
 * Created by hth on 2017/6/27.
 */

public class InjectorInfo {

    public String packName;
    public String className;
    public String newClassName;

    public InjectorInfo(String packName, String className) {
        this.packName = packName;
        this.className = className;
        this.newClassName = className + "$ViewBinder";
    }

    public String getClassFullPath(){
        return packName + "." + newClassName;
    }
}
