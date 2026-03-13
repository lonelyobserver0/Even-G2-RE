package com.mapbox.navigation.base.route;

import com.stub.StubApp;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final long f12513b = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final long f12514a;

    public n(long j) {
        this.f12514a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.route.RouteRefreshOptions");
        return this.f12514a == ((n) obj).f12514a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12514a);
    }

    public final String toString() {
        return StubApp.getString2(14643) + this.f12514a + ')';
    }
}
