class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

public class Q13AnimalSound {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
