package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < array.length; i++) {
            for (int j = i; j <= finish; j++) {
                if (min > array[j]) {
                    min = array[j];
                }

            }

        }
        return min;
    }
}
