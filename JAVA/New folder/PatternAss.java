public class PatternAss {
    public static void main(String[] args) {
        int n = 7;
        // #1.Hollow dimond
        // upper portion of diamond
        // int st = 1, sp = n - 1;
        // for (int i = 1; i <= n; i++) {
        //     // spaces
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     // stars & hollow part
        //     for (int j = 1; j <= st; j++) {
        //         if (j == 1 || j == st) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     sp--;
        //     st += 2;
        //     System.out.println();
        // }

        // // lower portion of diamond
        // st = 2 * n - 3;
        // sp = 1;
        // for (int i = 1; i <= n - 1; i++) {
        //     // spaces
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     // stars & hollow part
        //     for (int j = 1; j <= st; j++) {
        //         if (j == 1 || j == st) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     sp++;
        //     st -= 2;
        //     System.out.println();
        // }


        // #2. holow piramid

        // int st = 1, sp = n - 1;
        // for (int i = 1; i <= n; i++) {
        //     // spaces
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     // stars 
        //     for (int j = 1; j <= st; j++) {
        //         if (j == 1 || j == st||i==n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     sp--;
        //     st += 2;
        //     System.out.println();
        // }

        // #2. holow reverse piramid
        int st = 2*n-1;
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st||i==1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            sp++;
            st -= 2;
            System.out.println();
        }

    }
}
