package com.example.ticketapp.port.adapter.repository;

import com.example.ticketapp.domain.flight.Flight;
import com.example.ticketapp.domain.flight.FlightRepository;
import jakarta.annotation.Nonnull;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PostgresFlightRepository implements FlightRepository
{

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public PostgresFlightRepository(NamedParameterJdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    @Override
    public void save(@Nonnull Flight flight)
    {
        var query = """
            insert into flights (id, number, scheduled_at, lands_at, departure_airport_id, destination_airport_id)
            values (:flight_id, :number, :scheduled_at, :lands_at, :departure_airport_id, :destination_airport_id)
            """;
        var params = new MapSqlParameterSource()
            .addValue("flight_id", flight.flightId())
            .addValue("number", flight.flightNumber())
            .addValue("scheduled_at", flight.scheduledAt())
            .addValue("lands_at", flight.landsAt())
            .addValue("departure_airport_id", flight.departureAirportId())
            .addValue("destination_airport_id", flight.departureAirportId());

        this.jdbcTemplate.update(
            query,
            params
        );
    }
}
