package com.jfoltyn;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix implements IMatrix {

   private int height;
   private int width;
   private double[][] data;

   public Matrix(int height, int width) {
      this.height = height;
      this.width = width;
      data = new double[height][width];
   }

   public void createIdentityMatrix(int size) {
      height = size;
      width = size;
      data = new double[height][width];

      for (int i = 0; i < size; i++) {
         data[i][i] = 1;
      }
   }

   public double determinant() throws InvalidDimensionException {
      if (width != height)
         throw new InvalidDimensionException();

      return determinant(data);
   }

   private double determinant(double matrix[][]) throws InvalidDimensionException {
      int size = matrix.length;

      double det = 0;
      if (size == 1) {
         det = data[0][0];
      } else if (size == 2) {
         det = data[0][0] * data[1][1] - data[1][0] * data[0][1];
      } else {
         det = 0;
         for (int j1 = 0; j1 < size; j1++) {
            double[][] m = new double[size - 1][];
            for (int k = 0; k < (size - 1); k++) {
               m[k] = new double[size - 1];
            }
            for (int i = 1; i < size; i++) {
               int j2 = 0;
               for (int j = 0; j < size; j++) {
                  if (j == j1)
                     continue;
                  m[i - 1][j2] = data[i][j];
                  j2++;
               }
            }
            det += Math.pow(-1.0, 1.0 + j1 + 1.0) * data[0][j1] * determinant(m);
         }
      }
      return det;
   }

   public double getMatrixValue(int row, int column) {
      return data[row][column];
   }

   public void setMatrixValue(int row, int column, double value) {
      data[row][column] = value;
   }

   public void setMatrixValues(double[][] values) throws InvalidDimensionException {
      if (values.length != height || values[0].length != width)
         throw new InvalidDimensionException();
      data = values;
   }

   public int getWidth() {
      return width;
   }

   public int getHeight() {
      return height;
   }

   public String toString() {
      return Arrays.stream(data)
            .map(Arrays::toString)
            .collect(Collectors.joining(System.lineSeparator()));
   }
}
