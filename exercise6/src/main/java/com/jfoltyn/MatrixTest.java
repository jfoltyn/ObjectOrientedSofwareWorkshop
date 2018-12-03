package com.jfoltyn;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MatrixTest {

   @Test
   public void createIdentityMatrix() {
      int size = 4;
      Matrix m = new Matrix(size, size);
      m.createIdentityMatrix(4);

      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            if (i == j)
               assertEquals(1.0, m.getMatrixValue(i, j));
            else
               assertEquals(0.0, m.getMatrixValue(i, j));
         }
      }
   }

   @Test
   public void determinant() {
      int size = 2;
      Matrix m = new Matrix(size, size);
      m.setMatrixValues(new double[][]{{3, 8}, {4, 6}});

      assertEquals(-14.0, m.determinant());
   }

   @Test(expected = InvalidDimensionException.class)
   public void determinantWithBadDimension() {
      Matrix m = new Matrix(3, 5);
      m.determinant();
   }

   @Test
   public void getMatrixValue() {
      int size = 2;
      Matrix m = new Matrix(size, size);
      m.setMatrixValues(new double[][]{{3, 8}, {4, 6}});

      assertEquals(3.0, m.getMatrixValue(0, 0));
   }

   @Test
   public void setMatrixValue() {
      int size = 2;
      Matrix m = new Matrix(size, size);
      m.setMatrixValue(0, 0, 3.0);

      assertEquals(3.0, m.getMatrixValue(0, 0));
   }

   @Test
   public void setMatrixValues() {
      double[][] values = new double[][]{{3, 8}, {4, 6}};

      Matrix m = new Matrix(2, 2);
      m.setMatrixValues(values);


      for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
            assertEquals(values[i][j], m.getMatrixValue(i, j));
         }
      }
   }

   @Test(expected = InvalidDimensionException.class)
   public void setMatrixValuesWithBadDimension() {
      Matrix m = new Matrix(3, 5);
      m.setMatrixValues(new double[123][2342]);
   }

   @Test
   public void getWidth() {
      int size = 2;
      Matrix m = new Matrix(size, size);

      assertEquals(size, m.getWidth());
   }

   @Test
   public void getHeight() {
      int size = 2;
      Matrix m = new Matrix(size, size);

      assertEquals(size, m.getHeight());
   }
}