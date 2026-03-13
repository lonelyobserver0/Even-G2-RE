package com.mapbox.common.location;

import android.app.PendingIntent;
import android.os.Looper;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.Cancelable;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096 J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096 J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096 J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096 J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "peer", "", "(J)V", "getPeer", "()J", "setPeer", "addLocationObserver", "", "observer", "Lcom/mapbox/common/location/LocationObserver;", "looper", "Landroid/os/Looper;", "getLastLocation", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/common/location/GetLocationCallback;", "getName", "", "removeLocationObserver", "removeLocationUpdates", "pendingIntent", "Landroid/app/PendingIntent;", "requestLocationUpdates", "Companion", "DeviceLocationProviderPeerCleaner", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DeviceLocationProviderNative implements DeviceLocationProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 ¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;", "", "()V", "cleanNativePeer", "", "peer", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void cleanNativePeer(long peer) {
            DeviceLocationProviderNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative$DeviceLocationProviderPeerCleaner;", "Ljava/lang/Runnable;", "peer", "", "(J)V", "run", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DeviceLocationProviderPeerCleaner implements Runnable {
        private final long peer;

        public DeviceLocationProviderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderNative.INSTANCE.cleanNativePeer(this.peer);
        }
    }

    public DeviceLocationProviderNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DeviceLocationProviderPeerCleaner(j));
    }

    @JvmStatic
    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationProvider
    public native void addLocationObserver(LocationObserver observer);

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver observer, Looper looper) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(looper, "looper");
        throw new RuntimeException(StubApp.getString2(13632));
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native Cancelable getLastLocation(GetLocationCallback callback);

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public native String getName();

    public final long getPeer() {
        return this.peer;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native void removeLocationObserver(LocationObserver observer);

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        throw new RuntimeException(StubApp.getString2(13632));
    }

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        throw new RuntimeException(StubApp.getString2(13632));
    }

    public final void setPeer(long j) {
        this.peer = j;
    }
}
