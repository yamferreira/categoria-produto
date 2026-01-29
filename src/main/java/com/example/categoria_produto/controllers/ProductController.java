package com.example.categoria_produto.controllers;

import com.example.categoria_produto.domain.category.Category;
import com.example.categoria_produto.domain.category.CategoryDTO;
import com.example.categoria_produto.domain.product.Product;
import com.example.categoria_produto.domain.product.ProductDTO;
import com.example.categoria_produto.services.CategoryService;
import com.example.categoria_produto.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Product> insert(@RequestBody ProductDTO productData) {
        Product product = this.service.insert(productData);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        List<Product> products = this.service.getAll();
        return ResponseEntity.ok().body(products);
    }

    @PutMapping("/{id}") //@PathParam
    public ResponseEntity<Product> update(@PathVariable  ("id") String id, @RequestBody ProductDTO productData){
        Product updatedProduct = this.service.update(id, productData);
        return ResponseEntity.ok().body(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable ("id") String id){
        this.service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
