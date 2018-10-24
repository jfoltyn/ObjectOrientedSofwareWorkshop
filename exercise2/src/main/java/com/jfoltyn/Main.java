package com.jfoltyn;

import com.jfoltyn.model.User;

import java.io.IOException;
import java.math.BigDecimal;

import static com.jfoltyn.DatabaseDaoSingleton.getDatabaseDaoInstance;
import static java.lang.Math.random;

class Main {

   public static void main(String[] args) throws IOException {
      System.out.println("Database at the beginning of run");
      System.out.println(getDatabaseDaoInstance().getUsers());

      getDatabaseDaoInstance().insertUser(getRandomUser());
      getDatabaseDaoInstance().insertUser(getRandomUser());
      getDatabaseDaoInstance().insertUser(getRandomUser());

      System.out.println("\n#############################\n");

      System.out.println("Database at the end of run");
      System.out.println(getDatabaseDaoInstance().getUsers());
   }

   private static User getRandomUser() {
      long random = (long) (random() * 1000000);
      return new User(random, "RandomName" + random, "RandomLastName" + random, "966", new BigDecimal(random));
   }
}
