package day_31;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> integers =new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        System.out.println(integers.size());
    }
}
