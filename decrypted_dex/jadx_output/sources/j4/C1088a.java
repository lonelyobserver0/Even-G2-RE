package j4;

import S3.D;
import android.os.Bundle;
import android.os.SystemClock;
import cb.C0585c;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l4.C1162a1;
import l4.C1191k0;
import l4.C1200n0;
import l4.C1219x;
import l4.H0;
import l4.H1;
import l4.K1;
import l4.P0;
import l4.T;
import l4.X0;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import t.C1692e;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1088a extends AbstractC1090c {

    /* renamed from: a, reason: collision with root package name */
    public final C1200n0 f15322a;

    /* renamed from: b, reason: collision with root package name */
    public final P0 f15323b;

    public C1088a(C1200n0 c1200n0) {
        D.h(c1200n0);
        this.f15322a = c1200n0;
        P0 p02 = c1200n0.f16547n;
        C1200n0.k(p02);
        this.f15323b = p02;
    }

    @Override // l4.Q0
    public final void a(String str, String str2, Bundle bundle) {
        P0 p02 = this.f15323b;
        ((C1200n0) p02.f4728a).f16545l.getClass();
        p02.p(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // l4.Q0
    public final String b() {
        C1162a1 c1162a1 = ((C1200n0) this.f15323b.f4728a).f16546m;
        C1200n0.k(c1162a1);
        X0 x02 = c1162a1.f16347c;
        if (x02 != null) {
            return x02.f16317a;
        }
        return null;
    }

    @Override // l4.Q0
    public final String c() {
        C1162a1 c1162a1 = ((C1200n0) this.f15323b.f4728a).f16546m;
        C1200n0.k(c1162a1);
        X0 x02 = c1162a1.f16347c;
        if (x02 != null) {
            return x02.f16318b;
        }
        return null;
    }

    @Override // l4.Q0
    public final void d(Bundle bundle) {
        P0 p02 = this.f15323b;
        ((C1200n0) p02.f4728a).f16545l.getClass();
        p02.x(bundle, System.currentTimeMillis());
    }

    @Override // l4.Q0
    public final void e(String str) {
        C1200n0 c1200n0 = this.f15322a;
        C1219x c1219x = c1200n0.f16548p;
        C1200n0.i(c1219x);
        c1200n0.f16545l.getClass();
        c1219x.m(SystemClock.elapsedRealtime(), str);
    }

    @Override // l4.Q0
    public final void f(String str) {
        C1200n0 c1200n0 = this.f15322a;
        C1219x c1219x = c1200n0.f16548p;
        C1200n0.i(c1219x);
        c1200n0.f16545l.getClass();
        c1219x.l(SystemClock.elapsedRealtime(), str);
    }

    @Override // l4.Q0
    public final long g() {
        K1 k12 = this.f15322a.j;
        C1200n0.j(k12);
        return k12.g0();
    }

    @Override // l4.Q0
    public final void h(String str, String str2, Bundle bundle) {
        P0 p02 = this.f15322a.f16547n;
        C1200n0.k(p02);
        p02.y(str, str2, bundle);
    }

    @Override // l4.Q0
    public final List i(String str, String str2) {
        P0 p02 = this.f15323b;
        C1200n0 c1200n0 = (C1200n0) p02.f4728a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        boolean q10 = c1191k0.q();
        T t3 = c1200n0.f16541f;
        if (q10) {
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(19027));
            return new ArrayList(0);
        }
        if (C0585c.g()) {
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(19028));
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C1191k0 c1191k02 = c1200n0.f16542g;
        C1200n0.l(c1191k02);
        c1191k02.u(atomicReference, DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, StubApp.getString2(19029), new N9.c(p02, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return K1.Z(list);
        }
        C1200n0.l(t3);
        t3.f16242f.c(null, StubApp.getString2(19030));
        return new ArrayList();
    }

    @Override // l4.Q0
    public final int j(String str) {
        P0 p02 = this.f15323b;
        p02.getClass();
        D.e(str);
        ((C1200n0) p02.f4728a).getClass();
        return 25;
    }

    @Override // l4.Q0
    public final String k() {
        return (String) this.f15323b.f16210g.get();
    }

    @Override // l4.Q0
    public final String l() {
        return (String) this.f15323b.f16210g.get();
    }

    @Override // l4.Q0
    public final Map m(String str, String str2, boolean z2) {
        P0 p02 = this.f15323b;
        C1200n0 c1200n0 = (C1200n0) p02.f4728a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        boolean q10 = c1191k0.q();
        T t3 = c1200n0.f16541f;
        if (q10) {
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(19031));
            return Collections.EMPTY_MAP;
        }
        if (C0585c.g()) {
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(19032));
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C1191k0 c1191k02 = c1200n0.f16542g;
        C1200n0.l(c1191k02);
        c1191k02.u(atomicReference, DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, StubApp.getString2(19033), new H0(p02, atomicReference, str, str2, z2));
        List<H1> list = (List) atomicReference.get();
        if (list == null) {
            C1200n0.l(t3);
            t3.f16242f.c(Boolean.valueOf(z2), StubApp.getString2(19034));
            return Collections.EMPTY_MAP;
        }
        C1692e c1692e = new C1692e(list.size());
        for (H1 h12 : list) {
            Object d8 = h12.d();
            if (d8 != null) {
                c1692e.put(h12.f16100b, d8);
            }
        }
        return c1692e;
    }
}
