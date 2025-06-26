package com.factrys.translation;

import cn.nukkit.Player;
import cn.nukkit.utils.Config;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranslationAPI {
    private static String DELAULT_LANGUAGE;
    private static List<String> ALL_LANGUAGES;
    private final Map<String, Config> translations = new HashMap<>();

    public void loadTranslations(Loader plugin) {
        plugin.saveDefaultConfig();
        DELAULT_LANGUAGE = plugin.getConfig().getString("default");
        ALL_LANGUAGES = plugin.getConfig().getStringList("languages");
    }

    public void builds(File dataFolder) {
        List<String> languages = this.getAllLanguages();
        for (String language : languages) {
            File langFile = new File(dataFolder, language + ".json");
            Config langConfig = new Config(langFile, Config.JSON);
            translations.put(language, langConfig);
        }
    }

    public String translate(String language, String key) {
        if (!translations.containsKey(language)) {
            language = this.getDefaultLanguage();
        }

        Config langConfig = translations.get(language);
        return langConfig.getString(key, key);
    }

    public String translate(Player player, String key) {
        String language = player.getLoginChainData().getLanguageCode();
        return translate(language, key);
    }

    public List<String> getAllLanguages() {
        return ALL_LANGUAGES;
    }

    public String getDefaultLanguage() {
        return DELAULT_LANGUAGE;
    }
}