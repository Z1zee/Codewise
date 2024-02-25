package day_23;

import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bookTitles = {"java Programing ", "Python Basics ", "Algorithms 101 "};
        int[] availableBook = {5, 1, 8};
        displayMethod();
        while (true) {
            System.out.println("Enter your choice: ");
            int option = scanner.nextInt();
            if (option == 1) {
                displayBooks(bookTitles, availableBook);
            } else if (option == 2) {
                borrowBook(bookTitles, availableBook);
            } else if (option == 3) {
                System.out.println("Exiting the library. Thanks for using!");
                break;
            }
        }
        }
        public static void displayBooks (String[]bookTitles,int[] availableCopies){
            for (int i = 0; i < bookTitles.length; i++) {
                System.out.println(bookTitles[i] + "available copies " + availableCopies[i]);
            }
        }
        public static void borrowBook (String[]bookTitles,int[] availableCopies){
            Scanner scanner = new Scanner(System.in);
            System.out.println("what book do you wanna borrow");
            String book = scanner.nextLine();
            boolean bookFound = false;
            for (int i = 0; i < bookTitles.length; i++) {
                if (bookTitles[i].contains(book)) {
                    bookFound = true;
                    availableCopies[i]--;
                    if (availableCopies[i]<0){
                        availableCopies[i] = 0;
                        System.out.println("There are no copies for this book!");
                        break;
                    }
                    System.out.println("you successfully took a book ");
                    break;
                }
            }
            if (!bookFound) {
                System.out.println("book wasn't found");
            }
        }
        public static void displayMethod () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Library manu");
            System.out.println("1 display books");
            System.out.println("2 borrow a book");
            System.out.println("3 exit");
        }
    }

