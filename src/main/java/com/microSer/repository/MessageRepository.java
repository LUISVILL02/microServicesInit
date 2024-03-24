package com.microSer.repository;

import com.microSer.data.entities.Message;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends Repository<Message> {
    @Query("SELECT m FROM Message m WHERE m.user.IdUser = ?1")
    List<Message> findByIdUser(Long idUser);
}
