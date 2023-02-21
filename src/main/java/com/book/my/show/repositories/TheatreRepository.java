package com.book.my.show.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.my.show.entities.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, UUID> {

}
