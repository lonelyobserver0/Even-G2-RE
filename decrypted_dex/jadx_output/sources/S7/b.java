package S7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6602b;

    public b(String code, String codeAlpha3) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(codeAlpha3, "codeAlpha3");
        this.f6601a = code;
        this.f6602b = codeAlpha3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.border.CountryBorderCrossingAdminInfo");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f6601a, bVar.f6601a) && Intrinsics.areEqual(this.f6602b, bVar.f6602b);
    }

    public final int hashCode() {
        return this.f6602b.hashCode() + (this.f6601a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6023));
        sb2.append(this.f6601a);
        sb2.append(StubApp.getString2(6024));
        return AbstractC1482f.k(sb2, this.f6602b, StubApp.getString2(2142));
    }
}
