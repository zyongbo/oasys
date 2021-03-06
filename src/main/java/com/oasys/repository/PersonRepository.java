package com.oasys.repository;

import com.oasys.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByUsername(@Param("username") String username);

    List<Person> findByNameContainingIgnoreCase(String name);
}
