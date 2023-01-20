package org.example.controllers;

import org.example.domain.JetType;
import org.example.domain.Reservation;
import org.example.domain.ReservationRequest;
import org.example.services.ReservationService;

import java.util.ArrayList;
import java.util.List;

public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    public int book(int jetTypeIndex, String fullname, String departure, String arrival, String startAt, String endAt) {
        JetType jetType = reservationService.find(jetTypeIndex);
        ReservationRequest request = new ReservationRequest(jetType, fullname, departure, arrival, startAt, endAt);
        Reservation reservation = reservationService.book(request);
        return reservation.getReference();
    }

    public void cancel(int reference) {
        reservationService.cancel(reference);
    }

    public List<String> getJetTypes() {
        List<String> result = new ArrayList<>();

        List<JetType> jetTypes = reservationService.getJetTypes();
        for (JetType j : jetTypes) {
            result.add(j.toString());
        }

        return result;
    }

}
