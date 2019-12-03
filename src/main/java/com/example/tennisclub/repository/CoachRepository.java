package com.example.tennisclub.repository;

import com.example.tennisclub.Entity.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends CrudRepository<Coach, Long> {
    Coach getCoachByName (String name);
    Coach getCoachByAvailable (boolean isAvailable);

}
