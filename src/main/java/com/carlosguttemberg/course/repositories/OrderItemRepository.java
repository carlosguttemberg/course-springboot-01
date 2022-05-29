package com.carlosguttemberg.course.repositories;

import com.carlosguttemberg.course.entities.OrderItem;
import com.carlosguttemberg.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
