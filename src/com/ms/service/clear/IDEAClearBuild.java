package com.ms.service.clear;

import com.ms.utils.FileUtils;

import java.io.File;

/**
 * 删除 IDEA项目中的中的build
 */
public class IDEAClearBuild {
    public static void search(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File it : files) {
            if (it.isDirectory()) {
                search(it.getPath());
            }
            if (it.getName().equals("build")) {
                System.out.println(it.getPath());
                FileUtils.deleteDir(it.getPath());
            }
        }
    }

    public static void main(String[] args) {
        // 传入项目路径
        search("D:\\src\\aliyun\\shuangyang\\shuangyang-service\\service\\");
    }
}
