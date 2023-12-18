package com.arslan.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		//ProductServiceImpl productService = context.getBean(ProductServiceImpl.class);
//		ProductService productService = context.getBean(ProductService.class);
//
//		List<Product> products = productService.getAllProducts();

		//System.out.println(products);

//		for(Product p : products){
//			System.out.println(p);
//		}

//		List<Product> products = productService.getAllProducts();
	}

}
