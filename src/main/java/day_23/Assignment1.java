package day_23;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("input");
        // String input = scanner.nextLine();
        String[] str = {"a", "e", "i", "o", "u"};

    }

    public static void countVowels(String vowels) {
        //String vowels = "a"+"e"+ "i"+ "o"+ "u";
        Scanner scanner = new Scanner(System.in);
        // int vowelCount =0;
        String a = scanner.nextLine();
        for (int i = 0; i < vowels.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                System.out.println("ecef" + vowels);
            }
        }
    }
}
