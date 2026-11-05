package com.codegnan.app.javaapp38.program;

import com.codegnan.app.javaapp38.entity.Product;
import com.codegnan.app.javaapp38.service.ProductService2;


import java.util.List;
import java.util.Set;

import static java.lang.System.out;

public class MainProgram2 {
    public static void main(String[] args) {
        var productService2 = new ProductService2();


        Set<Product> listOfProducts = productService2.getProductSet();
        for(Product product : listOfProducts) {

            out.println(product);
        }
      /*  ArrayList<Product> listOfProducts = productService2.getProductList();

        for(Product product : listOfProducts) {

            out.println(product);
        }
        out.println(); */

        //ArrayList<Product> categoryProducts = productService2.findProductsByCategory("Books");
      //  LinkedList<Product> categoryProducts = productService2.findProductsByCategory("Books");
      /* categoryProducts = productService2.findProductsByCategory("Books & Stationery");
        if(categoryProducts.isEmpty()) {
            out.println("There is no items in this category:");
            out.println("OR Invalid category name");
        } else {
            for (Product product : categoryProducts) {
                out.println(product);
            }
        }
        out.println();

        //ArrayList<Product> subCategoryProducts = productService2.findProductsBySubCategory("Clothing","Women's Wear");
       // LinkedList<Product> subCategoryProducts = productService2.findProductsBySubCategory("Clothing","Women's Wear");
        Set<Product> subCategoryProducts = productService2.findProductsBySubCategory("Clothing","Women's Wear");
        if(subCategoryProducts.isEmpty()) {
            out.println("There is no items in this category/subcategory:");
            out.println("OR Invalid category/subcategory name");
        } else {
            for (Product product : subCategoryProducts) {
                out.println(product);
            }
        }*/

    }

}
