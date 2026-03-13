package n2;

import com.stub.StubApp;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1380a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17795a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17797c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17798d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380a)) {
            return false;
        }
        C1380a c1380a = (C1380a) obj;
        return this.f17795a == c1380a.f17795a && this.f17796b == c1380a.f17796b && this.f17797c == c1380a.f17797c && this.f17798d == c1380a.f17798d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z2 = this.f17796b;
        ?? r12 = this.f17795a;
        int i3 = r12;
        if (z2) {
            i3 = r12 + 16;
        }
        int i10 = i3;
        if (this.f17797c) {
            i10 = i3 + 256;
        }
        return this.f17798d ? i10 + 4096 : i10;
    }

    public final String toString() {
        return StubApp.getString2(21384) + this.f17795a + StubApp.getString2(21385) + this.f17796b + StubApp.getString2(21386) + this.f17797c + StubApp.getString2(21387) + this.f17798d + StubApp.getString2(3120);
    }
}
