package org.example.singleton;

import java.util.HashMap;

public class ConfigManager {

    private static ConfigManager instance = null;

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    private HashMap<String, String> configMap;

    private ConfigManager() {
        configMap = new HashMap<>();
    }

    public String getConfigValue(String key) {
        return configMap.get(key);
    }

}
