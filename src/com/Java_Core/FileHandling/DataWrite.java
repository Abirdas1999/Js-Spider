package com.Java_Core.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class DataWrite {
    public static void main(String[] args) throws IOException {
        String path = "/Users/abirdas/Documents/Code-Pool/BLR/src/com/javaAbir/FileHandling";
        getModified(path);
    }
    static void getModified(String path) throws IOException {

        File file = new File(path + "/Dynamic/Demo.txt");
        if (!file.exists()) getValid(path);
        FileWriter f = new FileWriter(file);
        if (file.canWrite()) {
            f.write("J-Spider\n");
            f.write("Q-Spider\n");
            f.write("Py-Spider\n");
            System.out.println("File modified successfully :) ");
        } else {
            System.out.println(" Can't Write :( ");
        }
        f.close();
    }
    static void getValid(String path) throws IOException {
        File folder = new File(path + "/Dynamic");
        File file = new File(path + "/Dynamic/Demo.txt");
        boolean created = folder.mkdirs(); // create folder(s)
        boolean create = file.createNewFile(); // create folder(s)
        if (created && create) {
            System.out.println("File created successfully :) ");
        } else {
            System.out.println("Failed to create :( ");
        }
    }
}



