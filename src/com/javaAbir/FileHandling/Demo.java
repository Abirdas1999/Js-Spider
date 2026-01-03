package com.javaAbir.FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/abirdas/Documents/Code-Pool/BLR/src/com/javaAbir/FileHandling/Dynamic");
        File f1 = new File("/Users/abirdas/Documents/Code-Pool/BLR/src/com/javaAbir/FileHandling/Dynamic/Demo.txt");
        System.out.println(f.getAbsoluteFile());//getting absolute path...
//        System.out.println(f.delete());//delete the folder
        if (f.exists()) {
            System.out.println("Folder already exists :( ");
        } else {
            boolean created = f.mkdirs(); // create folder(s)
            boolean create = f1.createNewFile(); // create folder(s)
            if (created && create) {
                System.out.println("Folder/File created successfully :) ");
            } else {
                System.out.println("Failed to create :( ");
            }
        }

        System.out.println("Can Read: " + f.canRead());
        System.out.println("Can Write: " + f.canWrite());
        System.out.println("Can Execute: " + f.canExecute());


    }

}
