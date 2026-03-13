package com.mapbox.common.location;

import com.mapbox.common.location.BaseDeviceLocationProvider;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12404c;

    public /* synthetic */ d(int i3, Object obj, Object obj2) {
        this.f12402a = i3;
        this.f12403b = obj;
        this.f12404c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12402a) {
            case 0:
                GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$1((BaseDeviceLocationProvider.LocationCancelable) this.f12403b, (GetLocationCallback) this.f12404c);
                break;
            case 1:
                AndroidDeviceLocationProvider.getLastLocation$lambda$3((BaseDeviceLocationProvider.LocationCancelable) this.f12403b, (GetLocationCallback) this.f12404c);
                break;
            case 2:
                AndroidDeviceLocationProvider.getLastLocation$lambda$4((BaseDeviceLocationProvider.LocationCancelable) this.f12403b, (GetLocationCallback) this.f12404c);
                break;
            default:
                BaseLocationProvider.notifyLocationUpdate$lambda$1$lambda$0((LocationObserver) this.f12403b, (List) this.f12404c);
                break;
        }
    }
}
