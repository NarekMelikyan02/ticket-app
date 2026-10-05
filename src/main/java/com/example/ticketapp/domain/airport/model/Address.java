package com.example.ticketapp.domain.airport.model;

import jakarta.annotation.Nonnull;

public record Address(
    @Nonnull String country,
    @Nonnull String city,
    @Nonnull String street
)
{
}
