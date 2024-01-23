package com.dropKart.commonDB.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dropKart.commonDB.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

	

	@Query(value="SELECT * FROM sqs.product where consumer_type=:consumerType" ,nativeQuery = true)
	List<Product> findProductByConsumerType(@Param("consumerType")String consumerType);

	@Query(value="SELECT * FROM sqs.product where id=:id" ,nativeQuery = true)
	Optional<Product> findById(@Param("id") Long productId);
	
   @Query(value="SELECT * FROM sqs.product where id=:id" ,nativeQuery = true)
	Product findByProductId(@Param("id") Long productId);

}
