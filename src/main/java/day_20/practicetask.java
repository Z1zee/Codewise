package day_20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practicetask {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

//        System.out.println("enter the size of int");
//
//        int size = scanner.nextInt();
//        int[] array = new int [size];
       Random random = new Random();
//        int sum = 0;
//        for (int i = 0; i< array.length; i++){
//            array[i] = random.nextInt(11);
//            sum += array[i];}
//        System.out.println(Arrays.toString(array));
//        System.out.println("sum "+ sum);
        //task4
        int[] array = new int[10];
        //int[] max = new int[50];
        for (int i = 0; i<array.length;i++){
            array[i] = random.nextInt(0,100);

        }
        System.out.println(Arrays.toString(array));
        //System.out.print("ede");

        for (int i = 0; i < array.length;i++){
            if (array[i]>=50){
                System.out.println(array[i]+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length;i++){
            if (array[i]<=50){
                System.out.println(array[i]+ " ");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==1){
                System.out.print(array[i] + " ");
            }
        }

    }
}
