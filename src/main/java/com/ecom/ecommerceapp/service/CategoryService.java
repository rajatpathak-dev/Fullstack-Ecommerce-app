package com.ecom.ecommerceapp.service;

import com.ecom.ecommerceapp.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    private List<Category> categoryList = new ArrayList<>();

    public List<Category> getAlCategories(){
        return categoryList;
    }

    public Category getCategoriesById(Long categoryId){

        for(Category category : categoryList){
            if(category.getCategoryId() == categoryId){
                return category;
            }
        }
        return null;
    }

    public Category addCategory(Category category){
        categoryList.add(category);
        return category;
    }

    public boolean deleteCategory(Long categoryId){

        for(Category category : categoryList){
            if(category.getCategoryId() == categoryId){
                return true;
            }
        }
        return false;
    }
}
