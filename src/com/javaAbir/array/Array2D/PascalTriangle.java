package com.javaAbir.array.Array2D;

class PascalTriangle {
    public static void main(String[] args) {
       int [] [] a = getPascal(5);
      for (int i=0; i<a.length;i++){
          for (int j = 0; j <=a.length-i-1 ; j++) {
              System.out.print(" ");

          }
          for (int c : a[i]) {
              System.out.print(c+" ");
          }
          System.out.println();
      }
    }
    static int [][] getPascal(int size){
        int[][] a = new int [size][];
        for (int i = 0;  i < a.length ; i++) {
            a[i] = new int [i+1];
            for (int j = 0; j < a[i].length ; j++) {
                if (j==0||i==j){
                    a[i][j] = 1;
                }else {
                    a[i][j] = a[i-1][j-1]+a[i-1][j];
                }

            }
        }
        return a;
    }

}
