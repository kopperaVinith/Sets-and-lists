package com.codegnan.app.javaapp38.entity;

import java.awt.*;
import java.time.LocalDate;
import java.lang.Comparable;


public record Product (int id, String name,String category, String subCategory,double price) implements Comparable<Product>{
                  @Override
                  public int compareTo(Product o) {
                  Product currentProduct = this;
                  return  currentProduct.name.compareTo(o.name);
                  //Product anotherProduct = o;

                 /* if(currentProduct.id() > o.id())
                  {
                          return  -1;
                  }
                  else if(currentProduct.id() < o.id()) {
                          return  1;
                  }
                  return 0;


*/
    }

}
