package H5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0078k {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0077j f2898a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0077j f2899b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2900c;

    public C0078k(EnumC0077j performance, EnumC0077j crashlytics, double d8) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f2898a = performance;
        this.f2899b = crashlytics;
        this.f2900c = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0078k)) {
            return false;
        }
        C0078k c0078k = (C0078k) obj;
        return this.f2898a == c0078k.f2898a && this.f2899b == c0078k.f2899b && Double.compare(this.f2900c, c0078k.f2900c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2900c) + ((this.f2899b.hashCode() + (this.f2898a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(2662) + this.f2898a + StubApp.getString2(2663) + this.f2899b + StubApp.getString2(2664) + this.f2900c + ')';
    }
}
