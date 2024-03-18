package com.microSer.repository;

import com.microSer.IntegrationDbRepositoryTest;
import com.microSer.data.entities.Message;
import com.microSer.data.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class MessageRepositoryTest extends IntegrationDbRepositoryTest {

    MessageRepository messageRepository;

    UserRepository userRepository;

    @Autowired
    public MessageRepositoryTest(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    @BeforeEach
    void setUp() {
        messageRepository.deleteAll();
    }

    Message saveMessage() {
        User user = User.builder()
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
        userRepository.save(user);
        Message message = Message.builder()
                .user(user)
                .content("Hola")
                .createAt(LocalDateTime.now())
                .creator(user.getName())
                .destinatary("Angel")
                .build();
        return messageRepository.save(message);
    }

   @Test
   void givenMessage_whenSave_thenMessageId() {
        Message message = saveMessage();
        assertThat(message.getIdMessage()).isNotNull();
    }
    @Test
    void findByid_user() {
        Message message = saveMessage();
        List<Message> listMessage = messageRepository.findByIdUser(message.getUser().getIdUser());
        assertThat(messageRepository.findByIdUser(message.getUser().getIdUser())).isNotEmpty();
        assertThat(listMessage.get(0).getUser().getIdUser()).isEqualTo(message.getUser().getIdUser());
    }
}