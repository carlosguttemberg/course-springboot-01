package com.carlosguttemberg.course.repositories;

import com.carlosguttemberg.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
