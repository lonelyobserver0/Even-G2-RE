package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface EventsServiceInterface {
    void flush(FlushOperationResultCallback flushOperationResultCallback);

    void registerObserver(EventsServiceObserver eventsServiceObserver);

    void sendCrashEvent(CrashEvent crashEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    void sendEvent(Event event, EventsServiceResponseCallback eventsServiceResponseCallback);

    void sendTurnstileEvent(TurnstileEvent turnstileEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    void unregisterObserver(EventsServiceObserver eventsServiceObserver);
}
