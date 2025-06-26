package com.factrys.translation;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Loader extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        new TranslationAPI().loadTranslations(this);
    }
}