package com.jfoltyn.geometricobject;

import com.jfoltyn.polynomial.Polynomial;

import static java.lang.String.format;

public class Func extends GeometricObject {

   private static final int CALCULATIONS_PER_UNIT = 100;
   private static final double CALCULATIONS_STEP = 1.0 / CALCULATIONS_PER_UNIT;

   private Polynomial polynomial;
   private int rangeStart;
   private int rangeEnd;

   public Func(Polynomial polynomial, int rangeStart, int rangeEnd) {
      this.polynomial = polynomial;
      this.rangeStart = rangeStart;
      this.rangeEnd = rangeEnd;
   }

   @Override
   public double calculate() {
      double area = 0;
      double x = rangeStart;
      while (x < rangeEnd) {
         area += polynomial.valueAt(x);
         x += CALCULATIONS_STEP;
      }
      area /= (CALCULATIONS_PER_UNIT * (rangeEnd - rangeStart));
      return area;
   }

   public String toString() {
      return format("%s (%s) : calculate=%f", this.whoAmI(), polynomial.toString(), this.calculate());
   }
}
