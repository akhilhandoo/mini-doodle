package com.mdoodle.controller;

import com.mdoodle.representation.CreateTimeSlotRequest;
import com.mdoodle.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mdoodle")
public class DoodleController {

    private final CalendarService calendarService;

    @PostMapping(value = "/users/{userId}/slots", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> createTimeSlot(
            @PathVariable("userId") Long userId,
            @RequestBody CreateTimeSlotRequest createTimeSlotRequest) {
        return ResponseEntity.ok(calendarService.createTimeSlot(userId, createTimeSlotRequest));
    }
}