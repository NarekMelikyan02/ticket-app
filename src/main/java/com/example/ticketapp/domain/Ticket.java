package com.example.ticketapp.domain;

import jakarta.annotation.Nonnull;

import java.util.UUID;

public record Ticket(
    @Nonnull UUID ticketId,
    @Nonnull String seatNumber,
    @Nonnull UUID passengerId,
    @Nonnull UUID flightId
)
{
}
