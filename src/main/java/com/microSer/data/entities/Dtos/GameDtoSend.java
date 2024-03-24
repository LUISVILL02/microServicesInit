package com.microSer.data.entities.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameDtoSend {
    private Long Id;
    private String creator;
    private String sport;
    private String city;
    private String province;
    private LocalDateTime date;
    private LocalDateTime startTime;
    private Integer participants;
    private Integer subs;
    private String comments;
    List<UserDtoSend> listUsers;
}
