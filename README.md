#springboot-elasticsearch
Spring Boot application with elastic search

##application.properties with Elasticsearch properties.

spring.data.elasticsearch.cluster-nodes=localhost:9300

### Code Changes
#### DAO - Add ElasticsearchRepository
public interface ProductDao extends ElasticsearchRepository<Product, String> {	

}
#### Model(Bean) - Adding the Document
@Document(indexName = "elastic_product")

#### Sample Queries 
http://localhost:9200/elastic_product/_search
http://localhost:9200/elastic_product/_search?q=name:P1
http://localhost:9200/elastic_product/_search?q=id:1
http://localhost:9200/elastic_product/_search?sort=id:asc&_source=name,price
http://localhost:9200/elastic_product/_count?q=name:SmasungGalaxy S20 Plus
http://localhost:9200/elastic_product/_count?q=id:1