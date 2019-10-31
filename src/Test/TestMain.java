package Test;

import java.lang.reflect.*;

public class TestMain {
    public static void main(String[] args) {
        SomeClass o = new SomeClass();
        System.out.println(o.getClass());
        Class<?> clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        System.out.println();
    }
}
