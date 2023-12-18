package com.arslan.ProductSpring.service;

import com.arslan.ProductSpring.beans.Product;

import java.util.List;


public interface ProductService {

//    public void addProduct(Product product);


    public List<Product> getAllProducts();

    public Product getProduct(String name);

//    public Product findByName(String name);
//    public List<Product> getAllProducts();
//
//    public Product getProduct(String name) ;
//
//    public Product getProductByType(String type);
//
//    public List<Product> getProductWithText(String text);
//
//    public void show();
}
