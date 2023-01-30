package org.example.controllers;

import org.example.domain.Reservation;
import org.example.domain.ReservationRequest;
import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;
import org.example.services.ReservationService;
import org.example.services.VehiculeService;

import java.util.ArrayList;
import java.util.List;

public class ReservationController {


    private final ReservationService reservationService;
    private final VehiculeService vehiculeService;

    public ReservationController(ReservationService reservationService,
                                 VehiculeService vehiculeService) {
        this.reservationService = reservationService;
        this.vehiculeService = vehiculeService;
    }

    public String book(int vehiculeCategoryIndex, int vehiculeSubCategoryIndex, String fullname, String departure, String arrival, String startAt, String endAt) {
        // On récupère la categorie et la sous-catégorie
        VehiculeCategory category = vehiculeService.findCategory(vehiculeCategoryIndex);
        VehiculeSubCategory subCategory = vehiculeService.findSubCateogry(category, vehiculeSubCategoryIndex);

        // On crée la demande de réservation
        ReservationRequest request = new ReservationRequest(category, subCategory, fullname, departure, arrival, startAt, endAt);

        // On réserve
        Reservation reservation = reservationService.book(request);

        return Integer.toString(reservation.getReference()) + " = " + reservation.getVehiculeCategory().toString() + ", " + reservation.getVehiculeSubCategory().toString();
    }

    public void cancel(int reference) {
        reservationService.cancel(reference);
    }


    public List<String> listVehiculeCategories() {
        List<String> results = new ArrayList<>();
        for (VehiculeCategory c : vehiculeService.listCategory()) {
            results.add(c.toString());
        }

        return results;
    }

    public List<String> listVehiculeSubCategories(int vehiculeCategoryIndex) {
        VehiculeCategory category = vehiculeService.findCategory(vehiculeCategoryIndex);
        List<String> results = new ArrayList<>();
        for (VehiculeSubCategory c : vehiculeService.listSubCategory(category)) {
            results.add(c.toString());
        }

        return results;
    }


}
