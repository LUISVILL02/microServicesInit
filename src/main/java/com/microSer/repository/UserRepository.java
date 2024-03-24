package com.microSer.repository;

import com.microSer.data.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepository extends Repository<User> {
    List<User> findByNameAndLastName(String nombre, String apellido);
    User findByEmail(String email);
    Page<User> findAll(Pageable pageable);

}
