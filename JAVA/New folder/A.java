class A {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        int c = 101;

        String len = (c + "");
        int count = len.length();
        System.out.println(len);
        System.out.println(count);
        // ********************** */ we can write this meaning is same
        // .***********************
        // a = a + 2;
        // a += 2;
        // System.out.println("a = " + a);

        // *************adding a string****************
        // System.out.println("10 " + a);

        // *************adding a char****************
        // System.out.println("A" + a);
        // System.out.println('A' + a);

        // *************adding a char****************
        // here i can see typecasting
        // System.out.println(10 + a + "2");
        // #######def between this 2#######
        // System.out.println(10 + '2' + a);

        // ****** */ after string conversion it all behave like string*****
        // System.out.println(10 + 10 + "2" + a);
        // System.out.println("2" + a + 10);

        // ************the perenthesis priority is the most 1st**********
        // System.out.println("2" + (a + 10));

        // here i want 10+20=30 as a output?
        // System.out.println(a + " + " + b + " = " + (a + b));

        // increment and decrement
        // b = a++ + 2;
        // System.out.println(b);
        // System.out.println(a);
        // b = ++a;
        // System.out.println("New B = " + b);

        // ************

        // b = a-- + 2;
        // System.out.println(b);
        // System.out.println(a);
        // b = --a;
        // System.out.println("New B = " + --b);

                // **********from google***********

        // Java does not have a "triple equals" operator ( === ) like JavaScript does.
        // In JavaScript, the === operator performs a strict equality comparison,
        // checking both the value and the type of the operands without any type
        // coercion.
        

        if (++a == c) {
            System.err.println("I Am Double Equal");

        } else if (a == b) {
            System.out.println("I Am Triple Equal");

        } else {
            System.out.println("I am Single");
        }

    };
}