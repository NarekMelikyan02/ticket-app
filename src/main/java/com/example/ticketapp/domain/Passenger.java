package com.example.ticketapp.domain;

import java.util.UUID;

import jakarta.annotation.Nonnull;

public record Passenger(
    @Nonnull UUID passengerId,
    @Nonnull String name,
    @Nonnull String email,
    @Nonnull Integer age,
    @Nonnull String phoneNumber
)
{
}
