package day_35.library;

public class DVD extends LibraryItem{
    public String director;
    public DVD(String title, String director) {
        super(title);
        this.director = director;
    }
}
