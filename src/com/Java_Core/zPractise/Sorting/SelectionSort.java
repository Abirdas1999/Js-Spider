package com.Java_Core.zPractise.Sorting;
class SelectionSort {
    public static void main(String[] args) {
        int [] a = {2,2,4,5,9,5,10,23,0};
        SelectionSorting(a);
        for (int b:a){
            System.out.print(b+" ");
        }

    }
    static void SelectionSorting(int [] a){
        for (int i = 0; i <a.length-1 ; i++) {
            int key = i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[key]){
                    key = j;
                }
            }
            if (i!=key){
                int temp = a[key];
                a[key] = a[i];
                a[i] = temp;
            }


        }
    }

}
