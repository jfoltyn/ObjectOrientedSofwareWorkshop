package com.jfoltyn.deserializer;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleXmlDeserializerReader implements SerializerReader {

   public static final String XML_VALUE_ELEMENT_REGEX = "<(\\w+)>(\\w+)</\\1>";
   public static final Pattern XML_VALUE_ELEMENT_PATTERN = Pattern.compile(XML_VALUE_ELEMENT_REGEX);

   @Override
   public Map<String, String> read(String object) {
      Matcher valueMatcher = XML_VALUE_ELEMENT_PATTERN.matcher(object);

      Map<String, String> fieldNameToValue = new HashMap<>();
      while (valueMatcher.find()) {
         fieldNameToValue.put(valueMatcher.group(1), valueMatcher.group(2));
      }


      return fieldNameToValue;
   }
}
