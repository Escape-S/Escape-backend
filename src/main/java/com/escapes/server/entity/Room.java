package com.escapes.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    private String roomName;

}
