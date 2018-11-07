package com.jfoltyn.serializer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleCsvSerializerWriter implements SerializerWriter {
   public String write(Map<String, Object> map) {
      List<String> valuesStrings = map.values().stream()
            .map(Object::toString)
            .collect(Collectors.toList());
      return String.join(",", map.keySet()) + "\n" + String.join(",", valuesStrings) + "\n";
   }
}
