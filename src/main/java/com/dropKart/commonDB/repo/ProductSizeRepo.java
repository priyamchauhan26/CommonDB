package com.dropKart.commonDB.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dropKart.commonDB.model.ProductSize;

@Repository
public interface ProductSizeRepo extends JpaRepository<ProductSize, Long> {

	List<ProductSize> findByProductId(String productId);

}
