package com.jfoltyn.geometricobject.shape;

import com.jfoltyn.geometricobject.GeometricObject;
import com.jfoltyn.geometricobject.PointXY;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public abstract class Shape extends GeometricObject {

   @Override
   public double calculate() {
      List<PointXY> points = new ArrayList<>(getPoints());
      points.add(points.get(0));
      double area = 0;

      for (int i = 0; i < points.size() - 1; i++) {
         area += (points.get(i).getX() * points.get(i + 1).getY()) - (points.get(i).getY() * points.get(i + 1).getX());
      }

      return abs(area / 2);
   }

   public abstract List<PointXY> getPoints();
}
