package com.ecom.ecommerceapp.service;

import com.ecom.ecommerceapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts(){
        return productList;
    }

    public Product getProductsById(Long productId){

        for(Product product : productList){
            if(product.getProductId() == productId){
                return product;
            }
        }
        return null;
    }

    public Product addProduct(Product product){
       productList.add(product);
        return product;
    }

    public boolean deleteProduct(Long productId){

        for(Product product : productList){
            if(product.getProductId() == productId){
                return productList.remove(product);
            }
        }
        return false;
    }

}
