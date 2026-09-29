class Vehicle {

    public void start() {
        System.out.println("Vehicle starts.");
    }

    public void stop() {
        System.out.println("Vehicle stops.");
    }
}

class Car extends Vehicle {

    public void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {

    public void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }
}

public class Q9VehicleCarElectricCar {
    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();

        car.start();
        car.drive();
        car.chargeBattery();
        car.stop();
    }
}
