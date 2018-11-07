package com.jfoltyn;

public class SampleUserModel {
   private String firstName;
   private String lastName;
   private String nick;
   private int age;

   public SampleUserModel() {
   }

   public SampleUserModel(String firstName, String lastName, String nick, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.nick = nick;
      this.age = age;
   }

   @Override
   public String toString() {
      return "SampleUserModel{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", nick='" + nick + '\'' +
            ", age=" + age +
            '}';
   }
}
