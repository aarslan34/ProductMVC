package com.arslan.ProductSpring.service;

import com.arslan.ProductSpring.beans.Product;
import com.arslan.ProductSpring.dao.ProductDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    List<Product> products = new ArrayList<>();

    @Autowired
    ProductDB db;

    public List<Product> getAllProducts() {
        return db.findAll();
    }


    @Override
    public Product getProduct(String name) {
        return db.findByName(name);
    }

//    @Override
//    public Product findByName(String name) {
//        return db.findByName(name);
//    }

}
