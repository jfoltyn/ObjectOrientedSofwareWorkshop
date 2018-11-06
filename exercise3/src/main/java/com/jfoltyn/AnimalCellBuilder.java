package com.jfoltyn;

public class AnimalCellBuilder extends CellBuilder {

   @Override
   public AnimalCellBuilder cellMembrane(CellMembrane cellMembrane) {
      this.cellMembrane = cellMembrane;
      return this;
   }

   @Override
   public AnimalCellBuilder nucleus(Nucleus nucleus) {
      this.nucleus = nucleus;
      return this;
   }

   @Override
   public AnimalCellBuilder addVacuole(Vacuole vacuole) {
      this.vacuoles.add(vacuole);
      return this;
   }

   @Override
   public Cell build() {
      Cell cell = new Cell();
      cell.addOrganelle(cellMembrane);
      cell.addOrganelle(nucleus);
      vacuoles.forEach(cell::addOrganelle);
      cell.setType(Cell.Type.ANIMAL);

      return cell;
   }
}
