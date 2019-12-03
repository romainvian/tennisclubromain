package com.example.tennisclub.repository;

import com.example.tennisclub.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User getUserByBirthday (Date birthday);
    User getUserById (long id);

}
