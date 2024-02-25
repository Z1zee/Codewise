package day_22;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
// task1
//        System.out.println("num1");
//        int a = scanner.nextInt();
//        System.out.println("num2");
//        int b = scanner.nextInt();
//        System.out.println(calculateSum(a,b));
        //System.out.println("num1");
//        int a =scanner.nextInt();
//        System.out.println("num2");
//        int b = scanner.nextInt();
//        System.out.println(a+b);
//        System.out.println("add a name");
//        String str = scanner.nextLine();
//        System.out.println(upperCaseStr(str));
//        String str = scanner.nextLine();
//        System.out.println(str.toUpperCase());
//        System.out.println("num1");
//        int a = scanner.nextInt();
//        System.out.println("num2");
//        int b = scanner.nextInt();
//        System.out.println((a/b) * 10  );
//        System.out.println("num1");
//        int n = scanner.nextInt();
//        isEven(n);
        System.out.println("num1");
        double a = scanner.nextDouble();
        System.out.println(a * 100);


    }
    public static int calculateSum(int a, int b){
        return a+b;
    }
    // task2
    public static void calculateSum1(int a, int b) {
        System.out.println(a + b);
    }
    //task3
    public static String upperCaseStr(String str){
        return str.toUpperCase();
    }
    public static void upperCaseStr1(String str1){
        System.out.println(str1.toUpperCase());
    }
    public static int calculateSum2(int a, int b){
        return a+b;
    }
    public  static void isEven(int n){
        if (n % 2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static double double1 (double a , double b){
        return a +b;
    }

}
