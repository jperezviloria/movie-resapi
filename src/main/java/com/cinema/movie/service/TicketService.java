package com.cinema.movie.service;

import com.cinema.movie.model.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    List<Ticket> getAllTickets();

    Optional<Ticket> getTicketById(int idTicket);

    String saveTicket(Ticket ticket);

    int getTicketSalesByIdLocal(int idLocal);

    int getTicketSalesByIdMovie(int idMovie);



}
