
public class Pattern2 {

    public static void main(String[] args) {
        int n = 5;

        // #1.
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-(i-1); j++) {
        //         System.out.print(n-(i-1));
        //     }
        //     System.out.println();
        // }
        // #2.
//           * 
//         *   * 
//       *       * 
//     *           * 
//   * * * * * * * * * 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (i*2)-1; k++) {
        //         if(k==1|| k==(i*2-1)||i==n){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #3.
// * * * * * * * * * 
//   *           * 
//     *       * 
//       *   * 
//         * 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("  ");
        //     }

        //     for (int k = 1; k <= 2 * (n - i) - 1; k++) {
        //         if (k == 1 || k == 2 * (n - i) - 1 || i == 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println();
        // }

        // j==2*((n-i)-1)


        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (i*2)-1; k++) {
                if(k==1|| k==(i*2-1)||i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        // #4.
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

         // #5.
        //  for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i-1; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= n-(i-1); j++) {
        //         System.out.print(n-(i-1)+" ");
        //     }
        //     System.out.println();
        // }


    }
}
