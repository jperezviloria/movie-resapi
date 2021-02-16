package com.cinema.movie.controller;

import com.cinema.movie.dto.RestResponse;
import com.cinema.movie.model.Ticket;
import com.cinema.movie.service.implementation.TicketServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    TicketServiceImplementation ticketServiceImplementation;

    @GetMapping("/get-all")
    public RestResponse<List<Ticket>> getAllTickets(){
        List<Ticket> tickets = null;
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        try{
            List<Ticket> response = ticketServiceImplementation.getAllTickets();
            if(!response.isEmpty()){
                httpStatus = HttpStatus.OK;
                tickets = response;
            }else{
                httpStatus = HttpStatus.NO_CONTENT;
            }
        }catch (Exception e){
            e.getCause();
        }
        return new RestResponse<>(httpStatus,tickets);
    }


    @PostMapping("/save")
    public RestResponse<String> saveTicket(@RequestBody Ticket ticket) throws Exception{
        String particularTicket = null;
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        try{
            String response = ticketServiceImplementation.saveTicket(ticket);
            if(response != null){
                httpStatus = HttpStatus.OK;
                particularTicket = response;
            }else{
                httpStatus = HttpStatus.NO_CONTENT;
            }
        }catch (Exception e){
            e.getCause();
        }
        return new RestResponse<>(httpStatus, particularTicket);
    }

    @GetMapping("/sales/local/{idLocal}")
    public int getByLocal(@PathVariable int idLocal){
        return ticketServiceImplementation.getTicketSalesByIdLocal(idLocal);
    }


}
