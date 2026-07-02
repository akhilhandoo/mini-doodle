package com.mdoodle.representation;

import java.time.Instant;

public record CreateTimeSlotRequest(Instant beginTime, int durationInMinutes) {}
