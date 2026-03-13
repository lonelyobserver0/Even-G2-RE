package L0;

import android.os.Bundle;
import com.stub.StubApp;
import l4.AbstractC1148D;
import l4.C1162a1;
import l4.C1164b0;
import l4.C1200n0;
import l4.E0;
import l4.K1;
import l4.P0;
import l4.p1;
import l4.q1;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class U implements o1.g {

    /* renamed from: a, reason: collision with root package name */
    public long f3994a;

    /* renamed from: b, reason: collision with root package name */
    public long f3995b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3996c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3997d;

    public U(long j, int i3) {
        AbstractC1550k.g(((P0.a) this.f3996c) == null);
        this.f3994a = j;
        this.f3995b = j + i3;
    }

    public boolean a(boolean z2, boolean z10, long j) {
        q1 q1Var = (q1) this.f3997d;
        q1Var.k();
        q1Var.l();
        C1200n0 c1200n0 = (C1200n0) q1Var.f4728a;
        if (c1200n0.d()) {
            C1164b0 c1164b0 = c1200n0.f16540e;
            C1200n0.j(c1164b0);
            c1200n0.f16545l.getClass();
            c1164b0.f16380r.h(System.currentTimeMillis());
        }
        long j3 = j - this.f3994a;
        l4.T t3 = c1200n0.f16541f;
        if (!z2 && j3 < 1000) {
            C1200n0.l(t3);
            t3.f16249p.c(Long.valueOf(j3), StubApp.getString2(3302));
            return false;
        }
        if (!z10) {
            j3 = j - this.f3995b;
            this.f3995b = j;
        }
        C1200n0.l(t3);
        t3.f16249p.c(Long.valueOf(j3), StubApp.getString2(3303));
        Bundle bundle = new Bundle();
        bundle.putLong(StubApp.getString2(3304), j3);
        boolean z11 = !c1200n0.f16539d.y();
        C1162a1 c1162a1 = c1200n0.f16546m;
        C1200n0.k(c1162a1);
        K1.b0(c1162a1.q(z11), bundle, true);
        if (!z10) {
            P0 p02 = c1200n0.f16547n;
            C1200n0.k(p02);
            p02.r(StubApp.getString2(3305), StubApp.getString2(3306), bundle);
        }
        this.f3994a = j;
        p1 p1Var = (p1) this.f3996c;
        p1Var.c();
        p1Var.b(((Long) AbstractC1148D.f16013q0.a(null)).longValue());
        return true;
    }

    @Override // o1.g
    public long c(T0.l lVar) {
        long j = this.f3995b;
        if (j < 0) {
            return -1L;
        }
        long j3 = -(j + 2);
        this.f3995b = -1L;
        return j3;
    }

    @Override // o1.g
    public T0.B d() {
        AbstractC1550k.g(this.f3994a != -1);
        return new T0.t((T0.u) this.f3996c, this.f3994a, 0);
    }

    @Override // o1.g
    public void e(long j) {
        long[] jArr = (long[]) ((E0) this.f3997d).f16037b;
        this.f3995b = jArr[AbstractC1560u.e(jArr, j, true)];
    }

    public U(String str, byte[] bArr, long j, long j3) {
        this.f3996c = str;
        this.f3997d = bArr;
        this.f3994a = j;
        this.f3995b = j3;
    }
}
