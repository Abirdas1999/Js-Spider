package com.javaAbir.array.Array2D;

class MatrixMulti {
    public static void main(String[] args) {
        int [] [] a = {
                {1,2,3},
                {3,1,2},
                {2,1,3}
        };
        int [] [] b = {
                {3,1,1},
                {1,2,1},
                {1,2,2}
        };
        int [] [] c = getMultiply(a,b);



        for (int [] temp :c ){
            for (int d:temp){
                System.out.print(d+"\t");
            }
            System.out.println();
        }

    }
    static int [] [] getMultiply(int [] [] a,int [] [] b){
        int size = a.length;
        int [] [] c = new int [size] [size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                for (int k = 0; k <size ; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

            }

        }
        return c;

    }

}
