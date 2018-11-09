package com.jfoltyn.deserializer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SimpleUnmarshaller {
   private static Map<Class<?>, Function<String, Object>> classToUnmarshaller = new HashMap<>();

   static {
      classToUnmarshaller.put(Boolean.class, s -> s == null ? null : Boolean.parseBoolean(s));
      classToUnmarshaller.put(Boolean.TYPE, Boolean::parseBoolean);
      classToUnmarshaller.put(Byte.class, s -> s == null ? null : Byte.parseByte(s));
      classToUnmarshaller.put(Byte.TYPE, Byte::parseByte);
      classToUnmarshaller.put(Short.class, s -> s == null ? null : Short.parseShort(s));
      classToUnmarshaller.put(Short.TYPE, Short::parseShort);
      classToUnmarshaller.put(Integer.class, s -> s == null ? null : Integer.parseInt(s));
      classToUnmarshaller.put(Integer.TYPE, Integer::parseInt);
      classToUnmarshaller.put(Long.class, s -> s == null ? null : Long.parseLong(s));
      classToUnmarshaller.put(Long.TYPE, Long::parseLong);
      classToUnmarshaller.put(Float.class, s -> s == null ? null : Float.parseFloat(s));
      classToUnmarshaller.put(Float.TYPE, Float::parseFloat);
      classToUnmarshaller.put(Double.class, s -> s == null ? null : Double.parseDouble(s));
      classToUnmarshaller.put(Double.TYPE, Double::parseDouble);
      classToUnmarshaller.put(String.class, s -> s);
   }

   public static Object unmarshall(String string, Class clazz) {
      return classToUnmarshaller.get(clazz).apply(string);
   }
}
