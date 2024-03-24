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
public class GameDtoSave {
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

}
