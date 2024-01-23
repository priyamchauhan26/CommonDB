package com.dropKart.commonDB.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dropKart.commonDB.model.CartItem;

import jakarta.transaction.Transactional;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long> {

	 @Query(value = "SELECT * FROM sqs.cart_item WHERE cart_id = :cartId AND product_id = :productId AND size = :size", nativeQuery = true)
	    CartItem findCartItemByCartIdAndProductIdAndSize(
	        @Param("cartId") String cartId,
	        @Param("productId") String productId,
	        @Param("size") String size
	    );

	 @Transactional
	 @Modifying
	 @Query(value= "UPDATE sqs.cart_item SET quantity = :quantity WHERE cart_id = :cartId AND cart_item_id = :cartItemId AND product_id = :productId",nativeQuery = true)
	 int updateProductItemQuantity(
	     @Param("quantity") int quantity,
	     @Param("cartId") String cartId,
	     @Param("cartItemId") long cartItemId,
	     @Param("productId") String productId
	 );

	List<CartItem> findByCartId(String cartId);
}
