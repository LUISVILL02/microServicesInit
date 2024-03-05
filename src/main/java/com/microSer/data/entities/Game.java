package com.microSer.data.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "partidas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_game")
    private Long idGame;
    private String creator;
    private String sport;
    private String city;
    private String province;
    private LocalDateTime date;
    @Column(name = "start_time")
    private LocalDateTime startTime;
    private Integer participants;
    private Integer subs;
    private String coments;
    @ManyToMany(mappedBy = "listGames")
    private List<User> users = new ArrayList<>();
}
