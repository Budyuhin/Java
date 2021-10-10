package ru.geekbrains.lesson5;

public class staffcompany {
    public String name;
    public String post;
    public String email;
    public int phone;
    public int cash;
    public int age;

    public void info(){
        System.out.println(name + " " + post + " " + email + " " + phone);
    }

    public staffcompany() {

    }

    public staffcompany (String name, String post, String email, int phone, int cash, int age) {
        if (age > 40) {
            System.out.println(name + " " + post + " " + email + " " + phone + " " + cash + " " + age);
        }
    }
}
