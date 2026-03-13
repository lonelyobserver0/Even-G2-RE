package M8;

import android.os.Looper;
import com.mapbox.common.Cancelable;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.LocationObserver;
import com.mapbox.common.location.LocationProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4685a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4686b;

    public c(a mapboxReplayer) {
        Intrinsics.checkNotNullParameter(mapboxReplayer, "mapboxReplayer");
        this.f4685a = new LinkedHashMap();
        this.f4686b = new ArrayList();
        mapboxReplayer.getClass();
        Intrinsics.checkNotNullParameter(this, "observer");
        mapboxReplayer.f4681a.add(this);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final void addLocationObserver(LocationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f4685a.put(observer, null);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final Cancelable getLastLocation(GetLocationCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f4686b.add(callback);
        return new b(0, this, callback);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final void removeLocationObserver(LocationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f4685a.remove(observer);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public final void addLocationObserver(LocationObserver observer, Looper looper) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f4685a.put(observer, looper);
    }
}
