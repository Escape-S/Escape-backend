package com.escapes.server.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;

    @CreationTimestamp
    @Column(name = "created_time_at")
    private LocalDateTime createdTimeAt;
    @UpdateTimestamp
    @Column(name = "update_time_at")
    private LocalDateTime updateTimeAt;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<UserLikeTheme> themes = new ArrayList<>();
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Review> reviews = new ArrayList<>();
}
