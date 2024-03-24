package com.microSer.data.entities.mapper;

import com.microSer.data.entities.Dtos.GameDtoSave;
import com.microSer.data.entities.Dtos.GameDtoSend;
import com.microSer.data.entities.Game;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GameMapper extends Mapperr<GameDtoSave, GameDtoSend, Game>{
    GameDtoSave toEntityDtoSave(Game game);
    Game dtoSaveToEntity(GameDtoSave gameDtoSave);

    GameDtoSend toEntityDtoSend(Game game);
    Game dtoSendToEntity(GameDtoSend gameDtoSend);
}
