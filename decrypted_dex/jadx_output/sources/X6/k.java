package X6;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final A3.s f8457a;

    /* renamed from: b, reason: collision with root package name */
    public int f8458b;

    /* renamed from: c, reason: collision with root package name */
    public Pair f8459c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8460d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f8461e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f8462f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f8463g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f8464h;

    /* renamed from: i, reason: collision with root package name */
    public k7.c f8465i;

    public k(A3.s mapDelegateProvider) {
        Intrinsics.checkNotNullParameter(mapDelegateProvider, "mapDelegateProvider");
        this.f8457a = mapDelegateProvider;
        this.f8458b = 2;
        this.f8460d = new LinkedHashMap();
        this.f8461e = new CopyOnWriteArraySet();
        this.f8462f = new CopyOnWriteArraySet();
        this.f8463g = new CopyOnWriteArraySet();
        this.f8464h = new CopyOnWriteArraySet();
    }

    public final void a(CameraState cameraState) {
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        Iterator it = this.f8461e.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            Point center = cameraState.getCenter();
            Intrinsics.checkNotNullExpressionValue(center, "cameraState.center");
            double zoom = cameraState.getZoom();
            double pitch = cameraState.getPitch();
            double bearing = cameraState.getBearing();
            EdgeInsets padding = cameraState.getPadding();
            Intrinsics.checkNotNullExpressionValue(padding, "cameraState.padding");
            hVar.d(center, padding, zoom, pitch, bearing);
        }
    }

    public final void b(int i3) {
        if (i3 != this.f8458b) {
            this.f8458b = i3;
            int c10 = AbstractC1856e.c(i3);
            LinkedHashMap linkedHashMap = this.f8460d;
            if (c10 == 0) {
                for (j jVar : linkedHashMap.values()) {
                    if (jVar instanceof c) {
                        ((c) jVar).onStart();
                    }
                }
                return;
            }
            if (c10 != 1) {
                return;
            }
            for (j jVar2 : linkedHashMap.values()) {
                if (jVar2 instanceof c) {
                    ((c) jVar2).onStop();
                }
            }
        }
    }
}
