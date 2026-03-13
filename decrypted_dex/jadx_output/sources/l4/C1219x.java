package l4;

import android.os.Bundle;
import com.stub.StubApp;
import java.util.Iterator;
import t.C1689b;
import t.C1692e;

/* renamed from: l4.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1219x extends AbstractC1146B {

    /* renamed from: b, reason: collision with root package name */
    public final C1692e f16652b;

    /* renamed from: c, reason: collision with root package name */
    public final C1692e f16653c;

    /* renamed from: d, reason: collision with root package name */
    public long f16654d;

    public C1219x(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16653c = new C1692e(0);
        this.f16652b = new C1692e(0);
    }

    public final void l(long j, String str) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (str != null && str.length() != 0) {
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(new RunnableC1160a(this, str, j, 0));
        } else {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(20913));
        }
    }

    public final void m(long j, String str) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (str != null && str.length() != 0) {
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(new RunnableC1160a(this, str, j, 1));
        } else {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(20913));
        }
    }

    public final void n(long j) {
        C1162a1 c1162a1 = ((C1200n0) this.f4728a).f16546m;
        C1200n0.k(c1162a1);
        X0 q10 = c1162a1.q(false);
        C1692e c1692e = this.f16652b;
        Iterator it = ((C1689b) c1692e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            p(str, j - ((Long) c1692e.get(str)).longValue(), q10);
        }
        if (!c1692e.isEmpty()) {
            o(j - this.f16654d, q10);
        }
        q(j);
    }

    public final void o(long j, X0 x02) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (x02 == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16249p.b(StubApp.getString2(20914));
            return;
        }
        if (j < 1000) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16249p.c(Long.valueOf(j), StubApp.getString2(20915));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(StubApp.getString2(19487), j);
        K1.b0(x02, bundle, true);
        P0 p02 = c1200n0.f16547n;
        C1200n0.k(p02);
        p02.r(StubApp.getString2(6363), StubApp.getString2(6352), bundle);
    }

    public final void p(String str, long j, X0 x02) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (x02 == null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16249p.b(StubApp.getString2(20916));
            return;
        }
        if (j < 1000) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16249p.c(Long.valueOf(j), StubApp.getString2(20917));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(StubApp.getString2(6356), str);
        bundle.putLong(StubApp.getString2(19487), j);
        K1.b0(x02, bundle, true);
        P0 p02 = c1200n0.f16547n;
        C1200n0.k(p02);
        p02.r(StubApp.getString2(6363), StubApp.getString2(6353), bundle);
    }

    public final void q(long j) {
        C1692e c1692e = this.f16652b;
        Iterator it = ((C1689b) c1692e.keySet()).iterator();
        while (it.hasNext()) {
            c1692e.put((String) it.next(), Long.valueOf(j));
        }
        if (c1692e.isEmpty()) {
            return;
        }
        this.f16654d = j;
    }
}
