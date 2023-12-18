package com.arslan.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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

}
