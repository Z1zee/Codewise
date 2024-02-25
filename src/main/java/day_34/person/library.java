package day_34.person;

import java.util.ArrayList;

public class library {
    ArrayList<person> libraryMembers = new ArrayList<>();

    public void addMembers(person person){
        libraryMembers.add(person);
        System.out.println(person.name + " is a new members");
    }
     public void displayMembers(){
         for (person i:libraryMembers){
             System.out.println(i.name);
             System.out.println(i.age);
         }
     }
}
