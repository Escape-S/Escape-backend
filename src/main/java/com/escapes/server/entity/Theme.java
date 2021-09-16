package com.escapes.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Float difficulty;
    private String genre;
    @Column(name = "poster_img")
    private byte[] posterImg;
    @Column(name = "booking_url")
    private String bookingUrl;

    @OneToMany(mappedBy = "theme", fetch = FetchType.LAZY)
    private List<UserLikeTheme> users = new ArrayList<>();

    @OneToMany(mappedBy = "theme", fetch = FetchType.LAZY)
    private List<RoomTheme> rooms = new ArrayList<>();

    @OneToMany(mappedBy = "theme", fetch = FetchType.LAZY)
    private List<Review> reviews = new ArrayList<>();
}
