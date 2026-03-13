package Qb;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class P0 extends Vb.u implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f5828e;

    public P0(long j, Q0 q02) {
        super(q02, q02.getContext());
        this.f5828e = j;
    }

    @Override // Qb.D0
    public final String N() {
        return super.N() + StubApp.getString2(25486) + this.f5828e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        S.b(this.f5844c);
        r(new O0(Xa.h.q(new StringBuilder(StubApp.getString2(20533)), this.f5828e, StubApp.getString2(559)), this));
    }
}
