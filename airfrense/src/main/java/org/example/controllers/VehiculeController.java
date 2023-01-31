package org.example.controllers;

import org.example.domain.VehiculeCategory;
import org.example.services.VehiculeService;

public class VehiculeController {

    private final VehiculeService vehiculeService;

    public VehiculeController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    public boolean createCategory(String name) {
        vehiculeService.createCategory(name);
        return true;
    }

    public boolean createSubCategory(int categoryIndex, String name) {
        VehiculeCategory category = vehiculeService.findCategory(categoryIndex);
        vehiculeService.createSubCategory(category, name);
        return true;
    }

}
