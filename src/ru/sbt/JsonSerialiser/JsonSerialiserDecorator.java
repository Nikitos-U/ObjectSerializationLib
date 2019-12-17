package ru.sbt.JsonSerialiser;

import ru.sbt.ObjectStructureGetter;
import ru.sbt.Serializer;

import java.util.HashMap;
import java.util.Map;

public class JsonSerialiserDecorator extends JsonSerializer {
    public void serializeJsonObject(Object obj) throws IllegalAccessException {
        ObjectStructureGetter objectStructureGetter = new ObjectStructureGetter();
        Map fields = new HashMap();
        fields = objectStructureGetter.getObjectStructure(obj);
        ru.sbt.Serializer serializer = new JsonSerializer<>();
        for (Object o : fields.keySet()) {
            System.out.print("\t" + '"' + o + '"' + ':' + ' ');
            serializer.serialize(fields.get(o));
        }
    }
}