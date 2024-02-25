package day_36;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
//        String str1 = "bored";
//        String str2 = "robed";
//
//        if (str1.length()!=str2.length()){
//            System.out.println(false);
//        }
//        else {
//            char[] ch1 = str1.toCharArray(); // [b,o,r,e,d]
//            char[] ch2 = str1.toCharArray(); // [r,o,b,e,d]
//            Arrays.sort(ch1);// [b,o,r,e,d]
//            Arrays.sort(ch2);// [r,o,b,e,d]
//            System.out.println(Arrays.equals(ch1,ch2));
//        }
        String str1 = "hello hello hello b eat eat";
        String [] array = str1.split(" ");
        //System.out.println(Arrays.toString(s));
        HashMap<String, Integer> map = new HashMap<>();
        for (String i:array) {
            if (map.containsKey(i)) {
                map.put(i,1);

            }else {
                map.replace(i,map.get(i) +1);
            }
        }
        System.out.println(map);

    }
}
