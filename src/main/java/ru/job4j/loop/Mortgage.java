package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double credit = amount * percent / 100 + amount;
        while (credit >= salary) {
            credit -= salary;
            year += 1;
        }
        return year;
    }
}
