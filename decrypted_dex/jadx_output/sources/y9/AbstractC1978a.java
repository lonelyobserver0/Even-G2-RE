package y9;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1978a {

    /* renamed from: a, reason: collision with root package name */
    public final double f23549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23550b;

    public AbstractC1978a(double d8, int i3) {
        this.f23549a = d8;
        this.f23550b = i3;
    }

    public abstract AbstractC1978a a(double d8);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.ExpressionOffsetData");
        AbstractC1978a abstractC1978a = (AbstractC1978a) obj;
        return this.f23549a == abstractC1978a.f23549a && this.f23550b == abstractC1978a.f23550b;
    }

    public int hashCode() {
        return (Double.hashCode(this.f23549a) * 31) + this.f23550b;
    }
}
