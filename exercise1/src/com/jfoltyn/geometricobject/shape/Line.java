package com.jfoltyn.geometricobject.shape;

import com.jfoltyn.geometricobject.GeometricObject;
import com.jfoltyn.geometricobject.PointXY;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line extends GeometricObject {

   private PointXY start;
   private PointXY stop;

   public Line(PointXY startPoint, PointXY stopPoint) {
      this.start = startPoint;
      this.stop = stopPoint;
   }

   @Override
   public double calculate() {
      return sqrt(pow(start.getX() - stop.getX(), 2) + pow(start.getY() - stop.getY(), 2));
   }
}
