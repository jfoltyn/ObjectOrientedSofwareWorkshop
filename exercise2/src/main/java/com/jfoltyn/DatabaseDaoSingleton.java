package com.jfoltyn;

import com.jfoltyn.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DatabaseDaoSingleton {

   private static final String USERS_TABLE_RESOURCE = "users_table";

   private static DatabaseDaoSingleton instance;
   private final File USERS_TABLE;

   private DatabaseDaoSingleton() {
      ClassLoader classLoader = Main.class.getClassLoader();
      USERS_TABLE = new File(classLoader.getResource(USERS_TABLE_RESOURCE).getFile());
   }

   static DatabaseDaoSingleton getDatabaseDaoInstance() {
      if (instance == null)
         instance = new DatabaseDaoSingleton();
      return instance;
   }

   List<User> getUsers() {
      System.out.println("  + DatabaseDaoSingleton.getUsers");
      List<User> result = new ArrayList<>();

      try (Scanner scanner = new Scanner(USERS_TABLE)) {
         while (scanner.hasNext()) {
            result.add(User.fromCsvRow(scanner.nextLine()));
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }

      return result;
   }

   void insertUser(User user) throws IOException {
      System.out.println("  + DatabaseDaoSingleton.insertUser");
      Files.write(USERS_TABLE.toPath(), (user.toCsvRow() + "\n").getBytes(), StandardOpenOption.APPEND);
   }

}
