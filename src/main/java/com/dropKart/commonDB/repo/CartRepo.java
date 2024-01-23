package com.dropKart.commonDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dropKart.commonDB.model.ShoppingCart;

import jakarta.transaction.Transactional;

@Repository
public interface CartRepo extends JpaRepository<ShoppingCart, Long> {

	ShoppingCart findByCustomerId(String customerId);


	@Transactional
	@Modifying
	@Query(value="UPDATE sqs.customer_shopping_cart SET cart_total = :cartTotal WHERE cart_id = :cartId",nativeQuery = true)
	int savecartd(@Param("cartTotal") String result ,@Param("cartId") String cartId);


	ShoppingCart findByCartId(Long valueOf);
	

}
