package vb;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: vb.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1847d {

    /* renamed from: a, reason: collision with root package name */
    public int f21926a;

    /* renamed from: b, reason: collision with root package name */
    public int f21927b;

    /* renamed from: c, reason: collision with root package name */
    public int f21928c;

    /* renamed from: d, reason: collision with root package name */
    public int f21929d;

    /* renamed from: e, reason: collision with root package name */
    public int f21930e;

    /* renamed from: f, reason: collision with root package name */
    public int f21931f;

    /* renamed from: g, reason: collision with root package name */
    public int f21932g;

    public static C1847d a(byte[] bArr) {
        if (bArr.length < 8) {
            throw new IllegalArgumentException(StubApp.getString2(18563) + bArr.length);
        }
        int c10 = Y3.a.c(0, 2, bArr, 1);
        int c11 = Y3.a.c(1, 2, bArr, 1);
        int c12 = Y3.a.c(2, 2, bArr, 2);
        int c13 = Y3.a.c(4, 2, bArr, 2);
        int c14 = Y3.a.c(6, 2, bArr, 1);
        int c15 = Y3.a.c(7, 2, bArr, 1);
        C1847d c1847d = new C1847d();
        c1847d.f21926a = (c10 >> 3) & 3;
        c1847d.f21927b = c10 & 7;
        c1847d.f21928c = c11;
        c1847d.f21929d = c12;
        c1847d.f21930e = c13;
        c1847d.f21931f = c14;
        c1847d.f21932g = c15;
        return c1847d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(23738));
        sb2.append(this.f21926a);
        sb2.append(StubApp.getString2(23739));
        sb2.append(this.f21927b);
        sb2.append(StubApp.getString2(23740));
        sb2.append(this.f21928c);
        sb2.append(StubApp.getString2(23741));
        sb2.append(this.f21929d);
        sb2.append(StubApp.getString2(23742));
        sb2.append(this.f21930e);
        sb2.append(StubApp.getString2(23743));
        sb2.append(this.f21931f);
        sb2.append(StubApp.getString2(23744));
        return AbstractC1482f.f(this.f21932g, StubApp.getString2(74), sb2);
    }
}
