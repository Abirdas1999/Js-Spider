public class RecursionProgram {
    public static void main(String[] args) {
        // Display(10, 20);
        // Sum(100);
        System.out.println(Sum(8));
        
    }



    // static  void  Display(int start , int end){
    //     if(start>end) return;

    //     System.out.print(start+" ");

    //     Display(start + 1, end);
    // }


    static  int  Sum(int n){
        if (n==1) {
            return 1;
            
        } else {
            return n+Sum(n-1);
        }

        
    }
}
