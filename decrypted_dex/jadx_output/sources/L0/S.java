package L0;

import o0.C1447v;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class S implements A {

    /* renamed from: a, reason: collision with root package name */
    public final Y.m f3978a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.d f3979b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.c f3980c;

    /* renamed from: d, reason: collision with root package name */
    public final I4.e f3981d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3982e;

    public S(Y.m mVar, T0.m mVar2) {
        C2.d dVar = new C2.d(mVar2, 18);
        A0.c cVar = new A0.c(0);
        I4.e eVar = new I4.e(15);
        this.f3978a = mVar;
        this.f3979b = dVar;
        this.f3980c = cVar;
        this.f3981d = eVar;
        this.f3982e = PKIFailureInfo.badCertTemplate;
    }

    @Override // L0.A
    public final AbstractC0105a c(C1447v c1447v) {
        c1447v.f18249b.getClass();
        A0.j i3 = this.f3980c.i(c1447v);
        I4.e eVar = this.f3981d;
        return new T(c1447v, this.f3978a, this.f3979b, i3, eVar, this.f3982e, false);
    }
}
