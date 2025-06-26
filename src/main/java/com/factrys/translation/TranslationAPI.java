package com.factrys.translation;

import cn.nukkit.Player;
import cn.nukkit.utils.Config;

import java.util.Map;

public class TranslationAPI {
    private final String name;
    private final Map<String, Config> languageConfigs;
    private final String defaultLanguage;

    public TranslationAPI(String name, Map<String, Config> configs) {
        this.name = name;
        this.languageConfigs = configs;
        this.defaultLanguage = Loader.getDefaultLanguage();
    }

    public String getName() {
        return this.name;
    }

    public Config getConfig(String language) {
        return languageConfigs.get(language);
    }

    public String translate(String language, String key) {
        Config config = languageConfigs.getOrDefault(language,
                languageConfigs.get(defaultLanguage));
        return config.getString(key, key);
    }

    public String translate(Player player, String key) {
        String language = player.getLoginChainData().getLanguageCode();
        return translate(language, key);
    }
}
