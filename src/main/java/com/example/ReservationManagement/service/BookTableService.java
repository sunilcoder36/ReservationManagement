package com.example.ReservationManagement.service;

import com.example.ReservationManagement.entity.BookTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookTableService {

    void saveReservation(BookTable table);

    List<BookTable> getAllReservations();

    BookTable getReservationById(int id);

    void updateReservation(BookTable reservation);

    void deleteReservationById(int id);
}
