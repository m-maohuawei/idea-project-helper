package com.ms.project;

import java.io.File;

/**
 * 生产python发布代码
 */
public class GenPythonGitPushCode {


    public static void external() {
        String path = "D:\\src\\gitee\\shuangyang\\android\\android-modules\\external\\";

        File[] files = new File(path).listFiles();
        System.out.println("import os");
        for (File it : files) {
            System.out.println("print(\"START==========" + it.getName() + "==========\")");
            System.out.println("os.system( \"cd " + it.getPath().replace("\\", "/") + "  && gitupdate.bat \")");
            System.out.println("print(\"END==========" + it.getName() + "==========\")");
        }
    }

    public static void internal() {
        String path = "D:\\src\\gitee\\shuangyang\\android\\android-modules\\internal\\";

        File[] files = new File(path).listFiles();
        System.out.println("import os");
        for (File it : files) {
            System.out.println("print(\"START==========" + it.getName() + "==========\")");
            System.out.println("os.system( \"cd " + it.getPath().replace("\\", "/") + "  && gitupdate.bat \")");
            System.out.println("print(\"END==========" + it.getName() + "==========\")");
        }
    }


    public static void main(String[] args) {

        external();

        System.out.println("\n\n\n");

        internal();

    }
}
