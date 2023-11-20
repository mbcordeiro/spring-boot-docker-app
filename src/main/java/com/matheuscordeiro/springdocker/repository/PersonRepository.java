package com.matheuscordeiro.springdocker.repository;

import com.matheuscordeiro.springdocker.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
