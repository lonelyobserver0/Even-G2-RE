package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ConfigurationServiceObserver {
    void didEncounterError(ConfigurationServiceError configurationServiceError);

    void didStartUpdate();

    void didUpdate(ConfigurationOptions configurationOptions);
}
