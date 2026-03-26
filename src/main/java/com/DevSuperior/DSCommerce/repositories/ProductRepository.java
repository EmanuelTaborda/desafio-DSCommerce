package com.DevSuperior.DSCommerce.repositories;

import com.DevSuperior.DSCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
