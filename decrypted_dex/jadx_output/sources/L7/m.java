package L7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final IntRange f4291a;

    /* renamed from: b, reason: collision with root package name */
    public final IntRange f4292b;

    /* renamed from: c, reason: collision with root package name */
    public final IntRange f4293c;

    /* renamed from: d, reason: collision with root package name */
    public final IntRange f4294d;

    public m(IntRange intRange, IntRange intRange2, IntRange intRange3, IntRange intRange4) {
        this.f4291a = intRange;
        this.f4292b = intRange2;
        this.f4293c = intRange3;
        this.f4294d = intRange4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.options.TrafficOverrideOptions");
        m mVar = (m) obj;
        mVar.getClass();
        return Intrinsics.areEqual(this.f4291a, mVar.f4291a) && Intrinsics.areEqual(this.f4292b, mVar.f4292b) && Intrinsics.areEqual(this.f4293c, mVar.f4293c) && Intrinsics.areEqual(this.f4294d, mVar.f4294d);
    }

    public final int hashCode() {
        return this.f4294d.hashCode() + ((this.f4293c.hashCode() + ((this.f4292b.hashCode() + ((this.f4291a.hashCode() + E1.a.e(80, Boolean.hashCode(false) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(3454) + this.f4291a + StubApp.getString2(3455) + this.f4292b + StubApp.getString2(3456) + this.f4293c + StubApp.getString2(3457) + this.f4294d + ')';
    }
}
