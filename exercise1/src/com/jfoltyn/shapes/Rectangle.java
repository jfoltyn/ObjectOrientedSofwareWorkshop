package com.jfoltyn.shapes;

import java.util.Arrays;
import java.util.List;

public class Rectangle extends Shape {

    public Rectangle(PointXY a1, PointXY a2, PointXY a3, PointXY a4) {
        this(Arrays.asList(a1, a2, a3, a4));
    }

    public Rectangle(List<PointXY> points) {
        this.points = points;
    }
}
