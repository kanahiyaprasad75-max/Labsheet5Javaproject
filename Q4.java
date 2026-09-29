class Animal {

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Q4AnimalDog {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
