package com.jfoltyn.serializer;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleSerializer {

   private SerializerWriter writer;

   SimpleSerializer(SerializerWriter writer) {
      this.writer = writer;
   }

   public String serialize(Object obj) {
      Map<String, Object> valuesMap = buildFieldValuesMap(obj);
      return writer.write(valuesMap);
   }

   private Map<String, Object> buildFieldValuesMap(Object obj) {
      Field[] declaredFields = obj.getClass().getDeclaredFields();

      Map<String, Object> valuesMap = Arrays.stream(declaredFields)
            .collect(Collectors.toMap(Field::getName, field -> getFieldValue(field, obj)));

      return valuesMap;
   }

   private Object getFieldValue(Field field, Object obj) {
      try {
         field.setAccessible(true);
         return field.get(obj);
      } catch (IllegalAccessException e) {
         e.printStackTrace();
      }
      return null;
   }
}
