package ru.sbt.JsonSerialiser;

import ru.sbt.Serializer;

public class JsonNestedObjectSerializer {
    public void serializeNestedObj(Object obj, String o) throws IllegalAccessException {
        System.out.print('"' + o + '"' + ": ");
        System.out.println("{");
        Serializer serializer = new JsonSerialiserDecorator();
        ((JsonSerialiserDecorator) serializer).serializeJsonObject(obj);
        System.out.println("}");
    }
}