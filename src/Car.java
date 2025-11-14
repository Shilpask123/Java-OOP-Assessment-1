//6. Create a class Car with two constructors (constructor overloading). One constructor sets brand to “BMW” and another constructor takes brand name from the user. Print both.

import java.util.*;
public class Car {

    public Car(){
        String brand="BMW";
        System.out.println("Car Brand :"+brand);
    }

    public Car(String brand){
        System.out.println("Car Brand: "+brand);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();
        Car c2=new Car("Audi");
    }
}
