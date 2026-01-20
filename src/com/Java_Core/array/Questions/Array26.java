//package com.javaAbir.array.Questions;
//
//import java.util.Arrays;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//class Array26 {
//    public static void main(String[] args) {
//        int[] a = {2, 3, 5, 6, 2, 8, 5};
//        removeMultiApprentice(a);
//    }
//
//    static void removeMultiApprentice(int[] a) {
//        Map<Integer, Integer> arr = new LinkedHashMap<>();
//        for (int j : a) {
//            if (arr.containsKey(j)) {
//                arr.put(j, (arr.get(j) + 1));
//            } else {
//                arr.put(j, 1);
//            }
//        }
//        for (Integer key : arr.keySet()) {
//            Integer value = arr.get(key);
//            if (value>1)arr.remove(key);
//        }
//
//        System.out.println(arr.toString());
//
//
//
//
//    }
//}
