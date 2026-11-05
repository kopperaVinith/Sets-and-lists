package com.codegnan.app.javaapp38.service;

import com.codegnan.app.javaapp38.entity.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ProductService {
   // private ArrayList<Product> productList = new ArrayList();

   // private LinkedList<Product> productList = new LinkedList<>();
    //Vector<Product> productList = new Vector<>();
    List<Product> productList = new Vector<>();

    public ProductService() {
        productList.add(new Product(1, "Wireless Earbuds", "Electronics", "Audio", 49.99));
        productList.add(new Product(2, "Bluetooth Speaker", "Electronics", "Audio", 79.99));
        productList.add(new Product(3, "Over-Ear Headphones", "Electronics", "Audio", 129.99));
        productList.add(new Product(4, "Soundbar", "Electronics", "Audio", 199.99));
        productList.add(new Product(5, "Studio Microphone", "Electronics", "Audio", 89.99));
        productList.add(new Product(6, "Wired Earphones", "Electronics", "Audio", 19.99));
        productList.add(new Product(7, "USB-C Hub", "Electronics", "Accessories", 34.99));
        productList.add(new Product(8, "Laptop Stand", "Electronics", "Accessories", 45.00));
        productList.add(new Product(9, "Wireless Mouse", "Electronics", "Accessories", 29.99));
        productList.add(new Product(10, "Mechanical Keyboard", "Electronics", "Accessories", 89.99));
        productList.add(new Product(11, "Cotton T-Shirt", "Clothing", "Men's Wear", 19.99));
        productList.add(new Product(12, "Slim Fit Jeans", "Clothing", "Men's Wear", 49.99));
        productList.add(new Product(13, "Hooded Sweatshirt", "Clothing", "Men's Wear", 39.99));
        productList.add(new Product(14, "Formal Blazer", "Clothing", "Men's Wear", 120.00));
        productList.add(new Product(15, "Cargo Shorts", "Clothing", "Men's Wear", 29.99));
        productList.add(new Product(16, "Polo Shirt", "Clothing", "Men's Wear", 25.00));
        productList.add(new Product(17, "Floral Summer Dress", "Clothing", "Women's Wear", 55.00));
        productList.add(new Product(18, "High-Waist Leggings", "Clothing", "Women's Wear", 35.00));
        productList.add(new Product(19, "Knitted Cardigan", "Clothing", "Women's Wear", 45.00));
        productList.add(new Product(20, "Denim Jacket", "Clothing", "Women's Wear", 65.00));
        productList.add(new Product(21, "Non-Stick Frying Pan", "Home & Kitchen", "Cookware", 39.99));
        productList.add(new Product(22, "Stainless Steel Pot", "Home & Kitchen", "Cookware", 49.99));
        productList.add(new Product(23, "Cast Iron Skillet", "Home & Kitchen", "Cookware", 44.99));
        productList.add(new Product(24, "Chef Knife", "Home & Kitchen", "Cookware", 59.99));
        productList.add(new Product(25, "Cutting Board", "Home & Kitchen", "Cookware", 19.99));
        productList.add(new Product(26, "Silicone Spatula Set", "Home & Kitchen", "Cookware", 14.99));
        productList.add(new Product(27, "Scented Candle", "Home & Kitchen", "Decor", 18.50));
        productList.add(new Product(28, "Wall Art Canvas", "Home & Kitchen", "Decor", 45.00));
        productList.add(new Product(29, "Throw Pillow", "Home & Kitchen", "Decor", 22.00));
        productList.add(new Product(30, "Ceramic Vase", "Home & Kitchen", "Decor", 32.00));
        productList.add(new Product(31, "Yoga Mat", "Sports & Outdoors", "Fitness Equipment", 25.00));
        productList.add(new Product(32, "Dumbbell Set", "Sports & Outdoors", "Fitness Equipment", 89.99));
        productList.add(new Product(33, "Resistance Bands", "Sports & Outdoors", "Fitness Equipment", 15.99));
        productList.add(new Product(34, "Jump Rope", "Sports & Outdoors", "Fitness Equipment", 12.00));
        productList.add(new Product(35, "Exercise Ball", "Sports & Outdoors", "Fitness Equipment", 29.99));
        productList.add(new Product(36, "Pull-up Bar", "Sports & Outdoors", "Fitness Equipment", 39.99));
        productList.add(new Product(37, "Camping Tent", "Sports & Outdoors", "Outdoor Gear", 150.00));
        productList.add(new Product(38, "Sleeping Bag", "Sports & Outdoors", "Outdoor Gear", 65.00));
        productList.add(new Product(39, "Hiking Backpack", "Sports & Outdoors", "Outdoor Gear", 85.00));
        productList.add(new Product(40, "Water Bottle", "Sports & Outdoors", "Outdoor Gear", 20.00));
        productList.add(new Product(41, "Mystery Novel", "Books & Stationery", "Fiction", 14.99));
        productList.add(new Product(42, "Sci-Fi Epic", "Books & Stationery", "Fiction", 18.99));
        productList.add(new Product(43, "Fantasy Adventure", "Books & Stationery", "Fiction", 16.50));
        productList.add(new Product(44, "Historical Romance", "Books & Stationery", "Fiction", 12.99));
        productList.add(new Product(45, "Thriller Book", "Books & Stationery", "Fiction", 15.00));
        productList.add(new Product(46, "Classic Literature", "Books & Stationery", "Fiction", 10.99));
        productList.add(new Product(47, "Notebook", "Books & Stationery", "Office Supplies", 6.99));
        productList.add(new Product(48, "Ballpoint Pens (Pack)", "Books & Stationery", "Office Supplies", 8.99));
        productList.add(new Product(49, "Desk Organizer", "Books & Stationery", "Office Supplies", 19.99));
        productList.add(new Product(50, "Sticky Notes", "Books & Stationery", "Office Supplies", 4.99));
    }

    public boolean addProduct(Product product) {
        boolean isAdded = productList.add(product);

        return  isAdded;
    }

    //public ArrayList<Product> getProductList() {
   // public LinkedList<Product> getProductList() {
   // public Vector<Product> getProductList() {
    public List<Product> getProductList() {
        return  productList;
    }

    public Product findProductById(int productId) {

        for(Product product : productList) {
            if(product.id() == productId) {
                return  product;
            }
        }

        return  null;
    }

    //RETRIEVE PRODUCTS FROM A PARTICULAR CATEGORY

//    public  ArrayList<Product> findProductsByCategory(String categoryName) {
//public  LinkedList<Product> findProductsByCategory(String categoryName) {
  //  public  Vector<Product> findProductsByCategory(String categoryName) {
public  List<Product> findProductsByCategory(String categoryName) {
        Vector<Product> categoryProductsList = new Vector<>();

        for(Product product : productList) {
            if(product.category().equals(categoryName)) {
                categoryProductsList.add(product);
            }
        }

        return categoryProductsList;
    }

   // public  ArrayList<Product> findProductsBySubCategory(String categoryName, String  subCategoryName) {
  // public  LinkedList<Product> findProductsBySubCategory(String categoryName, String  subCategoryName) {
  //public  Vector<Product> findProductsBySubCategory(String categoryName, String  subCategoryName) {
   public  List<Product> findProductsBySubCategory(String categoryName, String  subCategoryName) {

       //  ArrayList<Product> subCategoryProductsList = new ArrayList<>();
       //LinkedList<Product> subCategoryProductsList = new LinkedList<>();
       Vector<Product> subCategoryProductsList = new Vector<>();

        for(Product product : productList) {
            if(product.category().equals(categoryName) && product.subCategory().equals(subCategoryName)) {
                subCategoryProductsList.add(product);
            }
        }

        return subCategoryProductsList;
    }

    public boolean updateProductPrice(int productId,double newPrice) {
        boolean isUpdated = false;

        Product existingProduct = null;

        for(Product product :  productList) {
            if (product.id() == productId) {
                existingProduct = product;

                break;
            }
        }

        if(existingProduct != null) {
               var updateProduct = new Product(existingProduct.id(), existingProduct.name(), existingProduct.category(),existingProduct.subCategory(),newPrice);

               var isRemoved = productList.remove(existingProduct);

               if(isRemoved) {
                   var isAddded = productList.add(updateProduct);
                   if(isAddded) {
                       isUpdated = true;
                   } else {
                       productList.add(existingProduct);
                   }
            }
        }

        return  isUpdated;
    }

    public boolean deleteProduct(int productId) {
        var isRemoved = false;

        Product existingProduct = null;

        for(Product product: productList) {

            if(product.id() ==  productId) {
                existingProduct = product;

                break;
            }
        }

        if(existingProduct != null) {
            isRemoved = productList.remove(existingProduct);
        }

        return isRemoved;
    }


}
