package com.example;

import java.util.Scanner;

public class NameGeneratorApplication {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        var nameGenerator = new NameGenerator();

        var name = scanner.nextLine();
        while (!"".equals(name)) {
            nameGenerator.addName(name);
            name = scanner.nextLine();
        }

        name = nameGenerator.getName();
        while (!"".equals(name)) {
            System.out.println(name);
            name = nameGenerator.getName();
        }
    }
}
