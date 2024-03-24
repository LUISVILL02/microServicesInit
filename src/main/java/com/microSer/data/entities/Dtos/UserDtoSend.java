package com.microSer.data.entities.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoSend {
    private Long Id;
    private String email;
    private String name;
    private String lastName;
    private Integer age;
    private String rol;
    private String picture;
    private Boolean enable;
    private LocalDate createAt;
}
