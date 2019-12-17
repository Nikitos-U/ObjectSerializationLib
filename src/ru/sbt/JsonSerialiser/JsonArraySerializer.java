package ru.sbt.JsonSerialiser;

import ru.sbt.Serializer;

public class JsonArraySerializer<T extends Object> {
    public void SerializeArray(T[] o, String obj) throws IllegalAccessException {
        System.out.print('"' + obj.toString() + '"' + ": ");
        System.out.println("{");
        for (T t : o) {
            System.out.print("\t");
            ru.sbt.Serializer serializer = new JsonSerializer<>();
            serializer.serialize(t);
        }
        System.out.println("},");
    }
}