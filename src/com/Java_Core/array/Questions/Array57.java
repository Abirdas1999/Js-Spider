package com.Java_Core.array.Questions;

class Array57 {
    public static void main(String[] args) {
        char [] a = {'R','A','C','D','D','B'};
        getSort(a);
//        System.out.println(Arrays.toString(a));
        for (char b : a){
            System.out.print(b+" ");
        }
    }
    static void getSort(char [] a){
        for (int i = 1; i <a.length ; i++) {
            //using insertionSorting...
            char key = a[i];
            int j = i-1;
            while (j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;

        }

    }


}
