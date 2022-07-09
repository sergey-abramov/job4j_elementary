package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int temp = word[i];
            word[i] = word[word.length - i - 1];
            if (post[post.length - 1 - i] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
