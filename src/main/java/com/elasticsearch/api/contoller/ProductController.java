package com.elasticsearch.api.contoller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.elasticsearch.api.dao.ProductDao;
import com.elasticsearch.api.model.Product;

@RestController
public class ProductController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private ProductDao dao;
	
	@GetMapping("/products")
	public List < Product > getAllProducts(){
		List<Product> productList = (List<Product>) dao.findAll();
		logger.info("Get Products :"+ productList);
		return productList;
	}
	
	@PostMapping("/products")
	public Product createProduct(@Validated @RequestBody Product product) {
		logger.info("Create a Product :"+ product);
        return dao.save(product);
    }
    
   
}
