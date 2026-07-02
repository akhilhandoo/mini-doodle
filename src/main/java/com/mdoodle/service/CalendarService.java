package com.mdoodle.service;

import com.mdoodle.representation.CreateTimeSlotRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@RequiredArgsConstructor
@Service
public class CalendarService {

    // Canned data for time being.
    public Long createTimeSlot(Long userId, CreateTimeSlotRequest request) {
        return 1L;
    }
}
