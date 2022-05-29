package com.carlosguttemberg.course.repositories;

import com.carlosguttemberg.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
