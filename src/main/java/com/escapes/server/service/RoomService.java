package com.escapes.server.service;

import com.escapes.server.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public Long save(String roomName) {
        return roomRepository.save(roomName);
    }

}
