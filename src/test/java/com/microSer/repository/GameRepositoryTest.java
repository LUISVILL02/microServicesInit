package com.microSer.repository;

import com.microSer.IntegrationDbRepositoryTest;
import com.microSer.data.entities.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class GameRepositoryTest extends IntegrationDbRepositoryTest {

    GameRepository gameRepository;

    @Autowired
    public GameRepositoryTest(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @BeforeEach
    void setUp() {
        gameRepository.deleteAll();
    }

    void mockGame() {
        Game game = Game.builder()
                .city("Bogota")
                .coments("regular el juego")
                .creator("Luis")
                .date(LocalDateTime.now())
                .participants(2)
                .sport("Futbol")
                .subs(2)
                .province("Cundinamarca")
                .startTime(LocalDateTime.now())
                .build();
        gameRepository.save(game);
    }

    @Test
    void givenGame_whenSave_thenGameId() {
        mockGame();
        Game game = gameRepository.findAll().get(0);
        assertNotNull(game.getIdGame());
    }
}