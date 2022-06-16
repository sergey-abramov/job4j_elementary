package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = i * h;
        return i;
}

    public static void main(String[] args) {
        double i = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + i);
        double i2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + i2);
    }
}
