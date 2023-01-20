package org.example;

import org.example.controllers.ReservationController;
import org.example.providers.JetTypeProvider;
import org.example.providers.ReservationProvider;
import org.example.services.ReservationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JetTypeProvider maxime = new JetTypeProvider();
        ReservationProvider sophie = new ReservationProvider();
        ReservationService nicolas = new ReservationService(maxime, sophie);
        ReservationController bertrand = new ReservationController(nicolas);

        // --------------------------------------------------------------------------

        System.out.println("Bienvenue dans le logiciel de reservation");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Que souhaitez-vous faire ? ('r' pour réserver)");
            String saisie = scanner.nextLine();
            if (saisie.equals("r")) {
                System.out.println(bertrand.getJetTypes());
                System.out.println("Choisir le type de jet : ");
                saisie = scanner.nextLine();
                int jetTypeIndex = Integer.parseInt(saisie);
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

                int reference = bertrand.book(jetTypeIndex, fullname, departure, arrival, startAt, endAt);
                System.out.println("Réservation faite, avec référence : " + reference);
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