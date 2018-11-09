package com.jfoltyn.deserializer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

public class SimpleDeserializer {

   private SerializerReader reader;

   SimpleDeserializer(SerializerReader reader) {
      this.reader = reader;
   }

   public <T> T deserialize(String obj, Class<T> objClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

      T newInstance = objClass.getConstructor().newInstance();

      Map<String, String> valuesMap = reader.read(obj);

      Field[] declaredFields = objClass.getDeclaredFields();
      Arrays.stream(declaredFields).forEach(field -> {
         try {
            setObjectValue(newInstance, valuesMap, field);
         } catch (IllegalAccessException e) {
            e.printStackTrace();
         }
      });

      return newInstance;
   }

   private void setObjectValue(Object newInstance, Map<String, String> valuesMap, Field field) throws IllegalAccessException {
      field.setAccessible(true);
      String fieldName = field.getName();
      Object unmarshalledObject = SimpleUnmarshaller.unmarshall(valuesMap.get(fieldName), field.getType());
      field.set(newInstance, unmarshalledObject);
   }
}
