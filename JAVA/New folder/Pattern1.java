
public class Pattern1 {

    public static void main(String[] args) {
        int n = 9;

        // #1.
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // #2.
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n; j++) {
        //         if(i==1||j==1||i==n||j==n){
        //         System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #3.
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n; j++) {
        //         if(i==1||i==n||j==n/2+1){
        //         System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #4.name
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n; j++) {
        //         if(i==1||j==1||i==n/2+1||j==n){
        //         System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #5.name
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (i * 2) - 1; k++) {
        //         if (k == 1 || k == (i * 2 - 1) || i == n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= n-1; i++) {
        //     for (int k = 1; k <= 2*n; k++) {
        //         if (k == (2*n)-1 || k == 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #6.name this is perfect A
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (i * 2) - 1; k++) {
        //         if (k == 1 || k == (i * 2 - 1) || i == n/2+1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println();
        // }

    }

}
