package com.jfoltyn.geometricobject.shape;

import com.jfoltyn.geometricobject.PointXY;

import java.util.Arrays;
import java.util.List;

public class Triangle extends Shape {

   private List<PointXY> points;

   public Triangle(PointXY a1, PointXY a2, PointXY a3) {
      this(Arrays.asList(a1, a2, a3));
   }

   public Triangle(List<PointXY> points) {
      this.points = points;
   }

   @Override
   public List<PointXY> getPoints() {
      return points;
   }
}
