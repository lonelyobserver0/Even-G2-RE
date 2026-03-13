package H7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2931b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2932c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2933d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2934e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2935f;

    public a(int i3, int i10, int i11, int i12, int i13, boolean z2) {
        this.f2930a = i3;
        this.f2931b = i10;
        this.f2932c = i11;
        this.f2933d = i12;
        this.f2934e = i13;
        this.f2935f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.internal.trip.model.RouteIndices");
        a aVar = (a) obj;
        return this.f2930a == aVar.f2930a && this.f2931b == aVar.f2931b && this.f2932c == aVar.f2932c && this.f2933d == aVar.f2933d && this.f2934e == aVar.f2934e && this.f2935f == aVar.f2935f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2935f) + (((((((((Integer.hashCode(this.f2930a) * 31) + this.f2931b) * 31) + this.f2932c) * 31) + this.f2933d) * 31) + this.f2934e) * 31);
    }

    public final String toString() {
        return StubApp.getString2(2687) + this.f2930a + StubApp.getString2(2688) + this.f2931b + StubApp.getString2(2689) + this.f2932c + StubApp.getString2(2690) + this.f2933d + StubApp.getString2(2691) + this.f2934e + StubApp.getString2(2692) + this.f2935f + ')';
    }
}
