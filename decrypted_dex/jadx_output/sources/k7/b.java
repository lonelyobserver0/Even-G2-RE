package k7;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f15478a;

    public b(MapView mapView) {
        this.f15478a = mapView;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f15478a.onLowMemory();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 == 10 || i3 == 15) {
            MapboxLogger.logW(StubApp.getString2(13948), StubApp.getString2(19123) + i3 + StubApp.getString2(19124));
            this.f15478a.onLowMemory();
        }
    }
}
