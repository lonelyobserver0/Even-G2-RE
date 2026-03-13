package R7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f6242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6243b;

    public d(String roadObjectId, String error) {
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f6242a = roadObjectId;
        this.f6243b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.RoadObjectMatcherError");
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f6242a, dVar.f6242a) && Intrinsics.areEqual(this.f6243b, dVar.f6243b);
    }

    public final int hashCode() {
        return this.f6243b.hashCode() + (this.f6242a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5748));
        sb2.append(this.f6242a);
        sb2.append(StubApp.getString2(5749));
        return AbstractC1482f.k(sb2, this.f6243b, StubApp.getString2(2142));
    }
}
