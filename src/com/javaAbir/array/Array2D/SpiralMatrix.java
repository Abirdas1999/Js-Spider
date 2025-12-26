package com.javaAbir.array.Array2D;

class SpiralMatrix {
    public static void main(String[] args) {
        int[][] c = getSpiral(5);
        for (int[] temp : c) {
            for (int d : temp) {
                System.out.print(d + "\t");
            }
            System.out.println();
        }

    }

    static int[][] getSpiral(int size) {
        int[][] a = new int[size][size];
        int r = 0, c = -1;
        char dir = 'r';
        for (int i = 1; i <= size * size; i++) {
            switch (dir) {
                case 'r':
                    a[r][++c] = i;
                    if (c == size - 1 - r) dir = 'd';
                    break;
                case 'd':
                    a[++r][c] = i;
                    if (r == c) dir = 'l';
                    break;
                case 'l':
                    a[r][--c] = i;
                    if (c == size - 1 - r) dir = 'u';
                    break;

                case 'u':
                    a[--r][c] = i;
                    if (r == c + 1) dir = 'r';
                    break;
            }


        }
        return a;

    }


}
