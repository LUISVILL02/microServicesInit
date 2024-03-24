package com.microSer.data.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdUser;
    @Column(unique = true)
    private String email;
    private String name;
    private String lastName;
    private Integer age;
    private String password;
    private String resPassword;
    private Boolean enable;
    private String picture;
    private String rol;
    private LocalDateTime createAt;
    @OneToMany(mappedBy = "user")
    private List<Suggestion> listSugestions;
    @OneToMany(mappedBy = "user")
    private List<Message> messages;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "list_games", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "game_id"))
    private List<Game> listGames = new ArrayList<>();
}
