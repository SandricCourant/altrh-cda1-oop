package org.example.providers;

import org.example.domain.JetType;

import java.util.ArrayList;
import java.util.List;

public class JetTypeProvider {

    private List<JetType> data;

    public JetTypeProvider() {
        data = new ArrayList<>();
        data.add(new JetType("Hypersonic"));
        data.add(new JetType("Confort"));
        data.add(new JetType("Eco"));
    }

    public List<JetType> provide() {
        return data;
    }

    public JetType find(int index) {
        return data.get(index);
    }

}
