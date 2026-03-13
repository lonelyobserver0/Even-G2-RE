package com.mapbox.navigation.base.route;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import i2.u;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Point f12474a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12475b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f12476c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12477d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f12478e;

    public a(Point location, String name, Point point, String type, Map map) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f12474a = location;
        this.f12475b = name;
        this.f12476c = point;
        this.f12477d = type;
        this.f12478e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.route.LegWaypoint");
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f12474a, aVar.f12474a) && Intrinsics.areEqual(this.f12475b, aVar.f12475b) && Intrinsics.areEqual(this.f12476c, aVar.f12476c) && Intrinsics.areEqual(this.f12477d, aVar.f12477d) && Intrinsics.areEqual(this.f12478e, aVar.f12478e);
    }

    public final int hashCode() {
        int d8 = u.d(this.f12474a.hashCode() * 31, 31, this.f12475b);
        Point point = this.f12476c;
        int d10 = u.d((d8 + (point != null ? point.hashCode() : 0)) * 31, 31, this.f12477d);
        Map map = this.f12478e;
        return d10 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(14624) + this.f12474a + StubApp.getString2(2149) + this.f12475b + StubApp.getString2(2150) + this.f12476c + StubApp.getString2(14625) + this.f12477d + StubApp.getString2(14626) + this.f12478e + ')';
    }
}
