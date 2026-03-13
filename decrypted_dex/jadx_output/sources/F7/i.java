package F7;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2309b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2310c;

    public i(String offset, String identifier, String abbreviation) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.f2308a = offset;
        this.f2309b = identifier;
        this.f2310c = abbreviation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.internal.route.TimeZone");
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f2308a, iVar.f2308a) && Intrinsics.areEqual(this.f2309b, iVar.f2309b) && Intrinsics.areEqual(this.f2310c, iVar.f2310c);
    }

    public final int hashCode() {
        return this.f2310c.hashCode() + u.d(this.f2308a.hashCode() * 31, 31, this.f2309b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2139));
        sb2.append(this.f2308a);
        sb2.append(StubApp.getString2(2140));
        sb2.append(this.f2309b);
        sb2.append(StubApp.getString2(2141));
        return AbstractC1482f.k(sb2, this.f2310c, StubApp.getString2(2142));
    }
}
