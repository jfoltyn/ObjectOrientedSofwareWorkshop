package com.jfoltyn.deserializer;

public class DeserializerFactory {
   public static SimpleDeserializer getJsonSimpleDeserializer() {
      return new SimpleDeserializer(new SimpleJsonDeserializerReader());
   }

   public static SimpleDeserializer getCsvSimpleDeserializer() {
      return new SimpleDeserializer(new SimpleCsvDeserializerReader());
   }

   public static SimpleDeserializer getXmlSimpleDeserializer() {
      return new SimpleDeserializer(new SimpleXmlDeserializerReader());
   }
}
