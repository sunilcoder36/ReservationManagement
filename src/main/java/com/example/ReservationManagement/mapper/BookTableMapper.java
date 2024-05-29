package com.example.ReservationManagement.mapper;

import com.example.ReservationManagement.entity.BookTable;

import java.util.Optional;

public class BookTableMapper {


    public BookTable bookEntityToBook(BookTable entity) {
        BookTable bookTable = new BookTable();
        Optional.ofNullable(entity).ifPresent(
                b -> {
                    bookTable.setId(b.getId());
                    bookTable.setCustomer(b.getCustomer());
                    bookTable.setEmail(b.getEmail());
                    bookTable.setPhone(b.getPhone());
                    bookTable.setTme(b.getTme());
                    bookTable.setDte(b.getDte());
                    bookTable.setAvailable(b.isAvailable());
                    bookTable.setStaffAvailable(b.isStaffAvailable());


                });

        return bookTable;
    }

    public BookTable bookToBookEntity(BookTable bookTable){
        //BookTable bookTable = new BookTable();

        bookTable.getId();
        bookTable.setCustomer(bookTable.getCustomer());
        bookTable.setEmail(bookTable.getEmail());
        bookTable.setPhone(bookTable.getPhone());
        bookTable.setTme(bookTable.getTme());
        bookTable.setDte(bookTable.getDte());
        bookTable.setAvailable(bookTable.isAvailable());
        bookTable.setStaffAvailable(bookTable.isStaffAvailable());



        return bookTable;
    }

}
