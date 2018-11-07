package com.jfoltyn;

import com.jfoltyn.serializer.SerializerFactory;
import com.jfoltyn.serializer.SimpleSerializer;

class Main {

   public static void main(String[] args) {
      SampleUserModel user = new SampleUserModel("Tom", "Anderson", "Neo", 47);
      System.out.println("Object to serialize: " + user);
      System.out.println("============================================================================================");

      SimpleSerializer jsonSerializer = SerializerFactory.getJsonSimpleSerializer();
      SimpleSerializer csvSerializer = SerializerFactory.getCsvSimpleSerializer();
      SimpleSerializer xmlSimpleSerializer = SerializerFactory.getXmlSimpleSerializer();

      System.out.println(jsonSerializer.serialize(user));
      System.out.println(csvSerializer.serialize(user));
      System.out.println(xmlSimpleSerializer.serialize(user));
   }
}
