package com.elasticsearch.api.model;

import javax.persistence.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "elastic_product", type = "products")
public class Product {
	@Id
	private long id;
	private String name;
	private int price;
	private String description;
	
	public Product() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
	
}
