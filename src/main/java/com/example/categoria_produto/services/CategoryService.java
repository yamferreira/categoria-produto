package com.example.categoria_produto.services;

import com.example.categoria_produto.domain.category.Category;
import com.example.categoria_produto.domain.category.CategoryDTO;
import com.example.categoria_produto.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category insert(CategoryDTO categoryData){
        Category newCategory = new Category(categoryData);
        this.repository.save(newCategory);
        return newCategory;
    }
}
