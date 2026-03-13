package g8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: g8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0964b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14235a;

    public C0964b(String str) {
        this.f14235a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0964b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.tunnel.TunnelInfo");
        return Intrinsics.areEqual(this.f14235a, ((C0964b) obj).f14235a);
    }

    public final int hashCode() {
        String str = this.f14235a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(17809)), this.f14235a, StubApp.getString2(2142));
    }
}
