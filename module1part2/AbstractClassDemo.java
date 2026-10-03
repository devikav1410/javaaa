abstract class Vehicle {
    abstract void start();

    void display() {
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle {
    
    void start() {
        System.out.println("Car starts with a key");
    }
}
class Bike extends Vehicle {
    
    void start() {
        System.out.println("Bike starts with a kick");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.display();
        v.start();

        v = new Bike();
        v.display();
        v.start();
    }
}
