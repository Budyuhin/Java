package ru.geekbrains.lesson6;

public class Animal {
    String name;
    protected String color;
    protected int weight;
    protected int height;
    int age;
    int distance;

    public void run (){
        System.out.println(name + " пробежало" + " " + distance);
    }

    public void swim (){
        System.out.println(name + " поплыло" + " " + distance);
    }

}
