package com.factrys.translation;

import cn.nukkit.plugin.PluginBase;

import java.util.List;

public class Loader extends PluginBase {
    private static String DEFAULT_LANGUAGE;
    private static List<String> ALL_LANGUAGES;

    @Override
    public void onEnable() {
        this.loadTranslations();
    }

    public void loadTranslations() {
        this.saveDefaultConfig();
        DEFAULT_LANGUAGE = this.getConfig().getString("default");
        ALL_LANGUAGES = this.getConfig().getStringList("languages");
    }

    public static List<String> getAllLanguages() {
        return ALL_LANGUAGES;
    }

    public static String getDefaultLanguage() {
        return DEFAULT_LANGUAGE;
    }
}