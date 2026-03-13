package com.google.android.gms.location;

import Q3.l;
import R3.C0233b;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import i4.AbstractC1047k;
import i4.C1042f;
import i4.C1045i;
import i4.C1046j;
import i4.InterfaceC1044h;
import i4.InterfaceC1048l;
import java.util.concurrent.Executor;
import q4.AbstractC1520a;
import q4.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface FusedLocationProviderClient extends l {

    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @Deprecated
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    j flushLocations();

    @Override // Q3.l
    /* synthetic */ C0233b getApiKey();

    j getCurrentLocation(int i3, AbstractC1520a abstractC1520a);

    j getCurrentLocation(C1042f c1042f, AbstractC1520a abstractC1520a);

    j getLastLocation();

    j getLastLocation(C1046j c1046j);

    j getLocationAvailability();

    @Deprecated
    j removeDeviceOrientationUpdates(InterfaceC1044h interfaceC1044h);

    j removeLocationUpdates(PendingIntent pendingIntent);

    j removeLocationUpdates(AbstractC1047k abstractC1047k);

    j removeLocationUpdates(InterfaceC1048l interfaceC1048l);

    @Deprecated
    j requestDeviceOrientationUpdates(C1045i c1045i, InterfaceC1044h interfaceC1044h, Looper looper);

    @Deprecated
    j requestDeviceOrientationUpdates(C1045i c1045i, Executor executor, InterfaceC1044h interfaceC1044h);

    j requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent);

    j requestLocationUpdates(LocationRequest locationRequest, AbstractC1047k abstractC1047k, Looper looper);

    j requestLocationUpdates(LocationRequest locationRequest, InterfaceC1048l interfaceC1048l, Looper looper);

    j requestLocationUpdates(LocationRequest locationRequest, Executor executor, AbstractC1047k abstractC1047k);

    j requestLocationUpdates(LocationRequest locationRequest, Executor executor, InterfaceC1048l interfaceC1048l);

    j setMockLocation(Location location);

    j setMockMode(boolean z2);
}
