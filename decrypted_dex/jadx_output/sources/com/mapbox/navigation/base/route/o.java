package com.mapbox.navigation.base.route;

import com.stub.StubApp;
import i2.u;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final URL f12515a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12516b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12517c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12518d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f12519e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12520f;

    public o(URL url, String routerOrigin, String message, String type, Throwable th, boolean z2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f12515a = url;
        this.f12516b = routerOrigin;
        this.f12517c = message;
        this.f12518d = type;
        this.f12519e = th;
        this.f12520f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(o.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.route.RouterFailure");
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f12515a, oVar.f12515a) && Intrinsics.areEqual(this.f12516b, oVar.f12516b) && Intrinsics.areEqual(this.f12517c, oVar.f12517c) && Intrinsics.areEqual(this.f12518d, oVar.f12518d) && Intrinsics.areEqual(this.f12519e, oVar.f12519e) && this.f12520f == oVar.f12520f;
    }

    public final int hashCode() {
        int d8 = u.d(u.d(u.d(this.f12515a.hashCode() * 31, 31, this.f12516b), 31, this.f12517c), 31, this.f12518d);
        Throwable th = this.f12519e;
        return Boolean.hashCode(this.f12520f) + ((d8 + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(14645) + this.f12515a + StubApp.getString2(14646) + this.f12516b + StubApp.getString2(14647) + this.f12517c + StubApp.getString2(3327) + this.f12518d + StubApp.getString2(4467) + this.f12519e + StubApp.getString2(4463) + this.f12520f + ')';
    }
}
