package ru.geekbrains.lesson5;

public class MainApp {
    public static void main(String[] args) {
        staffcompany Boss = new staffcompany();
        Boss.name = "Иванов И.И.";
        Boss.post = "Босс";
        Boss.cash = 1000;
        Boss.phone = 112211;
        Boss.email = "ivan@gmail.ru";
        Boss.age = 41;

        staffcompany Slave = new staffcompany();
        Slave.name = "Петров П.П.";
        Slave.post = "Подчиненный";
        Slave.cash = 800;
        Slave.phone = 221122;
        Slave.email = "petro@gmail.ru";
        Slave.age = 31;

        Boss.info();
        Slave.info();

        staffcompany [] staff = new staffcompany [5];
        staff[0] = new staffcompany ("Иванов И.И.", "Босс", "ivan@gmail.ru", 112211, 1000, 41);
        staff[1] = new staffcompany ("Петров П.П.", "Подчиненный", "petro@gmail.ru", 221122, 800, 31);
        staff[2] = new staffcompany ("Дроздов Д.Д.", "Подчиненный", "drozd@gmail.ru", 222111, 800, 30);
        staff[3] = new staffcompany ("Сидоров С.С.", "Подчиненный", "sidor@gmail.ru", 111222, 850, 42);
        staff[4] = new staffcompany ("Козлов Д.В.", "Подчиненный", "kozlov@gmail.ru", 111111, 830, 40);
    }
}
