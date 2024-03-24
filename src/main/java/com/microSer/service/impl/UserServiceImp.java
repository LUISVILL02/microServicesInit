package com.microSer.service.impl;

import com.microSer.data.entities.Dtos.UserDtoSave;
import com.microSer.data.entities.Dtos.UserDtoSend;
import com.microSer.data.entities.User;
import com.microSer.data.entities.mapper.UserMapper;
import com.microSer.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp extends ServiceImp<UserDtoSave, UserDtoSend, User> {
    protected UserServiceImp(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }
}
