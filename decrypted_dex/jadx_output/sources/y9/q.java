package y9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final float f23597a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23598b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23599c;

    public q(float f10, float f11, float f12) {
        this.f23597a = f10;
        this.f23598b = f11;
        this.f23599c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(q.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleValue");
        q qVar = (q) obj;
        if (W.a.v(Float.valueOf(this.f23597a), Float.valueOf(qVar.f23597a)) && W.a.v(Float.valueOf(this.f23598b), Float.valueOf(qVar.f23598b))) {
            return W.a.v(Float.valueOf(this.f23599c), Float.valueOf(qVar.f23599c));
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23599c) + ((Float.hashCode(this.f23598b) + (Float.hashCode(this.f23597a) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(24710) + this.f23597a + StubApp.getString2(24711) + this.f23598b + StubApp.getString2(14185) + this.f23599c + ')';
    }
}
