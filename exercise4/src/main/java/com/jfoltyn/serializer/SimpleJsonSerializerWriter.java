package com.jfoltyn.serializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

public class SimpleJsonSerializerWriter implements SerializerWriter {
   public String write(Map<String, Object> map) {
      List<String> jsonKeyValues = new ArrayList<>();
      map.forEach((key, value) -> jsonKeyValues.add(format("\"%s\":\"%s\"", key, value)));
      String jsonKeyValuesJoined = String.join(",\n", jsonKeyValues);

      return "{\n" + jsonKeyValuesJoined + "\n}\n";
   }
}
