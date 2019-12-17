package ru.sbt;

import ru.sbt.JsonSerialiser.JsonSerializer;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> checkList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            checkList.add(scanner.nextInt());
        }
        Person person = new Person("Alex",20, checkList);
        Serializer serializer = new JsonSerializer();
        serializer.serialize(person);
        serializer.serialize(checkList);
    }
}
