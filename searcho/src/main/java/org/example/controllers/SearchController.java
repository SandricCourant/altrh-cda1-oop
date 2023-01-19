package org.example.controllers;

import org.example.domain.Entity;
import org.example.services.SearchService;

import java.util.ArrayList;
import java.util.List;

public class SearchController {

    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    public List<String> servir(String text) {
        List<Entity> entities = searchService.chercher(text);

        List<String> results = new ArrayList<>();
        for (Entity e : entities) {
            results.add(e.toString());
        }

        return results;
    }

}
