class Animal {

    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {

    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class Q10AnimalDogCat {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog:");
        dog.eat();
        dog.bark();

        System.out.println("\nCat:");
        cat.eat();
        cat.meow();
    }
}
