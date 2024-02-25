package day_35.library;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem>Item = new ArrayList<>();
    public void addLibraryItem(LibraryItem item){
        Item.add(item);
        System.out.println(item.title + " is added!!!" );
    }

    public void displayItems(){
        for(LibraryItem i: Item){
            System.out.println(i.title);
            if(i instanceof Book){
                Book book = ((Book)i);
                System.out.println(book.author);
            }
            else{
                DVD dvd = ((DVD)i);
                System.out.println(dvd.director);
            }
        }
    }

    public void deleteItem(String title){
        for (int i = 0; i < Item.size(); i++) {
            if (Item.get(i).title.equals("Book1")){
                Item.remove(i);
            }
            System.out.println(Item.size());
        }
        }
    public void updateBook(String title, String author){
        for (int i = 0; i < Item.size(); i++) {
             if (Item.get(i).title==title){
             }System.out.println(Item.size());
        }


    }
    public void updateDVD(String title, String director){
        DVD dvd = new DVD(title, director);
        dvd.title = title;
        dvd.director = director;
    }



}

