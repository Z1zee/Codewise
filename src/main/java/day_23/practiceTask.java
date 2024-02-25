package day_23;

public class practiceTask {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        int n = 9;
//        System.out.println(findElement(array, 9));
//        printStr("f");
//        validPassword("hellobathc");
//        int[] array1 = {1,2,3,55,12,14,13,6,7,99};
//        findSumUntil13(array);

    }
    public static boolean findElement(int[] array, int n ){
        for (int i = 0;i< array.length; i++){
            if (array[i] == n){
                return true;
            }
        }
        return false;
    }
    public static void printStr(String str){
        if (str.length()>2){
            System.out.println(str.substring(1,str.length()-1));

        }else {
            System.out.println("too short");
        }


    }
    public static void validPassword(String password){
        System.out.println(password.length()>10 && password.contains("@"));
    }
    public static void findSumUntil13(int[] array){
        int sum = 0;
        for (int i = 0; i< array.length; i++){

            if (array[i]== 13){
                break;

            }
            sum+=array[i];

        }
        System.out.println(sum);
    }
}
