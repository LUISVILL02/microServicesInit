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
public class SuggestionDtoSave {
    private Long Id;
    private String description;
    private LocalDateTime createAt;
}
