package com.microSer.data.entities.Dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoSave {
    private Long Id;
    @Email(message = "The email is not valid")
    private String email;
    private String name;
    private String lastName;
    @Min(value = 10, message = "The age must be greater than 10")
    private Integer age;
    private String password;
    private String resPassword;
    private String rol;
    private String picture;
    private Boolean enable;
    @JsonFormat(pattern = "dd/MM/yyyy",timezone = "GMT-5")
    @NotNull(message = "The date cannot be empty")
    private LocalDate createAt;
}
