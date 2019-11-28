package com.example;

import java.util.HashSet;

public class NameGenerator {
    private HashSet<String> names = new HashSet<String>();

    public void addName(String name) {
        this.names.add(name);
    }

    public String getName() {
        var name = getFirstElement();
        names.remove(name);
        return name;
    }

    private String getFirstElement() {
        for (var name : names) {
            return name;
        }
        return "";
    }
}
