package com.example.ticketapp.domain.flight;

import io.vavr.control.Either;
import jakarta.annotation.Nonnull;

public interface FlightRepository
{

    Either<RuntimeException, Void> save(@Nonnull Flight flight);
}
