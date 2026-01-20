package com.Java_Core.DSA.Program;

class NumToString {
    public static void main(String[] args) {
        int num = 913489244;
        getString(num / 10000000, " Crore");
        getString((num / 100000) % 100, " Lakhs");
        getString((num / 10000000) % 100, " Thousand");
        getString((num / 100) % 10, " Hundred");
        getString(num % 100, "");
    }

    static void getString(int num, String s) {
        String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] two = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (num <= 19) System.out.print(one[num]);
        else System.out.print(two[num / 10] + " " + one[num % 10]);

        if (num != 0) System.out.println(s);

    }


}
