package ru.sbt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Person {
    String name;
    int age;
    //HashMap<String,Object> address;
    ArrayList<Integer> address;

    public Person(String name, int age,ArrayList<Integer> address/*HashMap<String,Object> address*/) {
        this.name = name;
        this.age = age;
        this.address = address;

    }
}
