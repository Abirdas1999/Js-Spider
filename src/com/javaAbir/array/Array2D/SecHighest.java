package com.javaAbir.array.Array2D;

class SecHighest {
    public static void main(String[] args) {
        int [] [] a = {
                {1,2,3},
                {14,9,5},
                {8,1,3}
        };
        for (int [] temp :a ){
            for (int d:temp){
                System.out.print(d+"\t");
            }
            System.out.println();
        }
        System.out.println(getSecHigh(a));

    }
    static int getSecHigh(int [] [] a){
        int high = 0;
        int secHigh = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if (a[i][j]>high) {
                    secHigh =high;
                    high = a[i][j];
                } else if (a[i][j]>secHigh && secHigh<high) {
                    secHigh = a[i][j];
                }

            }

        }
        return secHigh;
    }


}
