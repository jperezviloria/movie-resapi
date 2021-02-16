package com.cinema.movie.repository;

import com.cinema.movie.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query(value = "SELECT COUNT(id_local) FROM cineDB.dbo.ticket WHERE id_local = :idLocal", nativeQuery = true)
    int getTicketSalesByIdLocal(@Param("idLocal") int idLocal);

    @Query(value = "SELECT COUNT(id_movie) FROM cineDB.dbo.ticket WHERE id_movie = :idMovie", nativeQuery = true)
    int getTicketSalesByIdMovie(@Param("idMovie") int idMovie);




}
