package day_22;

import java.util.Arrays;

public class PracticeTask {
    public static void main(String[] args) {
        name();
        task2();
        task3("mike");
        System.out.println(task4(5,10));
        System.out.println(task5(5,20));
        System.out.println(upperCase("hi"));
        System.out.println(task6 (3));
        System.out.println(task7("hello"));
        int[] array = {100,2,33,44,4};
        System.out.println(largestNArray(array));

    }
    public static void name(){
        System.out.println("hello,world");
    }
    public static void task2(){
        for (int i =1; i<=10;i++);
        System.out.println("hello,world");
    }
    public static void task3(String name){
        for (int i = 1; i <=10;i++)
            System.out.println("hello,world3"+name);

    }

    public static int task4(int a, int b){
        return a+b;
    }

    public static int task5(int a,int b){
       // return (a>b) ? a:b;
        if (a>b){
            return a;
        }else
            return b;

    }
    public static String upperCase(String str){
        return str.toUpperCase();

    }
    public static String task6(int a ){
        if (a% 2==0){
        return "even";
        }else{
            return "odd";
        }
    }
    public static int task7(String name5){
        return name5.length();

    }
    public static int largestNArray(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
}
