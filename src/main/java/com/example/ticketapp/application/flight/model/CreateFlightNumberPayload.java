package com.example.ticketapp.application.flight.model;

import java.util.UUID;

import jakarta.annotation.Nonnull;

public record CreateFlightNumberPayload(
    @Nonnull String aviacompanyName,

    )
{
}
