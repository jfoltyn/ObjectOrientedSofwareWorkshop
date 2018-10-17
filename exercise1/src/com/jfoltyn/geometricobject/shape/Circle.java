package com.jfoltyn.geometricobject.shape;

import com.jfoltyn.geometricobject.GeometricObject;
import com.jfoltyn.geometricobject.PointXY;

import static java.lang.Math.pow;

public class Circle extends GeometricObject {

   private PointXY center; //not really needed for this exercise, it would be strange circle without a center
   private int radius;

   public Circle(PointXY center, int radius) {
      this.center = center;
      this.radius = radius;
   }

   @Override
   public double calculate() {
      return Math.PI * pow(radius, 2);
   }
}
