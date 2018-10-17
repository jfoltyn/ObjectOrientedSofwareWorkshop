package com.jfoltyn.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static java.lang.Math.abs;

public abstract class Shape extends GeometricObject {

   protected List<PointXY> points;

   private Supplier<Double> calculationSupplier = () -> {
      List<PointXY> points = new ArrayList<>(getPoints());
      points.add(points.get(0));
      double area = 0;

      for (int i = 0; i < points.size() - 1; i++) {
         area += (points.get(i).getX() * points.get(i + 1).getY()) - (points.get(i).getY() * points.get(i + 1).getX());
      }

      return abs(area / 2);
   };


   @Override
   Supplier<Double> provideCalculationSupplier() {
      return calculationSupplier;
   }

   public List<PointXY> getPoints(){
      return points;
   }
}
