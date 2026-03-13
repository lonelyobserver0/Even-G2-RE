package com.mapbox.navigation.base.route;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f12511a;

    public l(long j) {
        this.f12511a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.route.RouteAlternativesOptions");
        return this.f12511a == ((l) obj).f12511a;
    }

    public final int hashCode() {
        return (Long.hashCode(this.f12511a) * 31) + 8;
    }

    public final String toString() {
        return Xa.h.q(new StringBuilder(StubApp.getString2(14643)), this.f12511a, StubApp.getString2(14644));
    }
}
