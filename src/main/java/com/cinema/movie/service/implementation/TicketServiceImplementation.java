package com.cinema.movie.service.implementation;

import com.cinema.movie.model.Ticket;
import com.cinema.movie.repository.TicketRepository;
import com.cinema.movie.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImplementation implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> getTicketById(int idTicket) {
        return ticketRepository.findById(idTicket);
    }

    @Override
    public String saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
        return "OK";
    }

    @Override
    public int getTicketSalesByIdLocal(int idLocal) {
        return ticketRepository.getTicketSalesByIdLocal(idLocal);
    }

    @Override
    public int getTicketSalesByIdMovie(int idMovie) {
        return ticketRepository.getTicketSalesByIdMovie(idMovie);
    }
}
