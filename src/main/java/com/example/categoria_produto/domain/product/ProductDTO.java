package com.example.categoria_produto.domain.product;

public record ProductDTO(String title,
                         String description,
                         String ownerId,
                         Integer price,
                         String categoryId) {
}
