package com.mapbox.common.location;

import android.app.PendingIntent;
import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/mapbox/common/location/DeviceLocationProvider;", "Lcom/mapbox/common/location/LocationProvider;", "getName", "", "removeLocationUpdates", "", "pendingIntent", "Landroid/app/PendingIntent;", "requestLocationUpdates", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface DeviceLocationProvider extends LocationProvider {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static String getName(DeviceLocationProvider deviceLocationProvider) {
            return StubApp.getString2(13631);
        }
    }

    String getName();

    void removeLocationUpdates(PendingIntent pendingIntent);

    void requestLocationUpdates(PendingIntent pendingIntent) throws SecurityException;
}
