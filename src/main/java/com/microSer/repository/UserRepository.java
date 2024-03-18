package com.microSer.repository;

import com.microSer.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameAndLastName(String nombre, String apellido);
    User findByEmail(String email);
}
