package day_20;

import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int books = 5;
        String [] students = {"Mike","Joe","Ann","Sara","Alber"};
        int[] studentsBooks = {0,0,0,0,0};
        String answer;
        System.out.println("whelcome to the library");
        do {
            System.out.println("we have 5 books left");
            System.out.println("Whats is your student id");
            int studentId = scanner.nextInt();
            System.out.println("how many books do you wanna borrow?");
            int bookstoSelect = scanner.nextInt();
            if (studentId>=0&& studentId<=4);{
            books = bookstoSelect;
                System.out.println("we have"+(books - bookstoSelect)+ "to left");
                System.out.println("Do you want to continue (yes/no)");
                answer = scanner.next();
            }

        }while (answer.equalsIgnoreCase("yes"));
    }
}
