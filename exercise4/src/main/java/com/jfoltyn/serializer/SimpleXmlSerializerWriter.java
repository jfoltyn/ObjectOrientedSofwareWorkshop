package com.jfoltyn.serializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

public class SimpleXmlSerializerWriter implements SerializerWriter {
   public String write(Map<String, Object> map) {
      List<String> elements = new ArrayList<>();
      map.forEach((key, value) -> elements.add(format("<%s>%s</%s>", key, value, key)));
      String jsonKeyValuesJoined = String.join("\n", elements);

      return "<object>\n" + jsonKeyValuesJoined + "\n</object>\n";
   }
}
