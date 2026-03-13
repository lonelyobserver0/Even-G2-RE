package com.mapbox.navigation.base.route;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12512a;

    public m(boolean z2) {
        this.f12512a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.route.RouteRefreshMetadata");
        return this.f12512a == ((m) obj).f12512a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12512a);
    }
}
