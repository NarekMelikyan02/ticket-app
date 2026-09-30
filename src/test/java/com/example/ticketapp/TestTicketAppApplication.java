package com.example.ticketapp;

import org.springframework.boot.SpringApplication;

public class TestTicketAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(TicketAppApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
