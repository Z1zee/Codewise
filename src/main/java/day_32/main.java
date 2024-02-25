package day_32;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store("Fashion Store");
        System.out.println("1. Add an item");
        System.out.println("2. Update an item");
        System.out.println("3. remove an item");
        System.out.println("4. display an item");
        System.out.println("5. Exit");
        while (true){
        System.out.println("Choose option");
        int option = scanner.nextInt();
        if (option==1){
            System.out.println("Enter item ID: ");
            int id = scanner.nextInt();
            System.out.println("Enter item name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter item price: ");
            double price = scanner.nextDouble();
            System.out.println("Enter item quantity: ");
            int quantity = scanner.nextInt();
            Item item = new Item(id,name,price,quantity);

            store.addItem(item);
        }
            else if (option == 2) {
            System.out.println("Enter item ID to update: ");
            int id = scanner.nextInt();
            System.out.println("Enter new name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter new price");
            int price = scanner.nextInt();
            System.out.println("Enter new quantity");
            int quantity = scanner.nextInt();

            store.updateItem(id,name,price,quantity);
            }
            else if (option == 3) {
            System.out.println("Enter item ID to remove: ");
            int id = scanner.nextInt();

            store.removeItem(id);
            }
            else if (option == 4) {
              store.displayInventory();
            }
            else if (option == 5) {
             break;
            }

        }






//        Item item1 = new Item(1,"T-Shirt",10,20);
//        Item item2 = new Item(2,"Shir",1,2);
//        Item item3 = new Item(3,"Pants",13,30);
//        Item item4 = new Item(4,"Jacket",20,40);
//
//        store.addItem(item1);
//        store.addItem(item2);
//        store.addItem(item3);
//        store.addItem(item4);
//        System.out.println(store.inventory.size());
//        store.removeItem(1);
//        System.out.println(store.inventory.size());
//        //store.updateItem(2,"laptop",700,10);
//        store.displayInventory();



    }
}
