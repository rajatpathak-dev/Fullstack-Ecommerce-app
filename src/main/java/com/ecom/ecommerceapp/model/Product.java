package com.ecom.ecommerceapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Product_Table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private String productName;

    //private Category category;

}
