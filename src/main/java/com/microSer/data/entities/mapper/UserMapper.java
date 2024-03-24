package com.microSer.data.entities.mapper;

import com.microSer.data.entities.Dtos.UserDtoSave;
import com.microSer.data.entities.Dtos.UserDtoSend;
import com.microSer.data.entities.User;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper extends Mapperr<UserDtoSave, UserDtoSend, User>{
    UserDtoSave toEntityDtoSave(User user);
    User dtoSaveToEntity(UserDtoSave userDtoSave);

    UserDtoSend toEntityDtoSend(User user);
    User dtoSendToEntity(UserDtoSend userDtoSend);
}
