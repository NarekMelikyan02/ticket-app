create table if not exists airports
(
    id uuid primary key,
    name text
);

create table if not exists flights
(
    id uuid primary key,
    number text not null ,
    scheduled_at timestamp with time zone not null ,
    lands_at timestamp with time zone not null ,
    departure_airport_id uuid not null references airports(id),
    destination_airport_id uuid not null references airports(id)
)