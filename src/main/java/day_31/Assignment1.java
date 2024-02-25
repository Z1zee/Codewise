package day_31;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> number = new ArrayList<>();
//        System.out.println("enter number");
//        for (int i = 0; i < 5; i++) {
//            int num = scanner.nextInt();
//            number.add(num);
//        }
//        for (int i = number.size()-1; i >=0 ; i--) {
//            System.out.println(number.get(i));
//        }
        //task2
//        ArrayList<String> word = new ArrayList<>();
//        System.out.println("enter 4 words");
//        for (int i = 0; i < 4; i++) {
//            String name = scanner.nextLine();
//            word.add(name);
//
//        }
//        HashSet<String> hs = new HashSet<>(word);
//
//        for (String name:hs) {
//            System.out.println(name);
//        }
        //task3
//        ArrayList<Integer> number = new ArrayList<>();
//        System.out.println("enter number");
//        int sum = 0;
//        int ave = 0;
//        for (int i = 0; i < 5; i++) {
//            int num = scanner.nextInt();
//            number.add(num);
//            sum += number.get(i);
//            ave = sum/ number.size();
//        }
//        System.out.println("Sum: "+sum);
//        System.out.println("Average: "+ave);
//task4
        Set<Integer> number = new HashSet<>();
        System.out.println("Enter number");
        int count = 0;
        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            if(number.contains(num)){
                count++;
            } else {
            number.add(num);}
        }
        System.out.println(count);

            System.out.println(number);
        //task5
//        ArrayList<Integer> number = new ArrayList<>(List.of(1,2,33,12,9));
//        for (int i = 0; i < number.size(); i++) {
//             number.set(i, number.get(i) * 5);
//        }
//        System.out.println(number);
    }
}
