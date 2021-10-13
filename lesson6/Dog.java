package ru.geekbrains.lesson6;

public class Dog extends Animal {
    public Dog (String name, int age, int distance) {
        this.name = name;
        this.age = age;
        this.distance = distance;
    }
    @Override
    public void run() {
        int distance = 500;
        System.out.println(name + " пробежала" + " " + distance);
    }
    @Override
    public void swim() {
        int distance = 10;
        System.out.println(name + " проплыла" + " " + distance);
    }
}
