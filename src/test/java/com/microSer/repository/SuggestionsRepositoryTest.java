package com.microSer.repository;

import com.microSer.IntegrationDbRepositoryTest;
import com.microSer.data.entities.Suggestions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class SuggestionsRepositoryTest extends IntegrationDbRepositoryTest {

    SuggestionsRepository suggestionsRepository;

    @Autowired
    public SuggestionsRepositoryTest(SuggestionsRepository suggestionsRepository) {
        this.suggestionsRepository = suggestionsRepository;
    }
    @BeforeEach
    void setUp() {
        suggestionsRepository.deleteAll();
    }

    @Test
    void givenSuggestion_whenSave_thenSuggestionId() {
        Suggestions suggestion = Suggestions.builder()
                .createAt(LocalDateTime.now())
                .description("Jugar futbol bien")
                .build();
        suggestionsRepository.save(suggestion);
        assertNotNull(suggestion.getId());
    }
}