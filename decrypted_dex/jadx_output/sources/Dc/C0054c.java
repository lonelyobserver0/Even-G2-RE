package Dc;

import Kc.C0104k;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Dc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0054c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0104k f1557d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0104k f1558e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0104k f1559f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0104k f1560g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0104k f1561h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0104k f1562i;

    /* renamed from: a, reason: collision with root package name */
    public final C0104k f1563a;

    /* renamed from: b, reason: collision with root package name */
    public final C0104k f1564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1565c;

    static {
        C0104k c0104k = C0104k.f3820d;
        f1557d = u5.d.r(StubApp.getString2(478));
        f1558e = u5.d.r(StubApp.getString2(25105));
        f1559f = u5.d.r(StubApp.getString2(25106));
        f1560g = u5.d.r(StubApp.getString2(25107));
        f1561h = u5.d.r(StubApp.getString2(25108));
        f1562i = u5.d.r(StubApp.getString2(25109));
    }

    public C0054c(C0104k name, C0104k value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f1563a = name;
        this.f1564b = value;
        this.f1565c = value.e() + name.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0054c)) {
            return false;
        }
        C0054c c0054c = (C0054c) obj;
        return Intrinsics.areEqual(this.f1563a, c0054c.f1563a) && Intrinsics.areEqual(this.f1564b, c0054c.f1564b);
    }

    public final int hashCode() {
        return this.f1564b.hashCode() + (this.f1563a.hashCode() * 31);
    }

    public final String toString() {
        return this.f1563a.s() + StubApp.getString2(994) + this.f1564b.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0054c(String name, String value) {
        this(u5.d.r(name), u5.d.r(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C0104k c0104k = C0104k.f3820d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0054c(C0104k name, String value) {
        this(name, u5.d.r(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C0104k c0104k = C0104k.f3820d;
    }
}
