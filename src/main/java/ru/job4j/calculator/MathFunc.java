package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int result3 = MathFunc.func1(100);
        int total1 = result1 + result2;
        int total2 = result1 + result3;
        int total3 = result2 + result3;
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
}
