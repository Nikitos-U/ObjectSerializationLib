package ru.sbt;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectStructureGetter<T extends Object> {
    private Object o;

    public Map getObjectStructure(T o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Map<String, Object> fields = new HashMap();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            fields.put((String) field.getName(), field.get(o));
        }
        return fields;
    }

}
