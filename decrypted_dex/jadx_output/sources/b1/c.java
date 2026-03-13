package b1;

import T0.A;
import T0.B;
import T0.C;
import T0.v;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f10491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cc.a f10492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Cc.a aVar, B b2, B b10) {
        super(b2);
        this.f10492c = aVar;
        this.f10491b = b10;
    }

    @Override // T0.v, T0.B
    public final A i(long j) {
        A i3 = this.f10491b.i(j);
        C c10 = i3.f6925a;
        long j3 = c10.f6928a;
        long j10 = this.f10492c.f1188b;
        C c11 = new C(j3, c10.f6929b + j10);
        C c12 = i3.f6926b;
        return new A(c11, new C(c12.f6928a, c12.f6929b + j10));
    }
}
