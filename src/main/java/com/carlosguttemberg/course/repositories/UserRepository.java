package com.carlosguttemberg.course.repositories;

import com.carlosguttemberg.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
