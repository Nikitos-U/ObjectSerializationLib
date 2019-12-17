package ru.sbt.JsonSerialiser;

public class JsonPrimitiveSerializer {
    public void serializePrimitive(Object obj, String o) {
        if (o.equals("")) {
            System.out.print('"');
            System.out.print(obj);
            System.out.println('"' + ",");
        } else {
            System.out.print('"' + o + '"' + ": ");
            System.out.print('"');
            System.out.print(obj);
            System.out.println('"' + ",");
        }
    }
}