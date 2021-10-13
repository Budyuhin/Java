package ru.geekbrains.lesson6;

public class Cat extends Animal {
    public Cat(String name, int age, int distance) {
        this.name = name;
        this.age = age;
        this.distance = distance;
    }

    @Override
    public void run() {
        int distance = 200;
        System.out.println(name + " пробежал" + " " + distance);
    }

    @Override
    public void swim() {
//        this.distance = distance;
        if (distance >= 0) {
            System.out.println(name + " не умеет плавать");
        }
    }
}
