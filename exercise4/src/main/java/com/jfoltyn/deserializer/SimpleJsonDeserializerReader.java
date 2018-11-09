package com.jfoltyn.deserializer;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleJsonDeserializerReader implements SerializerReader {

   public static final String JSON_VALUE_ELEMENT_REGEX = "\"(\\w+)\":\"(\\w+)\"";
   public static final Pattern JSON_VALUE_ELEMENT_PATTERN = Pattern.compile(JSON_VALUE_ELEMENT_REGEX);

   @Override
   public Map<String, String> read(String object) {
      Matcher valueMatcher = JSON_VALUE_ELEMENT_PATTERN.matcher(object);

      Map<String, String> fieldNameToValue = new HashMap<>();
      while (valueMatcher.find()) {
         fieldNameToValue.put(valueMatcher.group(1), valueMatcher.group(2));
      }


      return fieldNameToValue;
   }
}
