package R7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6227b;

    public a(String language, String value) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6226a = language;
        this.f6227b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.LocalizedString");
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f6226a, aVar.f6226a) && Intrinsics.areEqual(this.f6227b, aVar.f6227b);
    }

    public final int hashCode() {
        return this.f6227b.hashCode() + (this.f6226a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5741));
        sb2.append(this.f6226a);
        sb2.append(StubApp.getString2(5742));
        return AbstractC1482f.k(sb2, this.f6227b, StubApp.getString2(2142));
    }
}
