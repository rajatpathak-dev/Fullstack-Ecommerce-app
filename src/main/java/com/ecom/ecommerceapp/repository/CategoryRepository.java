package com.ecom.ecommerceapp.repository;


import com.ecom.ecommerceapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface CategoryRepository extends JpaRepository<Category, Long> {
}
