
public class PatternPrac {

    public static void main(String[] args) {
        int n = 5;

        // #1. 
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j <= i; j++) {
        //         if (i%2==0) {
        //             System.out.print((char)(j+64)+" ");
        //         } else {
        //             System.out.print(j+" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #2 .  
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j <= ((n+1)-i); j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // #3 .  
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j <= n; j++) {
        //         if (i==1||j==1||i==n||j==n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        //#4. 
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j <= n; j++) {
        //         if (i==(n/2)+1||j==(n/2)+1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #4. 
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j <= n; j++) {
        //         if (i==j||(j+i==n+1)) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #5. 
        // int a =1;
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(a+" ");
        //         a++;
        //     }
        //     System.out.println();
        // }
        // // #6. 
        // for(int i = 1;i<=n;i++){
        //     for (int j = 1; j <= i; j++) {
        //         if (i==j||(i+j)%2==0) {
        //             System.out.print(1+" ");
        //         } else {
        //             System.out.print(0+" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // #7. 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print((j*2)-1);
        //     }
        //     System.out.println();
        // }
        // #8. 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //        if(i+j>n){
        //         System.out.print("* ");
        //        }else{
        //         System.out.print("  ");
        //        }
        //     }
        //     System.out.println();
        // }
        // #alter
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //        System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //        System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // #9 . 
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //        System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //        System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // #10 .
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // #11 .
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // #12 .
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // #12 alter .
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= (2*i)-1; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // #12 alter . ---> with variable
        // int st=1,sp=n-1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("* ");
        //     }
        //     sp--;
        //     st+=2;
        //     System.out.println();
        // }
        // #13  .
        // upper porsion of dimond
        // int st=1,sp=n-1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("* ");
        //     }
        //     sp--;
        //     st+=2;
        //     System.out.println();
        // }
        // // lower porsion of dimond
        // st=2*n-3;
        // sp=1;
        // for (int i = 1; i <= n-1; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("* ");
        //     }
        //     sp++;
        //     st-=2;
        //     System.out.println();
        // }
        // #14  . bridge

        // for (int i = 0; i <=2*n; i++) {
        //     System.out.print("* ");
        // }
        // System.out.println();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= (n + 1) - i; j++) {
        //         System.out.print("* ");
        //     }

        //     for (int j = 1; j <= (2 * i) - 1; j++) {
        //         System.out.print("  ");
        //     }

        //     for (int j = 1; j <= (n + 1) - i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }
        // #13  .
        // upper porsion of dimond
        // int st=1,sp=n-1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("* ");
        //     }
        //     sp--;
        //     st+=2;
        //     System.out.println();
        // }
        // // lower porsion of dimond
        // st=2*n-3;
        // sp=1;
        // for (int i = 1; i <= n-1; i++) {
        //     for (int j = 1; j <= sp; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print("* ");
        //     }
        //     sp++;
        //     st-=2;
        //     System.out.println();
        // }

    }
}
