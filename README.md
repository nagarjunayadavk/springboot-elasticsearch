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