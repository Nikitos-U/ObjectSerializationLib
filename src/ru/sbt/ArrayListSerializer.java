package ru.sbt;

import ru.sbt.JsonSerialiser.JsonArraySerializer;

import java.util.ArrayList;

public class ArrayListSerializer<T extends Object> {
        public void serializeArrayList(ArrayList<T> list) throws IllegalAccessException {
            JsonArraySerializer serializer = new JsonArraySerializer();
            serializer.SerializeArray(list.toArray(), list.toString());
        }
    }

