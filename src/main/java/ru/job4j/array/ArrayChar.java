package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[0] == word[0]) {
                result = pref[i] == word[i];
            }
        }
        return result;
    }
}
