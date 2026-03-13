package L0;

import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import o0.C1427b;
import o0.C1447v;

/* renamed from: L0.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0126w extends AbstractC1416M {

    /* renamed from: b, reason: collision with root package name */
    public final C1447v f4142b;

    public C0126w(C1447v c1447v) {
        this.f4142b = c1447v;
    }

    @Override // o0.AbstractC1416M
    public final int b(Object obj) {
        return obj == C0125v.f4139e ? 0 : -1;
    }

    @Override // o0.AbstractC1416M
    public final C1414K f(int i3, C1414K c1414k, boolean z2) {
        c1414k.h(z2 ? 0 : null, z2 ? C0125v.f4139e : null, 0, -9223372036854775807L, 0L, C1427b.f18123c, true);
        return c1414k;
    }

    @Override // o0.AbstractC1416M
    public final int h() {
        return 1;
    }

    @Override // o0.AbstractC1416M
    public final Object l(int i3) {
        return C0125v.f4139e;
    }

    @Override // o0.AbstractC1416M
    public final C1415L m(int i3, C1415L c1415l, long j) {
        Object obj = C1415L.f18049q;
        c1415l.b(this.f4142b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        c1415l.f18060k = true;
        return c1415l;
    }

    @Override // o0.AbstractC1416M
    public final int o() {
        return 1;
    }
}
