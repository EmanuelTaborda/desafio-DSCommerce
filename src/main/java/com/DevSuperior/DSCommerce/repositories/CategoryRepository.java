package com.DevSuperior.DSCommerce.repositories;

import com.DevSuperior.DSCommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
