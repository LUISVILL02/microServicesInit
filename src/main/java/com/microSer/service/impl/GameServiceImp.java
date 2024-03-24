package com.microSer.service.impl;

import com.microSer.data.entities.Dtos.GameDtoSave;
import com.microSer.data.entities.Dtos.GameDtoSend;
import com.microSer.data.entities.Game;
import com.microSer.data.entities.mapper.GameMapper;
import com.microSer.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImp extends ServiceImp<GameDtoSave, GameDtoSend, Game>{
    protected GameServiceImp(GameRepository repository, GameMapper mapper) {
        super(repository, mapper);
    }
}
