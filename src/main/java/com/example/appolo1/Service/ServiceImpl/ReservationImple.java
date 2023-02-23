package com.example.appolo1.Service.ServiceImpl;

import com.example.appolo1.Entity.Reservation;
import com.example.appolo1.Repository.ReservationRepository;
import com.example.appolo1.Service.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class ReservationImple implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public Reservation consultReservation(Long id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public List<Reservation> consultAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public void addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        Reservation existingReservation = reservationRepository.findById(reservation.getId()).orElse(null);
        if (existingReservation != null){
            existingReservation.setLabel(existingReservation.getLabel());
            existingReservation.setTitre(existingReservation.getTitre());
            existingReservation.setDescription(existingReservation.getDescription());
        }
    }

    @Override
    public Boolean validateReservation(Long id) {
        Reservation existingReservation = reservationRepository.findById(id).orElse(null);
        if (existingReservation != null){
            existingReservation.setStatus(existingReservation.getStatus());
            return true;
        }
        return false;
    }
}
