package com.example.ReservationManagement.repository;

import com.example.ReservationManagement.entity.BookTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookTableRepository extends JpaRepository<BookTable, Integer> {


    void persist(Optional<BookTable> entity);
}
