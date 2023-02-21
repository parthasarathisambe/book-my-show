package com.book.my.show.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.my.show.entities.Auditorium;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, UUID> {

}
