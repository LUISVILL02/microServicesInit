package com.microSer.repository;

import com.microSer.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface Repository<E> extends JpaRepository<E, Long> {
}
