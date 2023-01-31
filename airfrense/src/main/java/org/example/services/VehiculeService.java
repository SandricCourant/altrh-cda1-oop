package org.example.services;

import org.example.domain.VehiculeCategory;
import org.example.domain.VehiculeSubCategory;
import org.example.providers.VehiculeCategoryProvider;
import org.example.providers.VehiculeSubCategoryProvider;

import java.util.List;

public class VehiculeService {

    private final VehiculeCategoryProvider vehiculeCategoryProvider;
    private final VehiculeSubCategoryProvider vehiculeSubCategoryProvider;

    public VehiculeService(VehiculeCategoryProvider vehiculeCategoryProvider,
                           VehiculeSubCategoryProvider vehiculeSubCategoryProvider) {

        this.vehiculeCategoryProvider = vehiculeCategoryProvider;
        this.vehiculeSubCategoryProvider = vehiculeSubCategoryProvider;
    }

    public List<VehiculeCategory> listCategory() {
        return vehiculeCategoryProvider.provide();
    }

    public List<VehiculeSubCategory> listSubCategory(VehiculeCategory vehiculeCategory) {
        return vehiculeSubCategoryProvider.findBy(vehiculeCategory);
    }

    public VehiculeCategory findCategory(int index) {
        return vehiculeCategoryProvider.find(index);
    }

    public VehiculeSubCategory findSubCateogry(VehiculeCategory vehiculeCategory, int index) {
        return vehiculeSubCategoryProvider.find(vehiculeCategory, index);
    }

    public VehiculeCategory createCategory(String name) {
        return vehiculeCategoryProvider.create(name);
    }

    public VehiculeSubCategory createSubCategory(VehiculeCategory category, String name) {
        return vehiculeSubCategoryProvider.create(category, name);
    }

}
