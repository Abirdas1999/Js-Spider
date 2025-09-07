public class Prac1 {
    public static void main(String[] args) {
        // m1(1);
        // m2(1);
        m3(2);
        
    }

    // static void m1(int i){
    //     System.out.println(i);
    //     if (i>=3) return;
    //     m1(i+1);
    //     System.out.println(i);
    //     m1(i+1);
    //     System.out.println(i);
    // }

    // static void m2(int i){
    //     System.out.println(i);
    //     if (i>=3) return;
    //     m2(++i);
    //     System.out.println(i);
    //     m2(++i);
    //     System.out.println(i);
    // }


    static void m3(int i){
        System.out.println(i);
        if (i>=2) return;
        m3(i++);
        System.out.println(i);
        m3(i++);
        System.out.println(i);
    }
}
