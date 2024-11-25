package com.vitech.Sprint3_Lab07_train.repository;

import com.vitech.Sprint3_Lab07_train.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
