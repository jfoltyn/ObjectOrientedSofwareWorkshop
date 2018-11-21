package com.jfoltyn;

import com.jfoltyn.products.AvailableProducts;
import com.jfoltyn.products.Product;
import com.jfoltyn.robots.RobotPrototype;
import com.jfoltyn.robots.RobotsCreatorAndGod;

class Main {

   public static void main(String[] args) {
      Product product = Product.ProductFactory(AvailableProducts.Tv);
      System.out.println(product.getParts());
   }
}
