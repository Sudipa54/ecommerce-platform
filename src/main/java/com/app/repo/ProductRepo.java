package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Products;


@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {

}
