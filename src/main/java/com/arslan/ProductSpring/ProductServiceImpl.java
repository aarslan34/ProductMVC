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





//    public void addProduct(Product product){
//
////        products.add(product);
//        productDB.save(product);
//
//    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }


//
//    public Product getProduct(String name) {
//        for(Product p : products){
//            if(p.getName().equals(name)){
//                return p;
//            }
//        }
//
//        return null;
//    }
//
//
//    public Product getProductByType(String type) {
//        for(Product p : products){
//            if(p.getType().equals(type)){
//                return p;
//            }
//        }
//
//        return null;
//    }
//
//    public List<Product> getProductWithText(String text) {
//        List<Product> list = new ArrayList<>();
//
//        for(Product p : products){
//            if(p.getName().toLowerCase().contains(text.toLowerCase())){
//                list.add(p);
//            }
//        }
//
//        return list;
//    }
//
//
//    public void show() {
//        System.out.println("in show");
//    }
}
