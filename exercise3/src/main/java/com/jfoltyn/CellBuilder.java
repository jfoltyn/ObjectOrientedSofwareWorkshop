package com.jfoltyn;

import java.util.ArrayList;
import java.util.List;

public abstract class CellBuilder {

   CellMembrane cellMembrane;
   Nucleus nucleus;
   List<Vacuole> vacuoles = new ArrayList<>();

   public abstract Cell build();

   public abstract CellBuilder cellMembrane(CellMembrane cellMembrane);

   public abstract CellBuilder nucleus(Nucleus nucleus);

   public abstract CellBuilder addVacuole(Vacuole vacuole);
}
