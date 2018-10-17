package com.jfoltyn.geometricobject;

import static java.lang.String.format;

public abstract class GeometricObject {

   public abstract double calculate();

   public String whoAmI() {
      return this.getClass().getSimpleName();
   }

   public String toString() {
      return format("%s : calculate=%f", this.whoAmI(), this.calculate());
   }
}
