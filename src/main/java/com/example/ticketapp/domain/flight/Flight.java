package com.example.ticketapp.domain.flight;

import java.time.Instant;
import java.util.UUID;

import com.example.ticketapp.domain.airport.Airport;
import jakarta.annotation.Nonnull;

public record Flight(
    @Nonnull FlightId flightId,
    @Nonnull String aviaCompanyName,
    @Nonnull Instant scheduledAt,
    @Nonnull Instant landsAt,
    @Nonnull Airport.AirportId departureAirportId,
    @Nonnull Airport.AirportId destinationAirportId
)
{

    public record FlightId(@Nonnull UUID id)
    {

        @Nonnull
        public String asText()
        {
            return this.id.toString();
        }
    }
}
