class Calculator {

    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}


class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: " + calc.add(10, 20));

        System.out.println("Addition of 3 integers: " + calc.add(10, 20, 30));

        System.out.println("Addition of 2 doubles: " + calc.add(10.5, 20.5));

        Animal pet1 = new Dog();
        Animal pet2 = new Cat();
        Animal pet3 = new Animal();

        System.out.println();

        pet1.makeSound();
        pet2.makeSound();
        pet3.makeSound();
    }
}