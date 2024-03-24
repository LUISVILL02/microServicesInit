package com.microSer.data.entities.mapper;

import com.microSer.data.entities.Dtos.MessageDtoSave;
import com.microSer.data.entities.Dtos.MessageDtoSend;
import com.microSer.data.entities.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper extends Mapperr<MessageDtoSave, MessageDtoSend, Message>{
    MessageDtoSave toEntityDtoSave(Message message);
    Message dtoSaveToEntity(MessageDtoSave messageDtoSave);

    MessageDtoSend toEntityDtoSend(Message message);
    Message dtoSendToEntity(MessageDtoSend messageDtoSend);
}
