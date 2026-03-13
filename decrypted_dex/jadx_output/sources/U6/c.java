package U6;

import android.os.Handler;
import android.os.HandlerThread;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapboxStyleManager;
import com.stub.StubApp;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends T6.d {
    public static final HandlerThread j;

    /* renamed from: e, reason: collision with root package name */
    public FeatureCollection f7468e;

    /* renamed from: f, reason: collision with root package name */
    public String f7469f;

    /* renamed from: g, reason: collision with root package name */
    public String f7470g;

    /* renamed from: h, reason: collision with root package name */
    public final Lazy f7471h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f7472i;

    static {
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(6370), 0);
        handlerThread.start();
        j = handlerThread;
    }

    public c(a aVar) {
        super(aVar.f7460a);
        d().putAll(aVar.f7461b);
        f().putAll(aVar.f7462c);
        this.f7468e = null;
        this.f7469f = aVar.f7463d;
        this.f7470g = aVar.f7464e;
        this.f7471h = LazyKt.lazy(b.f7466c);
        this.f7472i = LazyKt.lazy(b.f7465b);
    }

    public static void g(c cVar, String value) {
        c cVar2;
        Intrinsics.checkNotNullParameter(value, "value");
        String str = "";
        Intrinsics.checkNotNullParameter("", StubApp.getString2(2238));
        GeoJSONSourceData valueOf = GeoJSONSourceData.valueOf(value);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(data)");
        MapboxStyleManager mapboxStyleManager = cVar.f7220d;
        if (mapboxStyleManager != null) {
            Lazy lazy = cVar.f7471h;
            ((Handler) lazy.getValue()).removeCallbacksAndMessages(null);
            cVar2 = cVar;
            ((Handler) lazy.getValue()).post(new G3.a(1, mapboxStyleManager, cVar2, str, valueOf));
        } else {
            cVar2 = cVar;
        }
        cVar2.f7469f = value;
        cVar2.f7470g = "";
        cVar2.f7468e = null;
    }

    @Override // T6.d
    public final void b(MapboxStyleManager delegate) {
        c cVar;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        super.b(delegate);
        FeatureCollection featureCollection = this.f7468e;
        if (featureCollection != null) {
            h(featureCollection, this.f7470g);
        }
        String str = this.f7469f;
        if (str != null) {
            String str2 = this.f7470g;
            GeoJSONSourceData valueOf = GeoJSONSourceData.valueOf(str);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(data)");
            MapboxStyleManager mapboxStyleManager = this.f7220d;
            if (mapboxStyleManager != null) {
                Lazy lazy = this.f7471h;
                ((Handler) lazy.getValue()).removeCallbacksAndMessages(null);
                cVar = this;
                ((Handler) lazy.getValue()).post(new G3.a(1, mapboxStyleManager, cVar, str2, valueOf));
            } else {
                cVar = this;
            }
            cVar.f7469f = str;
            cVar.f7470g = str2;
            cVar.f7468e = null;
        }
    }

    @Override // T6.d
    public final String e() {
        return StubApp.getString2(6371);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(FeatureCollection geoJson, String str) {
        GeoJSONSourceData valueOf;
        c cVar;
        String str2;
        Intrinsics.checkNotNullParameter(geoJson, "geoJson");
        String string2 = StubApp.getString2(6372);
        if (geoJson instanceof Geometry) {
            valueOf = GeoJSONSourceData.valueOf((Geometry) geoJson);
            Intrinsics.checkNotNullExpressionValue(valueOf, string2);
        } else {
            if (geoJson == 0) {
                throw new RuntimeException(StubApp.getString2(6373));
            }
            List<Feature> features = geoJson.features();
            Intrinsics.checkNotNull(features);
            valueOf = GeoJSONSourceData.valueOf(features);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(geoJson.features()!!)");
        }
        GeoJSONSourceData geoJSONSourceData = valueOf;
        MapboxStyleManager mapboxStyleManager = this.f7220d;
        if (mapboxStyleManager != null) {
            Lazy lazy = this.f7471h;
            ((Handler) lazy.getValue()).removeCallbacksAndMessages(null);
            cVar = this;
            str2 = str;
            ((Handler) lazy.getValue()).post(new G3.a(1, mapboxStyleManager, cVar, str2, geoJSONSourceData));
        } else {
            cVar = this;
            str2 = str;
        }
        cVar.f7468e = geoJson;
        cVar.f7470g = str2;
        cVar.f7469f = null;
    }
}
