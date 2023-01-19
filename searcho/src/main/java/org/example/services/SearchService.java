package org.example.services;

import org.example.domain.Entity;
import org.example.providers.EntityProvider;

import java.util.ArrayList;
import java.util.List;

public class SearchService {

    private List<EntityProvider> entityProviders;
    public SearchService(List<EntityProvider> entityProviders) {
        this.entityProviders = entityProviders;
    }

    public List<Entity> chercher(String text) {
        List<Entity> results = new ArrayList<>();

        for (EntityProvider provider: entityProviders) {
            List<Entity> providerEntities = provider.fournir(text);

            for (Entity e : providerEntities) {
                results.add(e);
            }

        }

        return results;
    }

}
