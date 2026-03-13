package L0;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import r0.AbstractC1550k;

/* renamed from: L0.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0117m implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final M4.Z f4108a;

    /* renamed from: b, reason: collision with root package name */
    public long f4109b;

    public C0117m(List list, List list2) {
        M4.F l9 = M4.I.l();
        AbstractC1550k.c(list.size() == list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            l9.a(new C0116l((b0) list.get(i3), (List) list2.get(i3)));
        }
        this.f4108a = l9.g();
        this.f4109b = -9223372036854775807L;
    }

    @Override // L0.b0
    public final long f() {
        int i3 = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            M4.Z z2 = this.f4108a;
            if (i3 >= z2.f4580d) {
                break;
            }
            long f10 = ((C0116l) z2.get(i3)).f4106a.f();
            if (f10 != Long.MIN_VALUE) {
                j = Math.min(j, f10);
            }
            i3++;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        boolean z2;
        boolean z10 = false;
        do {
            long f10 = f();
            if (f10 == Long.MIN_VALUE) {
                return z10;
            }
            int i10 = 0;
            z2 = false;
            while (true) {
                M4.Z z11 = this.f4108a;
                if (i10 >= z11.f4580d) {
                    break;
                }
                long f11 = ((C0116l) z11.get(i10)).f4106a.f();
                boolean z12 = f11 != Long.MIN_VALUE && f11 <= i3.f21589a;
                if (f11 == f10 || z12) {
                    z2 |= ((C0116l) z11.get(i10)).f4106a.g(i3);
                }
                i10++;
            }
            z10 |= z2;
        } while (z2);
        return z10;
    }

    @Override // L0.b0
    public final boolean n() {
        int i3 = 0;
        while (true) {
            M4.Z z2 = this.f4108a;
            if (i3 >= z2.f4580d) {
                return false;
            }
            if (((C0116l) z2.get(i3)).f4106a.n()) {
                return true;
            }
            i3++;
        }
    }

    @Override // L0.b0
    public final long u() {
        int i3 = 0;
        long j = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        while (true) {
            M4.Z z2 = this.f4108a;
            if (i3 >= z2.f4580d) {
                break;
            }
            C0116l c0116l = (C0116l) z2.get(i3);
            long u2 = c0116l.f4106a.u();
            M4.I i10 = c0116l.f4107b;
            if ((i10.contains(1) || i10.contains(2) || i10.contains(4)) && u2 != Long.MIN_VALUE) {
                j = Math.min(j, u2);
            }
            if (u2 != Long.MIN_VALUE) {
                j3 = Math.min(j3, u2);
            }
            i3++;
        }
        if (j != LongCompanionObject.MAX_VALUE) {
            this.f4109b = j;
            return j;
        }
        if (j3 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f4109b;
        return j10 != -9223372036854775807L ? j10 : j3;
    }

    @Override // L0.b0
    public final void v(long j) {
        int i3 = 0;
        while (true) {
            M4.Z z2 = this.f4108a;
            if (i3 >= z2.f4580d) {
                return;
            }
            ((C0116l) z2.get(i3)).v(j);
            i3++;
        }
    }
}
