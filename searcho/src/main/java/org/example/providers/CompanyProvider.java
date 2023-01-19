package org.example.providers;

import org.example.domain.Company;
import org.example.domain.Entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyProvider extends EntityProvider {

    @Override()
    public List<Entity> fournir(String text) {
        Entity google = new Company("Google");
        Entity microsoft = new Company("Microsoft");
        Entity apple = new Company("Apple");
        Entity[] entities = { google, microsoft, apple };

        List<Entity> results = new ArrayList<>();
        for (Entity e: entities) {
            if (e.match(text)) {
                results.add(e);
            }
        }

        return results;
    }

}
