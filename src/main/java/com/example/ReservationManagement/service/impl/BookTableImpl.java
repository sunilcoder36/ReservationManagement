package com.example.ReservationManagement.service.impl;

import com.example.ReservationManagement.entity.BookTable;
import com.example.ReservationManagement.mapper.BookTableMapper;
import com.example.ReservationManagement.repository.BookTableRepository;
import com.example.ReservationManagement.service.BookTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Optional.*;


@ComponentScan
@Service
public class BookTableImpl implements BookTableService {

    @Autowired
    private BookTableRepository bookTableRepository;


    BookTableMapper mapper;
    @Override
    public void saveReservation(BookTable table) {
        if (table.isAvailable()&& table.isStaffAvailable())
            bookTableRepository.save(table);
        else {
            System.out.println("Data NOT Saved ");
        }
    }

    @Override
    public List<BookTable> getAllReservations() {
        List<BookTable> findAll = bookTableRepository.findAll();
        return findAll;
    }

    @Override
    public BookTable getReservationById(int id) {
        return bookTableRepository.findById(id).orElse(null);
    }

    @Override
    public void updateReservation(BookTable reservation) {
        bookTableRepository.save(reservation);

         //Long id= bookTableRepository.findById(reservation.getId());
//        reservation = ofNullable(mapper.bookToBookEntity(reservation));
//        bookTableRepository.persist(reservation);
//        reservation.get();
    }


    private void getAllReservations(BookTable bookTable) {
    }

    @Override
    public void deleteReservationById(int id) {
        bookTableRepository.deleteById(id);

    }


}