package com.moltony112;

import java.util.LinkedList;
import java.util.Random;

public class PasswordGenerator {
    public static String generatePassword(int length) {
        LinkedList<Character> chars = new LinkedList<Character>();
        Random random = new Random();

        // add letters
        for (char i = 'A'; i < 'z'; i++)
            chars.add(i);

        // add numbers
        for (char i = '0'; i < '9'; i++)
            chars.add(i);

        // add symbols
        for (char i = '!'; i < '/'; i++)
            chars.add(i);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++)
            builder.append(chars.get(random.nextInt(chars.size())));

        return builder.toString();
    }
}