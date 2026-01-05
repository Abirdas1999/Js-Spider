package com.javaAbir.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

class PhoneNumber {
    public static void main(String[] args) throws IOException {
        String path = "/Users/abirdas/Documents/Code-Pool/BLR/src/com/javaAbir/FileHandling";

        System.out.println(getModified(path));


    }


    static int getModified(String path) throws IOException {
        int count = 0;
        int wd = 0;
        String s = "";

        File file = new File(path + "/PhoneNumber/Phone.txt");
        if (!file.exists()) createFile(path);

        File file1 = new File(path + "/Dynamic/Demo.txt");
        FileInputStream f1 = new FileInputStream(file1);
        FileWriter f = new FileWriter(file);
        if (file1.canWrite()) {
            int n = f1.read();
            while (n != -1){
                char ch = (char)n;
                if (ch >= '0' && ch <= '9') {
                    s += ch;
                } else {
                    s = "";
                }

                if (s.length() == 10 && isNumber(s)) {
                    count++;
                    s = "";
                }
                f.write(ch);
                n = f1.read();
            }
        } else {
            System.out.println(" Can't Write :( ");
        }
        f.close();
        f1.close();
        return count;
    }

    static boolean isNumber(String s){
        if (s.length() == 10 && s.matches("^[6-9]\\d{9}$")) {
            return true;
        }
        return false;
    }

    static void createFile(String path) throws IOException {
        File f = new File(path+"/PhoneNumber");
        File f1 = new File(path+"/PhoneNumber/Phone.txt");
        System.out.println(f.getAbsoluteFile());//getting absolute path...
//        System.out.println(f.delete());//delete the folder
        if (f.exists()) {
            System.out.println("Folder is already exists :( ");
        } else {
            boolean created = f.mkdirs(); // create folder(s)
            if (created) {
                System.out.println("Folder/File created successfully :) ");
            } else {
                System.out.println("Failed to create :( ");
            }

        }
        if (f1.isFile()) {
            System.out.println("File is already exists :( ");
        } else {
            boolean create = f1.createNewFile(); // create folder(s)
            if (create) {
                System.out.println("Folder/File created successfully :) ");
            } else {
                System.out.println("Failed to create :( ");
            }
        }
    }
}
