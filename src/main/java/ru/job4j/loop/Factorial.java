package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int multiple = 1;
        if (n > 0) {
            for (n = 1; n <= 5; n++) {
            multiple = multiple * n;
            }
        }
        int result = multiple;
        return result;
    }
}
