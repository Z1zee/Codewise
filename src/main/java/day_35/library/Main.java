package day_35.library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book1","Author1");
        Book book2 = new Book("Book2", "Author2");
        DVD dvd1 = new DVD("DVD1","Director1");

        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(dvd1);
        library.deleteItem("Book1");
        library.updateBook("book3","author2");
        library.updateDVD("DVD1", "Directory2");
        System.out.println(library.Item.size());

        library.displayItems();
    }
}
