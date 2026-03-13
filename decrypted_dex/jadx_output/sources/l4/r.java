package l4;

import L0.C0106b;
import android.os.Bundle;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.Iterator;
import r0.AbstractC1550k;
import z0.C1986b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16597a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f16598b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16599c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16600d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16601e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16602f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16603g;

    public r(C1200n0 c1200n0, String str, String str2, String str3, long j, long j3, Bundle bundle) {
        C1213u c1213u;
        S3.D.e(str2);
        S3.D.e(str3);
        this.f16600d = str2;
        this.f16601e = str3;
        this.f16602f = true == TextUtils.isEmpty(str) ? null : str;
        this.f16598b = j;
        this.f16599c = j3;
        if (j3 != 0 && j3 > j) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.j.c(T.s(str2), StubApp.getString2(20876));
        }
        if (bundle == null || bundle.isEmpty()) {
            c1213u = new C1213u(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    T t10 = c1200n0.f16541f;
                    C1200n0.l(t10);
                    t10.f16242f.b(StubApp.getString2(20877));
                    it.remove();
                } else {
                    K1 k12 = c1200n0.j;
                    C1200n0.j(k12);
                    Object r8 = k12.r(bundle2.get(next), next);
                    if (r8 == null) {
                        T t11 = c1200n0.f16541f;
                        C1200n0.l(t11);
                        t11.j.c(c1200n0.f16544k.b(next), StubApp.getString2(19960));
                        it.remove();
                    } else {
                        K1 k13 = c1200n0.j;
                        C1200n0.j(k13);
                        k13.z(bundle2, next, r8);
                    }
                }
            }
            c1213u = new C1213u(bundle2);
        }
        this.f16603g = c1213u;
    }

    public r a(long j, z0.m mVar) {
        long p8;
        long p9;
        y0.h c10 = ((z0.m) this.f16601e).c();
        y0.h c11 = mVar.c();
        if (c10 == null) {
            return new r(j, mVar, (C1986b) this.f16602f, (M0.d) this.f16600d, this.f16599c, c10);
        }
        if (!c10.v()) {
            return new r(j, mVar, (C1986b) this.f16602f, (M0.d) this.f16600d, this.f16599c, c11);
        }
        long A4 = c10.A(j);
        if (A4 == 0) {
            return new r(j, mVar, (C1986b) this.f16602f, (M0.d) this.f16600d, this.f16599c, c11);
        }
        AbstractC1550k.h(c11);
        long x7 = c10.x();
        long a3 = c10.a(x7);
        long j3 = A4 + x7;
        long j10 = j3 - 1;
        long d8 = c10.d(j10, j) + c10.a(j10);
        long x10 = c11.x();
        long a9 = c11.a(x10);
        long j11 = this.f16599c;
        if (d8 == a9) {
            p8 = j3 - x10;
        } else {
            if (d8 < a9) {
                throw new C0106b();
            }
            if (a9 < a3) {
                p9 = j11 - (c11.p(a3, j) - x7);
                return new r(j, mVar, (C1986b) this.f16602f, (M0.d) this.f16600d, p9, c11);
            }
            p8 = c10.p(a9, j) - x10;
        }
        p9 = p8 + j11;
        return new r(j, mVar, (C1986b) this.f16602f, (M0.d) this.f16600d, p9, c11);
    }

    public long b(long j) {
        y0.h hVar = (y0.h) this.f16603g;
        AbstractC1550k.h(hVar);
        return hVar.g(this.f16598b, j) + this.f16599c;
    }

    public long c(long j) {
        long b2 = b(j);
        y0.h hVar = (y0.h) this.f16603g;
        AbstractC1550k.h(hVar);
        return (hVar.B(this.f16598b, j) + b2) - 1;
    }

    public long d() {
        y0.h hVar = (y0.h) this.f16603g;
        AbstractC1550k.h(hVar);
        return hVar.A(this.f16598b);
    }

    public long e(long j) {
        long f10 = f(j);
        y0.h hVar = (y0.h) this.f16603g;
        AbstractC1550k.h(hVar);
        return hVar.d(j - this.f16599c, this.f16598b) + f10;
    }

    public long f(long j) {
        y0.h hVar = (y0.h) this.f16603g;
        AbstractC1550k.h(hVar);
        return hVar.a(j - this.f16599c);
    }

    public boolean g(long j, long j3) {
        y0.h hVar = (y0.h) this.f16603g;
        AbstractC1550k.h(hVar);
        return hVar.v() || j3 == -9223372036854775807L || e(j) <= j3;
    }

    public r h(C1200n0 c1200n0, long j) {
        return new r(c1200n0, (String) this.f16602f, (String) this.f16600d, (String) this.f16601e, this.f16598b, j, (C1213u) this.f16603g);
    }

    public String toString() {
        switch (this.f16597a) {
            case 0:
                String c1213u = ((C1213u) this.f16603g).toString();
                String str = (String) this.f16600d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f16601e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + c1213u.length() + 1);
                E1.a.v(sb2, StubApp.getString2(20879), str, StubApp.getString2(14658), str2);
                return E1.a.n(sb2, StubApp.getString2(20880), c1213u, StubApp.getString2(265));
            default:
                return super.toString();
        }
    }

    public r(C1200n0 c1200n0, String str, String str2, String str3, long j, long j3, C1213u c1213u) {
        S3.D.e(str2);
        S3.D.e(str3);
        S3.D.h(c1213u);
        this.f16600d = str2;
        this.f16601e = str3;
        this.f16602f = true == TextUtils.isEmpty(str) ? null : str;
        this.f16598b = j;
        this.f16599c = j3;
        if (j3 != 0 && j3 > j) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.j.d(StubApp.getString2(20878), T.s(str2), T.s(str3));
        }
        this.f16603g = c1213u;
    }

    public r(long j, z0.m mVar, C1986b c1986b, M0.d dVar, long j3, y0.h hVar) {
        this.f16598b = j;
        this.f16601e = mVar;
        this.f16602f = c1986b;
        this.f16599c = j3;
        this.f16600d = dVar;
        this.f16603g = hVar;
    }
}
