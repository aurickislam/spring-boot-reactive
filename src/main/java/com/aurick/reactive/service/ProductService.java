package com.aurick.reactive.service;

import com.aurick.reactive.entity.Product;
import com.aurick.reactive.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public Flux<Product> getProducts() {
        return productRepository.findAll()
                .delayElements(Duration.ofSeconds(3));
    }
}
