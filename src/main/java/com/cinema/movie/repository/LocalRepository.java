package com.cinema.movie.repository;

import com.cinema.movie.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local, Integer> {

    @Query(value = "EXEC cineDB.dbo.saveLocal @Location = :location", nativeQuery = true)
    Local saveLocal(@Param("location") String location);

}
