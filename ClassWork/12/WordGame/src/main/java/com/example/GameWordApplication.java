package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class GameWordApplication {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        var chars = scanner.nextLine();

        var result = 0;
        var text = scanner.nextLine();
        var history = new HashSet<String>();

        while (!"".equals(text)) {
            if (checkContains(text, chars)) {
                if (history.add(text)) {
                    result += text.length();
                } else {
                    System.out.println("Вы ввели повторное слово");
                }
            } else {
                System.out.println("Вы ввели неправильное слово");
            }

            text = scanner.nextLine();
        }

        System.out.println(result);
        System.out.println(history);
    }

    private static boolean checkContains(String text, String chars) {
        for (var i = 0; i < text.length(); i++) {
            var c = text.charAt(i);

            var index = chars.indexOf(c);
            if (index < 0) {
                return false;
            }
        }

        return true;
    }
}
