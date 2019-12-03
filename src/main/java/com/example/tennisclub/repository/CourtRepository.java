package com.example.tennisclub.repository;

import com.example.tennisclub.Entity.Court;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CourtRepository extends CrudRepository<Court, Long> {
    Court getCourtById (Long id);
    Court getCourtByAvailable (boolean isAvailable);
    Court getCourtByDateOfReservation (Date dateofreservation);
}
