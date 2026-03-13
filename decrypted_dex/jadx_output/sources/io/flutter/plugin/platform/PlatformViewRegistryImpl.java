package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PlatformViewRegistryImpl implements PlatformViewRegistry {
    private final Map<String, PlatformViewFactory> viewFactories = new HashMap();

    public PlatformViewFactory getFactory(String str) {
        return this.viewFactories.get(str);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRegistry
    public boolean registerViewFactory(String str, PlatformViewFactory platformViewFactory) {
        if (this.viewFactories.containsKey(str)) {
            return false;
        }
        this.viewFactories.put(str, platformViewFactory);
        return true;
    }
}
