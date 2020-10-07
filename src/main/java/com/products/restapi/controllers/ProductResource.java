package com.products.restapi.controllers;

import com.products.restapi.models.Product;
import com.products.restapi.repositories.ProductRepository;
import com.products.restapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public List<Product> index() {
        return productRepository.findAll();
    }

    @PostMapping("product")
    @ResponseStatus(HttpStatus.CREATED)
    public Product store(@RequestBody Product product) {
        return productService.store(product);
    }

    @GetMapping("product/{id}")
    public Product show(@PathVariable(value = "id") long id) {
        return productRepository.findById(id);
    }

    @DeleteMapping("product/{id}")
    public void destroy(@PathVariable(value = "id") long id) {
        if (productRepository.existsById(id)) {
            productService.destroy(id);
        }
    }

    @PutMapping("product")
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }
}
