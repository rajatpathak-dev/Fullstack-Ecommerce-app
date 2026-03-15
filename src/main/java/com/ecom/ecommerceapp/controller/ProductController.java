package com.ecom.ecommerceapp.controller;

import com.ecom.ecommerceapp.model.Product;
import com.ecom.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1.0.0")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> productList = productService.getAllProducts();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable("productId") long productId){
        Product product = productService.getProductsById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<Boolean> deleteProduct(@PathVariable("productId") long productId){
        return new ResponseEntity<>(productService.deleteProduct(productId), HttpStatus.OK);
    }
}
