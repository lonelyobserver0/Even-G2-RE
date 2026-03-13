package X6;

import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final MapboxMap f8451a;

    /* renamed from: b, reason: collision with root package name */
    public final MapTelemetry f8452b;

    /* renamed from: c, reason: collision with root package name */
    public final MapGeofencingConsent f8453c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8454d;

    public g(MapboxMap mapboxMap, MapTelemetry mapTelemetry, MapGeofencingConsent mapGeofencingConsent) {
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(mapTelemetry, "mapTelemetry");
        Intrinsics.checkNotNullParameter(mapGeofencingConsent, "mapGeofencingConsent");
        this.f8451a = mapboxMap;
        this.f8452b = mapTelemetry;
        this.f8453c = mapGeofencingConsent;
        this.f8454d = CollectionsKt.emptyList();
    }
}
