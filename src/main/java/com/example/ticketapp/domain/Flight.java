package com.example.ticketapp.domain;

import java.time.Instant;
import java.util.UUID;

import jakarta.annotation.Nonnull;

public record Flight(
    @Nonnull UUID flightId,
    @Nonnull String flightNumber,
    @Nonnull Instant flightTime,
    @Nonnull Instant estimatedLanding,
    @Nonnull UUID departureAirportId,
    @Nonnull UUID destinationAirportId
)
{
}
