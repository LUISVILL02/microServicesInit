package com.microSer.service.impl;

import com.microSer.data.entities.Dtos.MessageDtoSave;
import com.microSer.data.entities.Dtos.MessageDtoSend;
import com.microSer.data.entities.Message;
import com.microSer.data.entities.mapper.MessageMapper;
import com.microSer.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImp extends ServiceImp<MessageDtoSave, MessageDtoSend, Message>{
    protected MessageServiceImp(MessageRepository repository, MessageMapper mapper) {
        super(repository, mapper);
    }
}
