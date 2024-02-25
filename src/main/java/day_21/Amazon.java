package day_21;

import java.util.Arrays;
import java.util.Scanner;

public class Amazon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productName = new String[3];
        double[] productPrice = new double[3];
        int currentInventory = 0;
        int count = 0;
        System.out.println("Welcome to Amazon Cart Tracker!");
        System.out.println("1. Add New Product");
        System.out.println("2. Display Current Inventory");
        System.out.println("3. Remove all products");
        System.out.println("4. Exit");
        while (true) {
            System.out.println("choose ");
            int oper = scanner.nextInt();
            if (oper == 1) {
                scanner.nextLine();
                System.out.println("enter the product name");
                String product = scanner.nextLine();
                productName[count] = product;
                System.out.println("enter the product price");
                double price = scanner.nextDouble();
                productPrice[count] = price;
                count++;
            }
            else if (oper == 2) {
                System.out.println("Current inventory:");
                for(int i = 0 ; i< count; i++){
                    System.out.println(productName[i]+ " - "+ productPrice[i]);
                }
            }  else if (oper == 3) {
                for (int i = 0; i < productPrice.length; i++){
                    productName[i] = null;
                    productPrice[i] = 0;
                }
                count = 0;
                System.out.println("All items have been removed from the cart!");
            } else  {
                System.out.println("Program completed. Goodbye!");
                break;
            }


        }

    }

}