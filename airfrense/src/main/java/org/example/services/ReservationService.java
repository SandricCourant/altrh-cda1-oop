package org.example.services;

import org.example.domain.JetType;
import org.example.domain.Reservation;
import org.example.domain.ReservationRequest;
import org.example.providers.JetTypeProvider;
import org.example.providers.ReservationProvider;

import java.util.List;

public class ReservationService {

    private static int currentReference = 238394;

    private final JetTypeProvider jetTypeProvider;
    private final ReservationProvider reservationProvider;

    public ReservationService(JetTypeProvider jetTypeProvider, ReservationProvider reservationProvider) {
        this.jetTypeProvider = jetTypeProvider;
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

    public List<JetType> getJetTypes() {
        return jetTypeProvider.provide();
    }

    public JetType find(int index) {
        return jetTypeProvider.find(index);
    }

}
