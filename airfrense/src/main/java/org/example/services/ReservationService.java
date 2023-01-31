package org.example.services;

import org.example.domain.Reservation;
import org.example.domain.ReservationRequest;
import org.example.domain.VehiculeCategory;
import org.example.providers.ReservationProvider;

import java.util.List;

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

    public List<Reservation> list(VehiculeCategory vehiculeCategory) {
        return reservationProvider.findByCategory(vehiculeCategory);
    }

    public Reservation findByReference(int reference) {
        return reservationProvider.findByReference(reference);
    }

    public Reservation changeReservationClien(Reservation a, String client) {
        a.setFullname(client);
        return reservationProvider.update(a);
    }

}
