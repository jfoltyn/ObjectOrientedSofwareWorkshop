package com.jfoltyn.shapes;

import java.util.function.Supplier;

import static java.lang.Math.pow;

public class Circle extends GeometricObject{

    private PointXY center; //not really needed for this exercise
    private int radius;

    private Supplier<Double> calculationSupplier;

    public Circle(PointXY center, int radius) {
        this.center = center;
        this.radius = radius;
        calculationSupplier = constructCalculationSupplier();
    }

    @Override
    Supplier<Double> provideCalculationSupplier() {
        return calculationSupplier;
    }

    private Supplier<Double> constructCalculationSupplier() {
        return () -> Math.PI * pow(radius, 2);
    }
}
