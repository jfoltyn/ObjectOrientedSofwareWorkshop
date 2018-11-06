package com.jfoltyn;

class Main {

   public static void main(String[] args) {
      Cell animalCell = new AnimalCellBuilder()
            .cellMembrane(new CellMembrane())
            .nucleus(new Nucleus())
            .addVacuole(new Vacuole())
            .addVacuole(new Vacuole())
            .build();

      Cell plantCell = new PlantCellBuilder()
            .cellMembrane(new CellMembrane())
            .nucleus(new Nucleus())
            .addVacuole(new Vacuole())
            .addVacuole(new Vacuole())
            .cellWall(new CellWall())
            .chloroplast(new Chloroplast())
            .build();

      System.out.println(animalCell);
      System.out.println(plantCell);
   }
}
