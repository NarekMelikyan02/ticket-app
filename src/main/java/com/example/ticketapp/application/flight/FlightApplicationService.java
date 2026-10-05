package com.example.ticketapp.application.flight;

import java.util.UUID;

import com.example.ticketapp.application.flight.command.CreateFlightCommand;
import com.example.ticketapp.application.flight.command.FlightCommand;
import com.example.ticketapp.domain.flight.Flight;
import com.example.ticketapp.domain.flight.FlightRepository;
import io.vavr.control.Either;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FlightApplicationService
{

    private final FlightRepository flightRepository;

    public FlightApplicationService(FlightRepository flightRepository) {this.flightRepository = flightRepository;}

    public Either<RuntimeException, Flight> process(FlightCommand command)
    {
        switch (command)
        {
            case CreateFlightCommand createFlightCommand ->
            {
                try
                {
                    var flight = new Flight(
                        UUID.randomUUID(),
                        createFlightCommand.aviaCompanyName(),
                        createFlightCommand.scheduledAt(),
                        createFlightCommand.landsAt(),
                        createFlightCommand.departureAirportId(),
                        createFlightCommand.destinationAirportId()
                    );

                    this.flightRepository.save(flight);

                    return Either.right(flight);
                }
                catch (RuntimeException e)
                {
                    return Either.left(e);
                }
            }
        }
    }
}
