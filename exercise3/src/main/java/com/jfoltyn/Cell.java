package com.jfoltyn;

import java.util.ArrayList;
import java.util.List;

public class Cell {

   private Type type;
   private List<Organelle> organelles = new ArrayList<>();


   public void setType(Type type) {
      this.type = type;
   }


   public void addOrganelle(Organelle organelle) {
      this.organelles.add(organelle);
   }

   @Override
   public String toString() {
      return "Cell{" +
            "type=" + type +
            ", organelles=" + organelles +
            '}';
   }

   enum Type {
      ANIMAL, PLANT
   }
}