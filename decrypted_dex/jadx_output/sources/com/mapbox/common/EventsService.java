package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EventsService implements EventsServiceInterface {
    protected long peer;

    public static class EventsServicePeerCleaner implements Runnable {
        private long peer;

        public EventsServicePeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public EventsService(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native EventsService getOrCreate(EventsServerOptions eventsServerOptions);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new EventsServicePeerCleaner(j));
    }

    @Override // com.mapbox.common.EventsServiceInterface
    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void registerObserver(EventsServiceObserver eventsServiceObserver);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendCrashEvent(CrashEvent crashEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendEvent(Event event, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendTurnstileEvent(TurnstileEvent turnstileEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void unregisterObserver(EventsServiceObserver eventsServiceObserver);
}
