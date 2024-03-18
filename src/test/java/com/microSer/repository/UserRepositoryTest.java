package com.microSer.repository;

import com.microSer.IntegrationDbRepositoryTest;
import com.microSer.data.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryTest extends IntegrationDbRepositoryTest {
    UserRepository userRepository;

    @Autowired
    UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void initMockUsers(){
        User user1 = User.builder()
                .email("Luisvill@gmail.com")
                .name("Luis")
                .lastName("villamil")
                .age(20)
                .password("1234")
                .resPassword("1234")
                .enable(true)
                .picture("https://www.google.com")
                .rol("admin")
                .createAt(LocalDateTime.now())
                .build();
        userRepository.save(user1);

        User user2 = User.builder()
                .email("Angel@gmail.com")
                .name("Angel")
                .lastName("Perez")
                .age(22)
                .password("123")
                .resPassword("12")
                .enable(true)
                .picture("https://www.google.com")
                .rol("user")
                .createAt(LocalDateTime.now())
                .build();
        userRepository.save(user2);
    }

    @BeforeEach
    void setUp() {
        userRepository.deleteAll();
    }

    @Test
    void findByNameAndLastName() {
        initMockUsers();
        List<User> userList = userRepository.findByNameAndLastName("Luis", "villamil");
        assertThat(userList).isNotEmpty();
        assertThat(userList.get(0).getName()).isEqualTo("Luis");
    }
    @Test
    void givenUsers_whenSave_thenUserId(){
        User user1 = User.builder()
                .email("Luisvill@gmail.com")
                .name("Luis")
                .lastName("villamil")
                .age(20)
                .password("1234")
                .resPassword("1234")
                .enable(true)
                .picture("https://www.google.com")
                .rol("admin")
                .createAt(LocalDateTime.now())
                .build();
        User userSave = userRepository.save(user1);
        assertThat(userSave.getIdUser()).isNotNull();
    }
}