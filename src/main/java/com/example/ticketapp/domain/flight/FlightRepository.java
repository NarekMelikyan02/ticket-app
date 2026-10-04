package com.example.ticketapp.domain.flight;

import jakarta.annotation.Nonnull;

public interface FlightRepository
{

    void save(@Nonnull Flight flight);
}
