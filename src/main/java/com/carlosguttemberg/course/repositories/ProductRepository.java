package com.carlosguttemberg.course.repositories;

import com.carlosguttemberg.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
