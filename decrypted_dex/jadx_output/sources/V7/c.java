package V7;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public final double f7770d;

    /* renamed from: e, reason: collision with root package name */
    public final double f7771e;

    /* renamed from: f, reason: collision with root package name */
    public final double f7772f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7773g;

    /* renamed from: h, reason: collision with root package name */
    public final double f7774h;

    /* renamed from: i, reason: collision with root package name */
    public final double f7775i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String roadObjectId, int i3, double d8, double d10, double d11, boolean z2, double d12) {
        super(roadObjectId, i3, 1);
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        this.f7770d = d8;
        this.f7771e = d10;
        this.f7772f = d11;
        this.f7773g = z2;
        this.f7774h = d12;
        this.f7775i = d8;
    }

    @Override // V7.f
    public final Double a() {
        return Double.valueOf(this.f7775i);
    }

    @Override // V7.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.distanceinfo.LineDistanceInfo");
        c cVar = (c) obj;
        if (this.f7770d == cVar.f7770d && this.f7771e == cVar.f7771e && this.f7772f == cVar.f7772f && this.f7773g == cVar.f7773g && this.f7774h == cVar.f7774h) {
            if (this.f7775i == cVar.f7775i) {
                return true;
            }
        }
        return false;
    }

    @Override // V7.f
    public final int hashCode() {
        return Double.hashCode(this.f7775i) + E1.a.d(this.f7774h, u.e(E1.a.d(this.f7772f, E1.a.d(this.f7771e, E1.a.d(this.f7770d, super.hashCode() * 31, 31), 31), 31), 31, this.f7773g), 31);
    }

    @Override // V7.f
    public final String toString() {
        return StubApp.getString2(6625) + this.f7770d + StubApp.getString2(6626) + this.f7771e + StubApp.getString2(6627) + this.f7772f + StubApp.getString2(6628) + this.f7773g + StubApp.getString2(5307) + this.f7774h + StubApp.getString2(5753) + this.f7775i + StubApp.getString2(6022) + super.toString();
    }
}
