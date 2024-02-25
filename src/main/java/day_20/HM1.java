package day_20;

import java.util.Arrays;

public class HM1 {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        for (int i = 0; i<array.length; i++){
//            if (i % 2 !=0){
//                array[i] = array[i]*2;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        //task2
//        int[] array1 = {1,2,3,22,9,5};
//        int[] array2 = {1,2,3,22,9,5};
//        System.out.println(Arrays.equals(array1,array2));
//        //task3
//        int[] array3 = {1, 2, 3, 4, 5, 6, 7};
//        //              0  1  2  3  4  5  6
//
//        System.out.println(Arrays.toString(array3));

//        for(int i = 0; i < array3.length; i ++){
//            if(i % 2 != 0){
//                array3[i] = array3[i] * 2;
//            }
//        }
//        System.out.println(Arrays.toString(array3));
        //task 4
        int[] array4 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i<array4.length; i++){
            if (i % 1 <=0){
                array4[i] = array4[i] *5;
            }

        }
        for (int i = 0; i<array4.length; i++){
            if(i % 2 != 0){
                array4[i] = array4[i] * 10;
            }
        }
        System.out.println(Arrays.toString(array4));

    }
}
