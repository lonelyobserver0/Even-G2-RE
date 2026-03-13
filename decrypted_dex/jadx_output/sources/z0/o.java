package z0;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j3, long j10, long j11, List list, long j12, List list2, long j13, long j14) {
        super(jVar, j, j3, j10, j11, list, j12, j13, j14);
        this.j = list2;
    }

    @Override // z0.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // z0.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.f23699d));
    }

    @Override // z0.n
    public final boolean i() {
        return true;
    }
}
