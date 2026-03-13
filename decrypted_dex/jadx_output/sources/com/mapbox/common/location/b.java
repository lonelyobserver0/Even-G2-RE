package com.mapbox.common.location;

import com.mapbox.common.location.BaseDeviceLocationProvider;
import q4.e;
import q4.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements e, q4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12397b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f12396a = obj;
        this.f12397b = obj2;
    }

    @Override // q4.e
    public void C(Exception exc) {
        GoogleDeviceLocationProvider.doStart$lambda$1((PermissionStatus) this.f12396a, (GoogleDeviceLocationProvider) this.f12397b, exc);
    }

    @Override // q4.d
    public void j(j jVar) {
        GoogleDeviceLocationProvider.getLastLocation$lambda$6((BaseDeviceLocationProvider.LocationCancelable) this.f12396a, (GetLocationCallback) this.f12397b, jVar);
    }
}
