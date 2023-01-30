package org.example.services;

import org.example.domain.Reservation;
import org.example.domain.ReservationRequest;
import org.example.providers.ReservationProvider;

public class ReservationService {

    private static int currentReference = 238394;
    private final ReservationProvider reservationProvider;

    public ReservationService(ReservationProvider reservationProvider) {
        this.reservationProvider = reservationProvider;
    }

    public Reservation book(ReservationRequest request) {
        Reservation result = new Reservation(request, ReservationService.currentReference);
        reservationProvider.add(result);
        ReservationService.currentReference++;
        return result;
    }

    public void cancel(int reference) {
        reservationProvider.delete(reference);
    }

}
