package com.example.ticketapp.domain.flight;

import java.time.Instant;
import java.util.UUID;

import jakarta.annotation.Nonnull;

public record Flight(
    @Nonnull UUID flightId,
    @Nonnull String aviaCompanyName,
    @Nonnull String flightNumber,
    @Nonnull Instant scheduledAt,
    @Nonnull Instant landsAt,
    @Nonnull UUID departureAirportId,
    @Nonnull UUID destinationAirportId
)
{
}
