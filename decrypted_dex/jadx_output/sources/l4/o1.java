package l4;

import i.RunnableC1018B;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f16568a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y.m f16570c;

    public o1(Y.m mVar, long j, long j3) {
        Objects.requireNonNull(mVar);
        this.f16570c = mVar;
        this.f16568a = j;
        this.f16569b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1191k0 c1191k0 = ((C1200n0) ((q1) this.f16570c.f8675c).f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.t(new RunnableC1018B(this, 8));
    }
}
