package com.jfoltyn;

public class PlantCellBuilder extends CellBuilder {

   private CellWall cellWall;
   private Chloroplast chloroplast;

   public PlantCellBuilder cellWall(CellWall cellWall) {
      this.cellWall = cellWall;
      return this;
   }

   public PlantCellBuilder chloroplast(Chloroplast chloroplast) {
      this.chloroplast = chloroplast;
      return this;
   }

   @Override
   public PlantCellBuilder cellMembrane(CellMembrane cellMembrane) {
      this.cellMembrane = cellMembrane;
      return this;
   }

   @Override

   public PlantCellBuilder nucleus(Nucleus nucleus) {
      this.nucleus = nucleus;
      return this;
   }

   @Override
   public PlantCellBuilder addVacuole(Vacuole vacuole) {
      this.vacuoles.add(vacuole);
      return this;
   }

   @Override
   public Cell build() {
      Cell cell = new Cell();
      cell.addOrganelle(cellMembrane);
      cell.addOrganelle(nucleus);
      vacuoles.forEach(cell::addOrganelle);
      cell.setType(Cell.Type.PLANT);
      cell.addOrganelle(cellWall);
      cell.addOrganelle(chloroplast);

      return cell;
   }
}
