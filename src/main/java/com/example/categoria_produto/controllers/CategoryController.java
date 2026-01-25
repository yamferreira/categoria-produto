package com.example.categoria_produto.controllers;

import com.example.categoria_produto.domain.category.Category;
import com.example.categoria_produto.domain.category.CategoryDTO;
import com.example.categoria_produto.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private CategoryService service;

    public CategoryController(CategoryService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Category> insert(@RequestBody CategoryDTO categoryData) {
        Category category = this.service.insert(categoryData);
        return ResponseEntity.ok().body(category);
    }
}
