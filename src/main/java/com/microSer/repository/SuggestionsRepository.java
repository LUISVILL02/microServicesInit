package com.microSer.repository;

import com.microSer.data.entities.Suggestions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionsRepository extends JpaRepository<Suggestions, Long> {
}
