package com.jfoltyn.model;

import java.math.BigDecimal;

public class User {

   private Long id;
   private String firstName;
   private String lastName;
   private String year;
   private BigDecimal fine;

   public User() {
   }

   public User(Long id, String firstName, String lastName, String year, BigDecimal fine) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.year = year;
      this.fine = fine;
   }

   public static User fromCsvRow(String csvRow) {
      String[] csvRowValues = csvRow.split(",");
      User user = new User();
      user.setId(Long.parseLong(csvRowValues[0]));
      user.setFirstName(csvRowValues[1]);
      user.setLastName(csvRowValues[2]);
      user.setYear(csvRowValues[3]);
      user.setFine(new BigDecimal(csvRowValues[4]));
      return user;
   }

   public String toCsvRow() {
      return String.format("%d,%s,%s,%s,%s", id, firstName, lastName, year, fine.toString());
   }

   private void setId(long id) {
      this.id = id;
   }

   private void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   private void setLastName(String lastName) {
      this.lastName = lastName;
   }

   private void setYear(String year) {
      this.year = year;
   }

   private void setFine(BigDecimal fine) {
      this.fine = fine;
   }

   @Override
   public String toString() {
      return "User{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", year='" + year + '\'' +
            ", fine=" + fine +
            '}';
   }
}
