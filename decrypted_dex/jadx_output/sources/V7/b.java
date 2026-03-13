package V7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f7766a;

    /* renamed from: b, reason: collision with root package name */
    public final R7.e f7767b;

    /* renamed from: c, reason: collision with root package name */
    public final double f7768c;

    /* renamed from: d, reason: collision with root package name */
    public final double f7769d;

    public b(int i3, R7.e position, double d8, double d10) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f7766a = i3;
        this.f7767b = position;
        this.f7768c = d8;
        this.f7769d = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.Gate");
        b bVar = (b) obj;
        return this.f7766a == bVar.f7766a && Intrinsics.areEqual(this.f7767b, bVar.f7767b) && this.f7768c == bVar.f7768c && this.f7769d == bVar.f7769d;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7769d) + E1.a.d(this.f7768c, (this.f7767b.hashCode() + (Integer.hashCode(this.f7766a) * 31)) * 31, 31);
    }

    public final String toString() {
        return StubApp.getString2(6623) + this.f7766a + StubApp.getString2(6092) + this.f7767b + StubApp.getString2(5301) + this.f7768c + StubApp.getString2(6624) + this.f7769d + ')';
    }
}
