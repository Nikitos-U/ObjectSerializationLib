package ru.sbt.JsonSerialiser;

import ru.sbt.JsonSerialiser.JsonArraySerializer;
import ru.sbt.Serializer;

public class JsonSerializer<T extends Object> extends Serializer {

    @Override
    public void serializeNestedObject(Object obj, String o) throws IllegalAccessException {
        JsonNestedObjectSerializer jsonNestedObjSerializer = new JsonNestedObjectSerializer();
        jsonNestedObjSerializer.serializeNestedObj(obj, o);
    }

    @Override
    public void serializeArray(Object[] o, String obj) throws IllegalAccessException {
        JsonArraySerializer jsonArraySerializer = new JsonArraySerializer();
        jsonArraySerializer.SerializeArray(o, obj);
    }

    @Override
    public void serializePrimitive(Object obj, String o) {
        JsonPrimitiveSerializer JsonprimitiveSerializer = new JsonPrimitiveSerializer();
        JsonprimitiveSerializer.serializePrimitive(obj, o);
    }
}