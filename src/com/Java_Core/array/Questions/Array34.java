package com.Java_Core.array.Questions;

class Array34 {
    public static void main(String[] args) {
        int[] a = {2, 4, 0, 1, 5, 0, 6, 0, 8, 0};
        System.out.println(getLength(a));
    }

    static int getLength(int[] a) {
        int count = 0;
        try {
            while (true) {
                int temp = a[++count];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // end reached
        }
        return count;
    }
}
