package com.jfoltyn;

import com.jfoltyn.deserializer.DeserializerFactory;
import com.jfoltyn.deserializer.SimpleDeserializer;
import com.jfoltyn.serializer.SerializerFactory;
import com.jfoltyn.serializer.SimpleSerializer;

import java.lang.reflect.InvocationTargetException;

class Main {

   public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
      SampleUserModel user = new SampleUserModel("Tom", "Anderson", "Neo", 47);
      System.out.println("Object to serialize: " + user);
      System.out.println("============================================================================================");

      SimpleSerializer jsonSerializer = SerializerFactory.getJsonSimpleSerializer();
      SimpleSerializer csvSerializer = SerializerFactory.getCsvSimpleSerializer();
      SimpleSerializer xmlSerializer = SerializerFactory.getXmlSimpleSerializer();

      System.out.println("To JSON");
      String serializedJson = jsonSerializer.serialize(user);
      System.out.println(serializedJson);

      System.out.println("To CSV");
      String serializedCsv = csvSerializer.serialize(user);
      System.out.println(serializedCsv);

      System.out.println("To XML");
      String serializedXml = xmlSerializer.serialize(user);
      System.out.println(serializedXml);

      System.out.println("============================================================================================");
      System.out.println("Deserialization");
      SimpleDeserializer jsonDeserializer = DeserializerFactory.getJsonSimpleDeserializer();
      SimpleDeserializer csvDeserializer = DeserializerFactory.getCsvSimpleDeserializer();
      SimpleDeserializer xmlDeserializer = DeserializerFactory.getXmlSimpleDeserializer();


      System.out.println("From JSON");
      SampleUserModel deserializeJson = jsonDeserializer.deserialize(serializedJson, SampleUserModel.class);
      System.out.println(deserializeJson);

      System.out.println("From CSV");
      SampleUserModel deserializeCsv = csvDeserializer.deserialize(serializedCsv, SampleUserModel.class);
      System.out.println(deserializeCsv);

      System.out.println("From XML");
      SampleUserModel deserializeXml = xmlDeserializer.deserialize(serializedXml, SampleUserModel.class);
      System.out.println(deserializeXml);
   }
}
