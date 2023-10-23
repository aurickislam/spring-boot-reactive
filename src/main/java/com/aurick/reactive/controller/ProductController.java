package com.aurick.reactive.controller;

import com.aurick.reactive.entity.Product;
import com.aurick.reactive.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping(value = "/products", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Product> getProducts() {
        return productService.getProducts();
    }

}
