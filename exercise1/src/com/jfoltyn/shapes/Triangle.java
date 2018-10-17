package com.jfoltyn.shapes;

import java.util.Arrays;
import java.util.List;

public class Triangle extends Shape {

    public Triangle(PointXY a1, PointXY a2, PointXY a3) {
        this(Arrays.asList(a1, a2, a3));
    }

    public Triangle(List<PointXY> points) {
        this.points = points;
    }
}
