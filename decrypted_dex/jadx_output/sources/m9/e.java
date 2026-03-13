package m9;

import Y.m;
import Z9.C0366a;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import j9.C1099d;
import j9.g;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final MapboxMap f17272a;

    /* renamed from: b, reason: collision with root package name */
    public final C0366a f17273b;

    /* renamed from: c, reason: collision with root package name */
    public final C1287a f17274c;

    /* renamed from: d, reason: collision with root package name */
    public final m f17275d;

    /* renamed from: e, reason: collision with root package name */
    public List f17276e;

    /* renamed from: f, reason: collision with root package name */
    public List f17277f;

    /* renamed from: g, reason: collision with root package name */
    public List f17278g;

    /* renamed from: h, reason: collision with root package name */
    public Location f17279h;

    /* renamed from: i, reason: collision with root package name */
    public final g f17280i;
    public final g j;

    /* renamed from: k, reason: collision with root package name */
    public final g f17281k;

    /* renamed from: l, reason: collision with root package name */
    public final g f17282l;

    /* renamed from: m, reason: collision with root package name */
    public final EdgeInsets f17283m;

    /* renamed from: n, reason: collision with root package name */
    public final List f17284n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17285o;

    /* renamed from: p, reason: collision with root package name */
    public CameraOptions f17286p;

    public e(MapboxMap mapboxMap, C1287a internalOptions) {
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(internalOptions, "internalOptions");
        C0366a indicesConverter = new C0366a(18, false);
        indicesConverter.f9105b = new HashMap();
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(internalOptions, "internalOptions");
        Intrinsics.checkNotNullParameter(indicesConverter, "indicesConverter");
        this.f17272a = mapboxMap;
        this.f17273b = indicesConverter;
        this.f17274c = internalOptions;
        m mVar = new m(18, false);
        mVar.f8674b = new C1099d();
        mVar.f8675c = new C0366a(11);
        this.f17275d = mVar;
        this.f17276e = CollectionsKt.emptyList();
        this.f17277f = CollectionsKt.emptyList();
        this.f17278g = CollectionsKt.emptyList();
        new HashMap();
        Point NULL_ISLAND_POINT = j9.e.f15391v;
        Intrinsics.checkNotNullExpressionValue(NULL_ISLAND_POINT, "NULL_ISLAND_POINT");
        g gVar = new g(NULL_ISLAND_POINT);
        this.f17280i = gVar;
        g gVar2 = new g(4);
        this.j = gVar2;
        g gVar3 = new g(0);
        this.f17281k = gVar3;
        g gVar4 = new g(0.0d);
        this.f17282l = gVar4;
        EdgeInsets edgeInsets = j9.e.f15392w;
        this.f17283m = edgeInsets;
        this.f17284n = CollectionsKt.emptyList();
        this.f17285o = true;
        CameraOptions build = new CameraOptions.Builder().center((Point) gVar.f()).zoom((Double) gVar2.f()).bearing((Double) gVar3.f()).pitch((Double) gVar4.f()).padding(edgeInsets).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .c…ing)\n            .build()");
        this.f17286p = build;
    }
}
