package com.ecom.ecommerceapp.service;

import com.ecom.ecommerceapp.model.Category;
import com.ecom.ecommerceapp.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> getAlCategories(){
        return categoryRepository.findAll();
    }

    public Category getCategoriesById(Long categoryId){

        return categoryRepository.findById(categoryId).orElse(new Category());
    }

    public Category addCategory(Category category){

        return categoryRepository.save(category);
    }

    public void deleteCategory(Long categoryId){

        boolean isCategoryPresent  = categoryRepository.findById(categoryId).isEmpty();
        categoryRepository.deleteById(categoryId);

    }
}
