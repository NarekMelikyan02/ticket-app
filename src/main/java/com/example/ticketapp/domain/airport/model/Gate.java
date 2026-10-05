package com.example.ticketapp.domain.airport.model;

import jakarta.annotation.Nonnull;

public record Gate(
    @Nonnull Character gateSymbol,
    @Nonnull Integer gateNumber,
    boolean isActive
)
{

    public Gate
    {
        if (Character.isLowerCase(this.gateSymbol()))
        {
            throw new IllegalArgumentException(String.format(
                "Cannot assign lowercase character as gate symbol provided %s",
                this.gateSymbol()
            ));
        }
    }
}
