package com.javaAbir.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class WriteData {
    public static void main(String[] args) throws IOException {
        String path = "/Users/abirdas/Documents/Code-Pool/BLR/src/com/javaAbir/FileHandling";

        FileOutputStream f = new FileOutputStream(path + "/Dynamic/Demo.txt");
//        f.write("Rim");//CTE
        String s = "AbirDas";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        f.write(bytes);
        f.close();


    }

}
