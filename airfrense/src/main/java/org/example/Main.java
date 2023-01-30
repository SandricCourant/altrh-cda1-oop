package org.example;

import org.example.controllers.ReservationController;
import org.example.providers.ReservationProvider;
import org.example.providers.VehiculeCategoryProvider;
import org.example.providers.VehiculeSubCategoryProvider;
import org.example.services.ReservationService;
import org.example.services.VehiculeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ReservationProvider sophie = new ReservationProvider();
        ReservationService nicolas = new ReservationService(sophie);

        VehiculeCategoryProvider maxime = new VehiculeCategoryProvider();
        VehiculeSubCategoryProvider theo = new VehiculeSubCategoryProvider();
        VehiculeService anna = new VehiculeService(maxime, theo);

        ReservationController bertrand = new ReservationController(nicolas, anna);

        // --------------------------------------------------------------------------

        System.out.println("Bienvenue dans le logiciel de reservation");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Que souhaitez-vous faire ? ('r' pour réserver)");
            String saisie = scanner.nextLine();
            if (saisie.equals("r")) {

                System.out.println(bertrand.listVehiculeCategories());
                System.out.println("Choisir la categorie de véhicule : ");
                saisie = scanner.nextLine();
                int vehiculeCategoryIndex = Integer.parseInt(saisie);


                System.out.println(bertrand.listVehiculeSubCategories(vehiculeCategoryIndex));
                System.out.println("Choisir la sous-categorie de ce véhicule : ");
                saisie = scanner.nextLine();
                int vehiculeSubCategoryIndex = Integer.parseInt(saisie);

                System.out.println("Nom du client : ");
                String fullname = scanner.nextLine();
                System.out.println("Ville de départ : ");
                String departure = scanner.nextLine();
                System.out.println("Ville d'arrivée : ");
                String arrival = scanner.nextLine();
                System.out.println("Date et heure de début de réservation : ");
                String startAt = scanner.nextLine();
                System.out.println("Date et heure de fin de réservation : ");
                String endAt = scanner.nextLine();

                String details = bertrand.book(vehiculeCategoryIndex, vehiculeSubCategoryIndex, fullname, departure, arrival, startAt, endAt);
                System.out.println("Réservation faite : " + details);
            } else {
                System.out.println("Quelle référence doit-on annuler ? ");
                saisie = scanner.nextLine();
                int reference = Integer.parseInt(saisie);
                bertrand.cancel(reference);
                System.out.println("Réservation annulée !");
            }
        }

    }
}