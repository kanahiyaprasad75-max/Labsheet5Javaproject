class Vehicle {

    public void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {

    public void drive() {
        System.out.println("Car is driving.");
    }
}

interface Electric {

    void chargeBattery();
}

class ElectricCar extends Car implements Electric {

    @Override
    public void chargeBattery() {
        System.out.println("Electric car is charging.");
    }
}

public class Q18ElectricCar {
    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();

        car.start();
        car.drive();
        car.chargeBattery();
    }
}
