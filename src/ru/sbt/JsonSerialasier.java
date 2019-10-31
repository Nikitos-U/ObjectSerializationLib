package ru.sbt;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class JsonSerialasier extends Serialaser {
    public JsonSerialasier() {
    }

    public static <K, V> void SerialaseObject(Object o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Map<K, V> fields = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            fields.put((K) (field.getName()), (V) (field.get(o)));
            System.out.print("\"" + field.getName() + "\"" + ": ");
            if (field.get(o) instanceof Collection) {
                System.out.println("{ \n");
                JsonSerialasier.SerialaseObject(field.get(o));
            }
            System.out.println("\"" + field.get(o) + "\"");
        }
    }
}
