package com.example.ticketapp.application.flight;

import java.util.UUID;

import com.example.ticketapp.application.flight.command.CreateFlightCommand;
import com.example.ticketapp.application.flight.command.FlightCommand;
import com.example.ticketapp.application.flight.model.CreateFlightNumberPayload;
import com.example.ticketapp.domain.flight.Flight;
import com.example.ticketapp.domain.flight.FlightRepository;
import jakarta.annotation.Nonnull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FlightApplicationService
{

    private final FlightRepository flightRepository;

    public FlightApplicationService(FlightRepository flightRepository) {this.flightRepository = flightRepository;}

    public void process(FlightCommand command)
    {
        switch (command)
        {
            case CreateFlightCommand createFlightCommand -> this.flightRepository.save(
                new Flight(
                    UUID.randomUUID(),
                    generateFlightNumber()
                    )
            );
        }
    }

    @Nonnull
    private String generateFlightNumber(CreateFlightNumberPayload payload)
    {
        var res = new StringBuilder()
            .append(flight);

        return res.toString();
    }
}
