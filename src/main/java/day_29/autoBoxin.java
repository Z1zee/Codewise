package day_29;

public class autoBoxin {
    public static void main(String[] args) {
        //autoboxing process
        //conversion done by JVM
        //conversion from primitive to Wrapper
        int num = 10;
        int num1 = num;

        //automatic unboxing
        //conversion done by JVM
        //conversion from wrapper to primitive
        Integer num3 = 25;
        int num4 = num3;

        //unboxing
        //We do manually conversion
        Integer num5 = 35;
        int num6 = num5.intValue();

        //boxing
        //We do manually conversion
        int num7 = 99;
        Integer num8 = Integer.valueOf(num7);
    }
}
