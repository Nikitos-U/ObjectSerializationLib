package ru.sbt;

import java.util.HashMap;

public class Person {
    String name;
    int age;
    HashMap<String,Object> address;

    public Person(String name, int age,HashMap<String,Object> address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }
}
