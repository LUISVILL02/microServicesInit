package com.microSer.service;

import com.microSer.data.entities.Dtos.UserDtoSave;
import com.microSer.data.entities.Dtos.UserDtoSend;
import com.microSer.data.entities.User;

public interface UserService extends Service<UserDtoSave, UserDtoSend, User> {

}
