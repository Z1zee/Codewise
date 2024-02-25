package day_22;

public class methods {
    public static void main(String[] args) {
        hello( "Mike");
        System.out.println(addTwoNumbers1(5,10));
        addTwoNumber2(5,20);

    }
    public static int addTwoNumbers1(int a, int b){
        return a+b;


    }
    public static void  addTwoNumber2(int a,int b){
        System.out.println(a+b);
    }
    public static void hello (String name){
        System.out.println("hello " + name);

    }
}
