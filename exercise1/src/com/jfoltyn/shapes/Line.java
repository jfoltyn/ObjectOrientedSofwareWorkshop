package com.jfoltyn.shapes;

import java.util.function.Supplier;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line extends GeometricObject{

    private PointXY start;
    private PointXY stop;

    private Supplier<Double> calculationSupplier;

    public Line(PointXY startPoint, PointXY stopPoint){
        this.start = startPoint;
        this.stop = stopPoint;
        calculationSupplier = constructCalculationSupplier();
    }

    @Override
    Supplier<Double> provideCalculationSupplier() {
        return calculationSupplier;
    }

    private Supplier<Double> constructCalculationSupplier() {
        return () -> sqrt(pow(start.getX() - stop.getX(), 2) + pow(start.getY() - stop.getY(), 2));
    }
}
