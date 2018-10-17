package com.jfoltyn;

import com.jfoltyn.geometricobject.Func;
import com.jfoltyn.geometricobject.GeometricObject;
import com.jfoltyn.geometricobject.PointXY;
import com.jfoltyn.geometricobject.shape.Circle;
import com.jfoltyn.geometricobject.shape.Line;
import com.jfoltyn.geometricobject.shape.Rectangle;
import com.jfoltyn.geometricobject.shape.Triangle;
import com.jfoltyn.polynomial.Polynomial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

   public static void main(String[] args) {
      PointXY a1 = new PointXY(0, 0);
      PointXY a2 = new PointXY(10, 0);
      PointXY a3 = new PointXY(10, 10);
      PointXY a4 = new PointXY(0, 10);

      Polynomial polynomialSimple = new Polynomial()
            .setCoefficient(1, 1);

      Polynomial polynomialBitLessSimple = new Polynomial()
            .setCoefficient(1, 1)
            .setCoefficient(2, 5)
            .setCoefficient(3, 10)
            .setCoefficient(4, 1);

      List<GeometricObject> geometricObjects = new ArrayList<>();
      geometricObjects.add(new Line(a1, a2));
      geometricObjects.add(new Circle(a1, 10));
      geometricObjects.add(new Triangle(Arrays.asList(a1, a2, a3)));
      geometricObjects.add(new Rectangle(Arrays.asList(a1, a2, a3, a4)));
      geometricObjects.add(new Func(polynomialSimple, 0, 20));
      geometricObjects.add(new Func(polynomialBitLessSimple, 0, 10));

      geometricObjects.forEach(System.out::println);
   }
}
