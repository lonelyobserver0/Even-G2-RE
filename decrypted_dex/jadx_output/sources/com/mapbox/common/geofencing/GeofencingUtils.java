package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0004R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingUtils;", "", "nativePeer", "", "(J)V", "peer", "setPeer", "", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class GeofencingUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0083 J\t\u0010\u0007\u001a\u00020\bH\u0087 J\t\u0010\t\u001a\u00020\bH\u0087 J\u0019\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0087 ¨\u0006\u000e"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "getUserConsent", "", "isActive", "setUserConsent", "isConsentGiven", "callback", "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void cleanNativePeer(long peer) {
            GeofencingUtils.cleanNativePeer(peer);
        }

        @JvmStatic
        public final boolean getUserConsent() {
            return GeofencingUtils.getUserConsent();
        }

        @JvmStatic
        public final boolean isActive() {
            return GeofencingUtils.isActive();
        }

        @JvmStatic
        public final void setUserConsent(boolean isConsentGiven, GeofencingUtilsUserConsentResponseCallback callback) {
            GeofencingUtils.setUserConsent(isConsentGiven, callback);
        }

        private Companion() {
        }
    }

    static {
        BaseMapboxInitializer.INSTANCE.init(MapboxSDKCommonInitializerImpl.class);
    }

    public GeofencingUtils(long j) {
        setPeer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @JvmStatic
    public static final native boolean getUserConsent();

    @JvmStatic
    public static final native boolean isActive();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j) {
        INSTANCE.cleanNativePeer(j);
    }

    @JvmStatic
    public static final native void setUserConsent(boolean z2, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback);

    public final void setPeer(long nativePeer) {
        this.peer = nativePeer;
        if (nativePeer == 0) {
            return;
        }
        CleanerService.register(this, new a(nativePeer, 12));
    }
}
