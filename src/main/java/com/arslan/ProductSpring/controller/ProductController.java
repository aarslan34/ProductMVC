package com.arslan.ProductSpring.controller;

import com.arslan.ProductSpring.service.ProductService;
import com.arslan.ProductSpring.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }


    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name) {

        return productService.getProduct(name);
    }




}
