package com.mapbox.common;

import com.mapbox.bindgen.Value;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface EventsServiceObserver {
    void didEncounterError(EventsServiceError eventsServiceError, Value value);

    void didSendEvents(Value value);
}
