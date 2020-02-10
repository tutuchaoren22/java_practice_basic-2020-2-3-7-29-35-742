package com.thoughtworks;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    /**
     * 倒序打印给定数组,打印格式为: [3,2,1]
     */
    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
//        StringBuilder newArray = new StringBuilder("[");
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (i != 0) {
//                newArray.append(array[i]).append(",");
//            } else {
//                newArray.append(array[i]).append("]");
//            }
//        }
//        System.out.println(newArray);

        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i]+",");
            } else {
                System.out.println(array[i]+"]");
            }
        }
    }
}
