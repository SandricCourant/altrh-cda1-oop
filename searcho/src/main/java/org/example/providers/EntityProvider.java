package org.example.providers;

import org.example.domain.Entity;

import java.util.List;

public abstract class EntityProvider {

    public abstract List<Entity> fournir(String text);

}
