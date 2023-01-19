package org.example;


import org.example.controllers.SearchController;
import org.example.providers.CompanyProvider;
import org.example.providers.EntityProvider;
import org.example.providers.PersonProvider;
import org.example.services.SearchService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityProvider sophie = new CompanyProvider();
        EntityProvider maxime = new PersonProvider();

        List<EntityProvider> providers = new ArrayList<>();
        providers.add(sophie);
        providers.add(maxime);

        SearchService elliot = new SearchService(providers);

        SearchController annie = new SearchController(elliot);

        System.out.println(annie.servir("o"));

    }
}
