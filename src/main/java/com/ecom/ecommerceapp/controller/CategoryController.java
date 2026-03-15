package com.ecom.ecommerceapp.controller;

import com.ecom.ecommerceapp.model.Product;
import com.ecom.ecommerceapp.service.CategoryService;
import com.ecom.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1.0.0")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


}
