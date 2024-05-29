package com.example.ReservationManagement.controller;

import com.example.ReservationManagement.entity.BookTable;
import com.example.ReservationManagement.service.BookTableService;
import com.example.ReservationManagement.service.impl.BookTableImpl;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReservationsController {


    @Autowired
    private BookTableService bookTableService;


    @GetMapping("/reservations")
    @ResponseBody
    public String bookTable() {
         List<Long> reservedTables = new ArrayList<>();

         List<BookTable> bookTables=bookTableService.getAllReservations();


        //reservedTables.add(reservedTables);

        return ("Reservation made successfully, Reservation ID: "+""+ HttpStatus.CREATED);


        //return "Table Booked Successfully";

    }



//    @GetMapping("/reservations/{id}")
//    @ResponseBody
//    public String getRervationDetails() {
//        return "Table Booked Successfully";
//    }



    @RequestMapping("/reservations/{id}")
    @ResponseBody
    public String updateReservation() {
        return "Reservation Updated Sucessfully";
    }

//    @RequestMapping("/reservations/{id}")
//    @ResponseBody
//    public String cancelReservation() {
//        return "Reservation cancelled Sucessfully";
//    }

    @RequestMapping("/tables/availability")
    @ResponseBody
    public String checkAvailability() {
        return "Tables Available";
    }

}

