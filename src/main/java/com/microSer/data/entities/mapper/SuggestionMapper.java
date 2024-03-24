package com.microSer.data.entities.mapper;

import com.microSer.data.entities.Dtos.SuggestionDtoSave;
import com.microSer.data.entities.Dtos.SuggestionDtoSend;
import com.microSer.data.entities.Suggestion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SuggestionMapper extends Mapperr<SuggestionDtoSave, SuggestionDtoSend, Suggestion>{
    SuggestionDtoSave toEntityDtoSave(Suggestion suggestion);
    Suggestion dtoSaveToEntity(SuggestionDtoSave suggestionDtoSave);

    SuggestionDtoSend toEntityDtoSend(Suggestion suggestion);
    Suggestion dtoSendToEntity(SuggestionDtoSend suggestionDtoSend);
}
