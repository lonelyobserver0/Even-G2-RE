package com.mapbox.navigation.base.route;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12479a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12480b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12481c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12482d;

    public /* synthetic */ b(Object obj, long j, long j3) {
        this(obj, j, j3, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f12479a, bVar.f12479a) && this.f12480b == bVar.f12480b && this.f12481c == bVar.f12481c && Intrinsics.areEqual(this.f12482d, bVar.f12482d);
    }

    public final int hashCode() {
        Object obj = this.f12479a;
        return this.f12482d.hashCode() + com.mapbox.common.b.b(com.mapbox.common.b.b((obj == null ? 0 : obj.hashCode()) * 31, 31, this.f12480b), 31, this.f12481c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14627));
        sb2.append(this.f12479a);
        sb2.append(StubApp.getString2(14628));
        sb2.append(this.f12480b);
        sb2.append(StubApp.getString2(14629));
        sb2.append(this.f12481c);
        sb2.append(StubApp.getString2(14630));
        return Xa.h.s(sb2, this.f12482d, ')');
    }

    public b(Object obj, long j, long j3, String threadName) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        this.f12479a = obj;
        this.f12480b = j;
        this.f12481c = j3;
        this.f12482d = threadName;
    }
}
