package com.elasticsearch.api.dao;



import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.elasticsearch.api.model.Product;

public interface ProductDao extends ElasticsearchRepository<Product, String> {	
//	Page<Product> findByTitle(String title, Pageable pageable);
//  List<Product> findByTitle(String title);
}
