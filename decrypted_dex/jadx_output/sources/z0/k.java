package z0;

import M4.I;
import java.util.ArrayList;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends m implements y0.h {

    /* renamed from: f, reason: collision with root package name */
    public final n f23691f;

    public k(C1438m c1438m, I i3, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(c1438m, i3, nVar, arrayList, arrayList2, arrayList3);
        this.f23691f = nVar;
    }

    @Override // y0.h
    public final long A(long j) {
        return this.f23691f.d(j);
    }

    @Override // y0.h
    public final long B(long j, long j3) {
        return this.f23691f.b(j, j3);
    }

    @Override // y0.h
    public final long a(long j) {
        return this.f23691f.g(j);
    }

    @Override // z0.m
    public final String b() {
        return null;
    }

    @Override // z0.m
    public final y0.h c() {
        return this;
    }

    @Override // y0.h
    public final long d(long j, long j3) {
        return this.f23691f.e(j, j3);
    }

    @Override // z0.m
    public final j e() {
        return null;
    }

    @Override // y0.h
    public final long g(long j, long j3) {
        return this.f23691f.c(j, j3);
    }

    @Override // y0.h
    public final long j(long j, long j3) {
        n nVar = this.f23691f;
        if (nVar.f23701f != null) {
            return -9223372036854775807L;
        }
        long b2 = nVar.b(j, j3) + nVar.c(j, j3);
        return (nVar.e(b2, j) + nVar.g(b2)) - nVar.f23704i;
    }

    @Override // y0.h
    public final j k(long j) {
        return this.f23691f.h(this, j);
    }

    @Override // y0.h
    public final long p(long j, long j3) {
        return this.f23691f.f(j, j3);
    }

    @Override // y0.h
    public final boolean v() {
        return this.f23691f.i();
    }

    @Override // y0.h
    public final long x() {
        return this.f23691f.f23699d;
    }
}
