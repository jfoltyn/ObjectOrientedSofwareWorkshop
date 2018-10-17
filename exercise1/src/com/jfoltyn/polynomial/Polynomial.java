package com.jfoltyn.polynomial;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class Polynomial {
   private Map<Integer, Integer> powerToCoefficient = new TreeMap<>();

   public Polynomial setCoefficient(int power, int coefficient) {
      powerToCoefficient.put(power, coefficient);
      return this;
   }

   public double valueAt(double x) {
      return powerToCoefficient.entrySet().stream()
            .mapToDouble(entry -> entry.getValue() * pow(x, entry.getKey()))
            .sum();
   }

   @Override
   public String toString() {
      return powerToCoefficient.entrySet().stream()
            .map(entry -> String.format("%dx^%d", entry.getValue(), entry.getKey()))
            .collect(Collectors.joining(" + "));
   }
}
