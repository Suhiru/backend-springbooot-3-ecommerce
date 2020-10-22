package com.suhiru.ecommerce.ecommerce.Dao;

import com.suhiru.ecommerce.ecommerce.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ProductRepository extends JpaRepository<Product, Long> {
}
