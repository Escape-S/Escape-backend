package com.escapes.server.controller;

import com.escapes.server.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/room/create")
    public String save(@RequestParam String name) {
        Long savedId = roomService.save(name);

        return "Successfully saved - ID : " + savedId + " Room name : " + name;
    }

}
