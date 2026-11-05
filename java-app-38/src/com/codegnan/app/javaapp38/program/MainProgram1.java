package com.codegnan.app.javaapp38.program;

import com.codegnan.app.javaapp38.entity.Product;
import com.codegnan.app.javaapp38.service.ProductService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import static java.lang.System.out;

public class MainProgram1 {
    public static void main(String[] args) {
        var productService = new ProductService();

      /*  ArrayList<Product> listOfProducts = productService.getProductList();

        for(Product product : listOfProducts) {

            out.println(product);
        }
        out.println(); */

        //ArrayList<Product> categoryProducts = productService.findProductsByCategory("Books");
      //  LinkedList<Product> categoryProducts = productService.findProductsByCategory("Books");
       List<Product> categoryProducts = productService.findProductsByCategory("Books");
        if(categoryProducts.isEmpty()) {
            out.println("There is no items in this category:");
            out.println("OR Invalid category name");
        } else {
            for (Product product : categoryProducts) {
                out.println(product);
            }
        }
        out.println();

        //ArrayList<Product> subCategoryProducts = productService.findProductsBySubCategory("Clothing","Women's Wear");
       // LinkedList<Product> subCategoryProducts = productService.findProductsBySubCategory("Clothing","Women's Wear");
        List<Product> subCategoryProducts = productService.findProductsBySubCategory("Clothing","Women's Wear");
        if(subCategoryProducts.isEmpty()) {
            out.println("There is no items in this category/subcategory:");
            out.println("OR Invalid category/subcategory name");
        } else {
            for (Product product : subCategoryProducts) {
                out.println(product);
            }
        }

    }

}
