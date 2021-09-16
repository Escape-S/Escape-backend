package com.escapes.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String tel;
    private String homepage;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    private List<RoomTheme> themes = new ArrayList<>();
}
