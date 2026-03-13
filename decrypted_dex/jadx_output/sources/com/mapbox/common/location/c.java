package com.mapbox.common.location;

import com.mapbox.common.location.BaseDeviceLocationProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable f12399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetLocationCallback f12400c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.location.Location f12401d;

    public /* synthetic */ c(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, android.location.Location location, int i3) {
        this.f12398a = i3;
        this.f12399b = locationCancelable;
        this.f12400c = getLocationCallback;
        this.f12401d = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12398a) {
            case 0:
                GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$0(this.f12399b, this.f12400c, this.f12401d);
                break;
            default:
                AndroidDeviceLocationProvider.getLastLocation$lambda$2(this.f12399b, this.f12400c, this.f12401d);
                break;
        }
    }
}
