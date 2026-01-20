package com.Java_Core.StreamAPI;

import java.util.Arrays;

class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 2, 3, 2, 7};
        int[] array = Arrays.stream(a).distinct().sorted().toArray();
        System.out.println(Arrays.toString(array));
    }

}
