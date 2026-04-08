package com.DevSuperior.DSCommerce.services;

import com.DevSuperior.DSCommerce.dto.CategoryDTO;
import com.DevSuperior.DSCommerce.entities.Category;
import com.DevSuperior.DSCommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public List<CategoryDTO> findAll() {
        List<Category> result = categoryRepository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }
}
