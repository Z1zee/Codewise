package day_36;

public class Overloading {
    public static void main(String[] args) {

    }
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public void sum (int a,int b, int c){
        System.out.println(a+b+c);
    }public void sum (double a,double b){
        System.out.println(a+b);
    }
    public void sum(double a,double b,String str){
        System.out.println(a+b+str);
    }
}

