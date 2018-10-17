package com.jfoltyn;

import com.jfoltyn.shapes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PointXY a1 = new PointXY(0, 0);
        PointXY a2 = new PointXY(10, 0);
        PointXY a3 = new PointXY(10, 10);
        PointXY a4 = new PointXY(0, 10);

        List<GeometricObject> geometricObjects = new ArrayList<>();

        geometricObjects.add(new Line(a1, a2));
        geometricObjects.add(new Circle(a1, 10));
        geometricObjects.add(new Triangle(Arrays.asList(a1, a2, a3)));
        geometricObjects.add(new Rectangle(Arrays.asList(a1, a2, a3, a4)));

        geometricObjects.forEach(System.out::println);
    }
}
