package com.jfoltyn.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public abstract class Product {

    protected List<String> modules = new ArrayList<>();

    public String getParts() {
        sort(modules);
        return modules.toString();
    }

    public static Product ProductFactory(AvailableProducts productType){
        switch (productType){
            case Tv:
                return new Tv();

            case Toaster:
                return new Toaster();

            case PneumaticBananaPeeler:
                return new PneumaticBananaPeeler();
        }
        throw new IllegalStateException("Not a such productType!");
    }
}
