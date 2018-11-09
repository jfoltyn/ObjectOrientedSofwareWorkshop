package com.jfoltyn.deserializer;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleCsvDeserializerReader implements SerializerReader {
   @Override
   public Map<String, String> read(String object) {

      String[] rows = object.split("\n");
      String[] keys = rows[0].split(",");
      String[] values = rows[1].split(",");

      Map<String, String> fieldNameToValue = IntStream.range(0, keys.length)
            .boxed()
            .collect(Collectors.toMap(i -> keys[i], i -> values[i]));

      return fieldNameToValue;
   }
}
