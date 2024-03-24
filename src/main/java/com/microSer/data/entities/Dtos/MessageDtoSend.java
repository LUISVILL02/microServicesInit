package com.microSer.data.entities.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDtoSend {
    private String id;
    private UserDtoSend emission;
    private UserDtoSend destination;
    private LocalDateTime createAt;
    private String content;
}
