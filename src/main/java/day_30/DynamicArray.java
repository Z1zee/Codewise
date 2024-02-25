package day_30;

import day_27.person.Car;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Car> cars = new ArrayList<>();
//
//        int[] array = new int[5];
//        Car[] carsArray = new Car[50];
//
//        System.out.println(list.size());
//        System.out.println(cars.size());
//
//        System.out.println(array.length);
//        System.out.println(carsArray.length);

//        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
//        list.add(1);
//        System.out.println(list.size());
//
//        int[] array = {1,2,3,4,5};


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        Car car1 = new Car();
//        Car car2 = new Car();
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//
//        int[] array = new int[5];
//        array[0] = 1;
//        array[1] = 2;
//        Car car3 = new Car();
//        Car car4 = new Car();
//        Car[] cars2 = new Car[5];
//        cars2[0] = car3;
//        cars2[1] = car4;

        // Part4
//
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
        //part5
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.get(0));
        //part6
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        cars.remove(2);
//        System.out.println(cars);
        //part7
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);
        //pars8
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.size());
        //part 9
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.contains("Ford"));
        //part 10

//        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
//        Integer[] array = new Integer[list.size()];
//        array = list.toArray(array);







    }
    public static int sumOfArray(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i);

        }
        return sum;
    }
}
