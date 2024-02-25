package day_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class practiceTask {
    public static void main(String[] args) {
//        //Task 1
//        Random random = new Random();
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(fillRandom(list));
//    }
//    public static ArrayList<Integer> fillRandom (ArrayList<Integer> list){
//        Random random = new Random();
//        for (int i = 0; i <=10; i++) {
//            int r = random.nextInt(10,50);
//            list.add(r);
//        }
//        return list;


        //task 2
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(add10(list1));
    }

    public static ArrayList<Integer> add10(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if(list.get(i) % 2 ==0){
                list.add(i+1,10);
                System.out.println(list);
            }
        }
        return list;
    }
}
