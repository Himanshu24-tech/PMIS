// Problem statement:
// Create a Java program using inheritance with two classes: Animal and Dog.
// Requirements:
// 1. Create a parent class Animal with:
// - A variable String name.
// - A method eat() that prints "Animal is eating".
// 2. Create a child class Dog that extends Animal with:
// - A method bark() that prints "Dog is barking".
// 3. In the main() method:
// - Create an object of Dog.
// - Assign "Tommy" to its name.
// - Print the dog's name.
// - Call both eat() and bark().

class Animal2 {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class problem_inheri1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Tommy";
        System.out.println("Dog's name: " + dog.name);
        dog.eat();
        dog.bark();
    }
}