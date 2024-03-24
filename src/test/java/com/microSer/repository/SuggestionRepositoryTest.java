package com.microSer.repository;

import com.microSer.IntegrationDbRepositoryTest;
import com.microSer.data.entities.Suggestion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class SuggestionRepositoryTest extends IntegrationDbRepositoryTest {

    SuggestionRepository suggestionRepository;

    @Autowired
    public SuggestionRepositoryTest(SuggestionRepository suggestionRepository) {
        this.suggestionRepository = suggestionRepository;
    }
    @BeforeEach
    void setUp() {
        suggestionRepository.deleteAll();
    }

    @Test
    void givenSuggestion_whenSave_thenSuggestionId() {
        Suggestion suggestion = Suggestion.builder()
                .createAt(LocalDateTime.now())
                .description("Jugar futbol bien")
                .build();
        suggestionRepository.save(suggestion);
        assertNotNull(suggestion.getId());
    }
}