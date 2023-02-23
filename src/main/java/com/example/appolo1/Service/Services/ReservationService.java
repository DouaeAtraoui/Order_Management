package com.example.appolo1.Service.Services;

import com.example.appolo1.Entity.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {
    Reservation consultReservation(Long id);
    List<Reservation> consultAllReservations();
    void addReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    Boolean validateReservation(Long id);

}
