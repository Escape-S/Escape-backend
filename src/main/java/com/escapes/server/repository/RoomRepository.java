package com.escapes.server.repository;

import com.escapes.server.entity.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class RoomRepository {

    private final EntityManager em;

    public Long save(String name) {

        Room room = new Room();
        room.setName(name);
        em.persist(room);
        return room.getId();
    }

}
