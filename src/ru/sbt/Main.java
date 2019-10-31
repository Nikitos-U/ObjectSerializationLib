package ru.sbt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
/*        SomeClass o = new SomeClass();
        System.out.println(o.getClass());
        Class<?> clazz = o.getClass();
        System.out.println(clazz.getDeclaredFields());*/
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Alex",20,);
        JsonSerialasier.SerialaseObject(person);
    }
}
