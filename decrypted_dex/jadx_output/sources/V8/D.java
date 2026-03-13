package V8;

import b3.C0498N;
import b3.C0503e;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationObserver;
import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class D implements LocationObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7801b;

    public /* synthetic */ D(Object obj, int i3) {
        this.f7800a = i3;
        this.f7801b = obj;
    }

    @Override // com.mapbox.common.location.LocationObserver
    public final void onLocationUpdateReceived(List locations) {
        switch (this.f7800a) {
            case 0:
                String string2 = StubApp.getString2(392);
                B3.h hVar = (B3.h) this.f7801b;
                Intrinsics.checkNotNullParameter(hVar, string2);
                Intrinsics.checkNotNullParameter(locations, "locations");
                if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                    D9.l.d(StubApp.getString2(6648) + locations, StubApp.getString2(545));
                }
                Location location = (Location) CollectionsKt.lastOrNull(locations);
                if (location != null) {
                    hVar.e(location);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(locations, "locations");
                Location location2 = (Location) CollectionsKt.last(locations);
                if (location2 != null) {
                    C0503e c0503e = (C0503e) this.f7801b;
                    if (c0503e.f10617g == null && c0503e.j.isEmpty()) {
                        c0503e.b(location2.getLongitude(), location2.getLatitude(), Double.valueOf(10.0d));
                    }
                    c0503e.f10617g = location2;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(locations, "locations");
                Location location3 = (Location) CollectionsKt.last(locations);
                C0498N c0498n = (C0498N) this.f7801b;
                String string22 = StubApp.getString2(103);
                if (location3 == null) {
                    c0498n.getClass();
                    R2.c.f(string22, StubApp.getString2(6647));
                    break;
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - location3.getTimestamp();
                    c0498n.getClass();
                    R2.c.b(string22, StubApp.getString2(6637) + location3.getLatitude() + StubApp.getString2(6638) + location3.getLongitude() + StubApp.getString2(6639) + location3.getSpeed() + StubApp.getString2(6640) + location3.getHorizontalAccuracy() + StubApp.getString2(6641) + currentTimeMillis + StubApp.getString2(6642));
                    Location location4 = c0498n.f10574g;
                    if (location4 == null) {
                        R2.c.b(string22, StubApp.getString2(6643));
                        if (c0498n.f10572e != null) {
                            c0498n.w(location3.getLongitude(), location3.getLatitude(), Double.valueOf(c0498n.f10593t));
                        }
                    } else {
                        Intrinsics.checkNotNull(location4);
                        double latitude = location4.getLatitude();
                        Location location5 = c0498n.f10574g;
                        Intrinsics.checkNotNull(location5);
                        float[] fArr = new float[1];
                        android.location.Location.distanceBetween(latitude, location5.getLongitude(), location3.getLatitude(), location3.getLongitude(), fArr);
                        R2.c.b(string22, StubApp.getString2(6644) + fArr[0] + StubApp.getString2(6645) + location3.getSpeed() + StubApp.getString2(6646));
                    }
                    c0498n.f10574g = location3;
                    X2.f evenLocation = new X2.f(new X2.e(location3.getLatitude(), location3.getLongitude()), Long.valueOf(location3.getTimestamp()), location3.getAltitude(), location3.getHorizontalAccuracy(), location3.getVerticalAccuracy(), location3.getSpeed(), location3.getSpeedAccuracy(), location3.getBearing(), location3.getBearingAccuracy(), location3.getFloor());
                    F5.c cVar = c0498n.f10571d;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(evenLocation, "evenLocation");
                    ((X2.w) cVar.f2238b).j = evenLocation;
                    break;
                }
        }
    }
}
