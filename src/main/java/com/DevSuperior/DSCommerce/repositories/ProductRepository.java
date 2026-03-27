package com.DevSuperior.DSCommerce.repositories;

import com.DevSuperior.DSCommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM tb_product p " +
            "WHERE UPPER(p.name) LIKE UPPER(CONCAT('%', :name, '%'))", nativeQuery = true)
    Page<Product> findByName(String name, Pageable pageable);

}
