package com.mapbox.maps;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
interface InteractionHandler {
    boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext);

    void handleChange(InteractionContext interactionContext);

    void handleEnd(InteractionContext interactionContext);
}
