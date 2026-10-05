package com.example.ticketapp.application.flight.command;

import java.time.Instant;
import java.util.UUID;

import jakarta.annotation.Nonnull;

public record CreateFlightCommand(
    @Nonnull String aviaCompanyName,
    @Nonnull Instant scheduledAt,
    @Nonnull Instant landsAt,
    @Nonnull UUID departureAirportId,
    @Nonnull UUID destinationAirportId
) implements FlightCommand
{
}
