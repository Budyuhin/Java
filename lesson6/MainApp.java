package ru.geekbrains.lesson6;

public class MainApp {

    public static void main(String[] args) {

        Cat cat = new Cat("Тимоша", 7, 150);
        cat.run();
        cat.swim();

        Dog dog = new Dog ("Белка", 8, 150);
        dog.run();
        dog.swim();
    }
}


