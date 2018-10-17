package com.jfoltyn.shapes;

import java.util.function.Supplier;

public abstract class GeometricObject {

    abstract Supplier<Double> provideCalculationSupplier();

    public String whoAmI(){
        return this.getClass().getSimpleName();
    }

    public double calculate() {
        return provideCalculationSupplier().get();
    }

    public String toString(){
        return this.whoAmI() + " : calculate=" + this.calculate();
    }
}
