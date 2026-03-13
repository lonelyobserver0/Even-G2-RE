package A1;

import T0.H;
import T0.l;
import T0.o;
import T0.p;
import T0.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public q f60a;

    /* renamed from: b, reason: collision with root package name */
    public H f61b;

    /* renamed from: e, reason: collision with root package name */
    public c f64e;

    /* renamed from: c, reason: collision with root package name */
    public int f62c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f63d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f65f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f66g = -1;

    @Override // T0.o
    public final void b(long j, long j3) {
        this.f62c = j == 0 ? 0 : 4;
        c cVar = this.f64e;
        if (cVar != null) {
            cVar.a(j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a8, code lost:
    
        if (r6 != 65534) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d7  */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r23, T0.s r24) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.e.c(T0.p, T0.s):int");
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.f60a = qVar;
        this.f61b = qVar.w(0, 1);
        qVar.q();
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        return Ec.d.p((l) pVar);
    }

    @Override // T0.o
    public final void release() {
    }
}
