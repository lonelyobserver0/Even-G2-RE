package I;

import Ab.e;
import C2.k;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {
    public static boolean a(Location location) {
        return location.isMock();
    }

    public static void b(LocationManager locationManager, String str, LocationRequest locationRequest, e eVar, k kVar) {
        locationManager.requestLocationUpdates(str, locationRequest, eVar, kVar);
    }

    public static LocationRequest c(c cVar) {
        LocationRequest.Builder quality = new LocationRequest.Builder(cVar.f3019b).setQuality(cVar.f3018a);
        long j = cVar.f3020c;
        if (j == -1) {
            j = cVar.f3019b;
        }
        return quality.setMinUpdateIntervalMillis(j).setDurationMillis(LongCompanionObject.MAX_VALUE).setMaxUpdates(IntCompanionObject.MAX_VALUE).setMinUpdateDistanceMeters(cVar.f3021d).setMaxUpdateDelayMillis(0L).build();
    }
}
