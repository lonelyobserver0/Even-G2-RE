package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0097 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0097 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0097 J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0097 J\u0011\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0097 R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingObserverNative;", "Lcom/mapbox/common/geofencing/GeofencingObserver;", "nativePeer", "", "(J)V", "peer", "onDwell", "", "event", "Lcom/mapbox/common/geofencing/GeofencingEvent;", "onEntry", "onError", "error", "Lcom/mapbox/common/geofencing/GeofencingError;", "onExit", "onUserConsentChanged", "isConsentGiven", "", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GeofencingObserverNative implements GeofencingObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0083 ¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void cleanNativePeer(long peer) {
            GeofencingObserverNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    private GeofencingObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new a(j, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(long j) {
        INSTANCE.cleanNativePeer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onDwell(GeofencingEvent event);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onEntry(GeofencingEvent event);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onError(GeofencingError error);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onExit(GeofencingEvent event);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onUserConsentChanged(boolean isConsentGiven);
}
