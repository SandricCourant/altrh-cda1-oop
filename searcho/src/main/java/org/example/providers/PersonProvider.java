package org.example.providers;

import org.example.domain.Entity;
import org.example.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonProvider extends EntityProvider {

    @Override()
    public List<Entity> fournir(String text) {

        Person vincent = new Person("Vincent", "Time");
        Person annie = new Person("Annie", "Versaire");
        Person john = new Person("Johnathan", "Pasdetoi");

        List<Entity> entities = new ArrayList<>();
        entities.add(vincent);
        entities.add(annie);
        entities.add(john);

        List<Entity> results = new ArrayList<>();
        for (Entity e: entities) {
            if (e.match(text)) {
                results.add(e);
            }
        }

        return results;
    }

}
