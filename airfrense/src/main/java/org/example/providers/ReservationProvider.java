package org.example.providers;

import org.example.domain.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationProvider {

    private List<Reservation> reservations;

    public ReservationProvider() {
        reservations = new ArrayList<>();
    }

    public void add(Reservation reservation) {
        reservations.add(reservation);
    }

    public void delete(int reference) {
        for (Reservation r : reservations) {
            if (r.getReference() == reference) {
                reservations.remove(r);
                break;
            }
        }
    }

}
