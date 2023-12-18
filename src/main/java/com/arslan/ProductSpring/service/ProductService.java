package com.arslan.ProductSpring.service;

import com.arslan.ProductSpring.beans.Product;

import java.util.List;


public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProduct(String name);

}
