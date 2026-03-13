package f5;

import com.stub.StubApp;

/* renamed from: f5.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0883A {

    /* renamed from: a, reason: collision with root package name */
    public String f13797a;

    /* renamed from: b, reason: collision with root package name */
    public String f13798b;

    /* renamed from: c, reason: collision with root package name */
    public int f13799c;

    /* renamed from: d, reason: collision with root package name */
    public String f13800d;

    /* renamed from: e, reason: collision with root package name */
    public String f13801e;

    /* renamed from: f, reason: collision with root package name */
    public String f13802f;

    /* renamed from: g, reason: collision with root package name */
    public String f13803g;

    /* renamed from: h, reason: collision with root package name */
    public String f13804h;

    /* renamed from: i, reason: collision with root package name */
    public String f13805i;
    public J j;

    /* renamed from: k, reason: collision with root package name */
    public G f13806k;

    /* renamed from: l, reason: collision with root package name */
    public C0886D f13807l;

    /* renamed from: m, reason: collision with root package name */
    public byte f13808m;

    public final C0884B a() {
        if (this.f13808m == 1 && this.f13797a != null && this.f13798b != null && this.f13800d != null && this.f13804h != null && this.f13805i != null) {
            return new C0884B(this.f13797a, this.f13798b, this.f13799c, this.f13800d, this.f13801e, this.f13802f, this.f13803g, this.f13804h, this.f13805i, this.j, this.f13806k, this.f13807l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13797a == null) {
            sb2.append(StubApp.getString2(17509));
        }
        if (this.f13798b == null) {
            sb2.append(StubApp.getString2(17510));
        }
        if ((1 & this.f13808m) == 0) {
            sb2.append(StubApp.getString2(17511));
        }
        if (this.f13800d == null) {
            sb2.append(StubApp.getString2(17512));
        }
        if (this.f13804h == null) {
            sb2.append(StubApp.getString2(17513));
        }
        if (this.f13805i == null) {
            sb2.append(StubApp.getString2(17514));
        }
        throw new IllegalStateException(Xa.h.r(sb2, StubApp.getString2(555)));
    }
}
