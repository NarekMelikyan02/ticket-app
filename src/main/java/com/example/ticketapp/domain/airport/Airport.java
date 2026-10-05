package com.example.ticketapp.domain.airport;

import java.util.List;
import java.util.UUID;

import com.example.ticketapp.domain.airport.model.Address;
import com.example.ticketapp.domain.airport.model.Gate;
import jakarta.annotation.Nonnull;

public record Airport(
    @Nonnull AirportId airportId,
    @Nonnull String airportName,
    @Nonnull List<Gate> gates,
    @Nonnull Address address
)
{

    @Nonnull
    public Airport withActiveGates()
    {

        return new Airport(
            this.airportId,
            this.airportName,
            this.gates.stream().filter(Gate::isActive)
                .toList(),
            this.address
        );
    }

    public record AirportId(@Nonnull UUID representation)
    {

        @Nonnull
        public String asText()
        {
            return this.representation.toString();
        }
    }
}
