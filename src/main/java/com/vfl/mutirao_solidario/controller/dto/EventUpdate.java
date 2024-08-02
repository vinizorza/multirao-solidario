package com.vfl.mutirao_solidario.controller.dto;

import com.vfl.mutirao_solidario.enums.Status;

public record EventUpdate(
        Long id,
        Long organizerId,
        String title,
        String description,
        String location,
        Integer minVolunteers,
        Integer maxVolunteers,
        Status status) {
}
