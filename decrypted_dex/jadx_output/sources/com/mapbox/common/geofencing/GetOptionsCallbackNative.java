package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0096 R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mapbox/common/geofencing/GetOptionsCallbackNative;", "Lcom/mapbox/common/geofencing/GetOptionsCallback;", "nativePeer", "", "(J)V", "peer", "run", "", "result", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/geofencing/GeofencingError;", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class GetOptionsCallbackNative implements GetOptionsCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0083 ¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/geofencing/GetOptionsCallbackNative$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void cleanNativePeer(long peer) {
            GetOptionsCallbackNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    private GetOptionsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new a(j, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(long j) {
        INSTANCE.cleanNativePeer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.geofencing.GetOptionsCallback
    public native void run(Expected<GeofencingError, GeofencingOptions> result);
}
