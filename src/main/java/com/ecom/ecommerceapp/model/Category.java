package com.ecom.ecommerceapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.model.relational.Sequence;


@Entity(name = "Category_Table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long categoryId;

    @NotEmpty
    @Size(min = 5 , message = "category name must be atleast 5 characters long")
    private String categoryName;



}
