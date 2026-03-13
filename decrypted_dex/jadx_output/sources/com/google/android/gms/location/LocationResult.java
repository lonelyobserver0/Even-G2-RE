package com.google.android.gms.location;

import S3.D;
import T3.a;
import a4.f;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.stub.StubApp;
import h1.n;
import i4.u;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f11798a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f11797b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new n(10);

    public LocationResult(List list) {
        this.f11798a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i3 = Build.VERSION.SDK_INT;
        List<Location> list = this.f11798a;
        if (i3 >= 31) {
            return list.equals(locationResult.f11798a);
        }
        if (list.size() != locationResult.f11798a.size()) {
            return false;
        }
        Iterator it = locationResult.f11798a.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !D.k(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11798a});
    }

    public final String toString() {
        String l9;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(12345));
        DecimalFormat decimalFormat = u.f14811a;
        List<Location> list = this.f11798a;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append(StubApp.getString2(1557));
        boolean z2 = false;
        for (Location location : list) {
            sb2.ensureCapacity(100);
            String string2 = StubApp.getString2(81);
            if (location == null) {
                sb2.append((String) null);
            } else {
                sb2.append(StubApp.getString2(1352));
                sb2.append(location.getProvider());
                sb2.append(string2);
                if (Build.VERSION.SDK_INT >= 31 ? I.a.a(location) : location.isFromMockProvider()) {
                    sb2.append(StubApp.getString2(12346));
                }
                DecimalFormat decimalFormat2 = u.f14811a;
                sb2.append(decimalFormat2.format(location.getLatitude()));
                sb2.append(StubApp.getString2(321));
                sb2.append(decimalFormat2.format(location.getLongitude()));
                boolean hasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = u.f14812b;
                String string22 = StubApp.getString2(2374);
                String string23 = StubApp.getString2(12347);
                if (hasAccuracy) {
                    sb2.append(string23);
                    sb2.append(decimalFormat3.format(location.getAccuracy()));
                    sb2.append(string22);
                }
                if (location.hasAltitude()) {
                    sb2.append(StubApp.getString2(12348));
                    sb2.append(decimalFormat3.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb2.append(string23);
                        sb2.append(decimalFormat3.format(location.getVerticalAccuracyMeters()));
                    }
                    sb2.append(string22);
                }
                if (location.hasSpeed()) {
                    sb2.append(StubApp.getString2(12349));
                    sb2.append(decimalFormat3.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb2.append(string23);
                        sb2.append(decimalFormat3.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb2.append(StubApp.getString2(6646));
                }
                if (location.hasBearing()) {
                    sb2.append(StubApp.getString2(12350));
                    sb2.append(decimalFormat3.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb2.append(string23);
                        sb2.append(decimalFormat3.format(location.getBearingAccuracyDegrees()));
                    }
                    sb2.append(StubApp.getString2(9229));
                }
                Bundle extras = location.getExtras();
                String string = extras != null ? extras.getString(StubApp.getString2(12351)) : null;
                if (string != null) {
                    sb2.append(StubApp.getString2(12352));
                    sb2.append(string);
                }
                Bundle extras2 = location.getExtras();
                String string3 = extras2 != null ? extras2.getString(StubApp.getString2(12353)) : null;
                if (string3 != null) {
                    sb2.append(StubApp.getString2(12354));
                    sb2.append(string3);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb2.append(StubApp.getString2(12355));
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis;
                if (millis >= 0) {
                    l9 = f4.u.f13784a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = f4.u.f13784a;
                    l9 = Long.toString(millis);
                }
                sb2.append(l9);
                sb2.append('}');
            }
            sb2.append(string2);
            z2 = true;
        }
        if (z2) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = f.I(parcel, 20293);
        f.H(parcel, 1, this.f11798a);
        f.N(parcel, I10);
    }
}
