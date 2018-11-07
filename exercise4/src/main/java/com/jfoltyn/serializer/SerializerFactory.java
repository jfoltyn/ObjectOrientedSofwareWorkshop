package com.jfoltyn.serializer;

public class SerializerFactory {
   public static SimpleSerializer getJsonSimpleSerializer() {
      return new SimpleSerializer(new SimpleJsonSerializerWriter());
   }

   public static SimpleSerializer getCsvSimpleSerializer() {
      return new SimpleSerializer(new SimpleCsvSerializerWriter());
   }

   public static SimpleSerializer getXmlSimpleSerializer() {
      return new SimpleSerializer(new SimpleXmlSerializerWriter());
   }
}
