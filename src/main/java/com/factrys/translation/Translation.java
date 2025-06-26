package com.factrys.translation;

import cn.nukkit.utils.Config;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Translation {

    public TranslationAPI builds(String name, File dataFolder, int configType) {
        Map<String, Config> configMap = new HashMap<>();

        for (String language : Loader.getAllLanguages()) {
            String extension = (configType == Config.JSON) ? ".json" : ".yml";
            File langFile = new File(dataFolder, language + extension);
            Config langConfig = new Config(langFile, configType);

            configMap.put(language, langConfig);
        }

        return new TranslationAPI(name, configMap);
    }
}