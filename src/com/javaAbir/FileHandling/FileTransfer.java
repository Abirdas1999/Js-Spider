package com.javaAbir.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

 class FileTransfer {
    public static void main(String[] args) throws IOException {
        String path = "/Users/abirdas/Documents/Code-Pool/BLR/src/com/javaAbir/FileHandling";
        getCopy(path);
    }


    static void getCopy(String path) throws IOException {
        File file = new File(path + "/Demo.java");
        FileInputStream f = new FileInputStream(file);
        FileWriter bf = new FileWriter(path + "/Dynamic/Demo.txt");
        if (file.canRead()){
            int n = f.read();
            while (n != -1){
                bf.write((char)n );
                n = f.read();
            }
        }else {
            System.out.println("Can't Read :) ");
        }
        f.close();
        bf.close();
    }

}
