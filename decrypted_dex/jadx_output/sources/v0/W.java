package v0;

import L0.h0;
import android.os.SystemClock;
import java.util.List;
import o0.AbstractC1416M;
import o0.C1408E;
import o0.C1413J;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class W {

    /* renamed from: u, reason: collision with root package name */
    public static final L0.B f21657u = new L0.B(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1416M f21658a;

    /* renamed from: b, reason: collision with root package name */
    public final L0.B f21659b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21660c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21661d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21662e;

    /* renamed from: f, reason: collision with root package name */
    public final C1817l f21663f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21664g;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f21665h;

    /* renamed from: i, reason: collision with root package name */
    public final O0.w f21666i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final L0.B f21667k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21668l;

    /* renamed from: m, reason: collision with root package name */
    public final int f21669m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21670n;

    /* renamed from: o, reason: collision with root package name */
    public final C1408E f21671o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21672p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f21673q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f21674r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f21675s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f21676t;

    public W(AbstractC1416M abstractC1416M, L0.B b2, long j, long j3, int i3, C1817l c1817l, boolean z2, h0 h0Var, O0.w wVar, List list, L0.B b10, boolean z10, int i10, int i11, C1408E c1408e, long j10, long j11, long j12, long j13, boolean z11) {
        this.f21658a = abstractC1416M;
        this.f21659b = b2;
        this.f21660c = j;
        this.f21661d = j3;
        this.f21662e = i3;
        this.f21663f = c1817l;
        this.f21664g = z2;
        this.f21665h = h0Var;
        this.f21666i = wVar;
        this.j = list;
        this.f21667k = b10;
        this.f21668l = z10;
        this.f21669m = i10;
        this.f21670n = i11;
        this.f21671o = c1408e;
        this.f21673q = j10;
        this.f21674r = j11;
        this.f21675s = j12;
        this.f21676t = j13;
        this.f21672p = z11;
    }

    public static W i(O0.w wVar) {
        C1413J c1413j = AbstractC1416M.f18066a;
        L0.B b2 = f21657u;
        return new W(c1413j, b2, -9223372036854775807L, 0L, 1, null, false, h0.f4092d, wVar, M4.Z.f4578e, b2, false, 1, 0, C1408E.f18025d, 0L, 0L, 0L, 0L, false);
    }

    public final W a() {
        return new W(this.f21658a, this.f21659b, this.f21660c, this.f21661d, this.f21662e, this.f21663f, this.f21664g, this.f21665h, this.f21666i, this.j, this.f21667k, this.f21668l, this.f21669m, this.f21670n, this.f21671o, this.f21673q, this.f21674r, j(), SystemClock.elapsedRealtime(), this.f21672p);
    }

    public final W b(L0.B b2) {
        return new W(this.f21658a, this.f21659b, this.f21660c, this.f21661d, this.f21662e, this.f21663f, this.f21664g, this.f21665h, this.f21666i, this.j, b2, this.f21668l, this.f21669m, this.f21670n, this.f21671o, this.f21673q, this.f21674r, this.f21675s, this.f21676t, this.f21672p);
    }

    public final W c(L0.B b2, long j, long j3, long j10, long j11, h0 h0Var, O0.w wVar, List list) {
        return new W(this.f21658a, b2, j3, j10, this.f21662e, this.f21663f, this.f21664g, h0Var, wVar, list, this.f21667k, this.f21668l, this.f21669m, this.f21670n, this.f21671o, this.f21673q, j11, j, SystemClock.elapsedRealtime(), this.f21672p);
    }

    public final W d(int i3, int i10, boolean z2) {
        return new W(this.f21658a, this.f21659b, this.f21660c, this.f21661d, this.f21662e, this.f21663f, this.f21664g, this.f21665h, this.f21666i, this.j, this.f21667k, z2, i3, i10, this.f21671o, this.f21673q, this.f21674r, this.f21675s, this.f21676t, this.f21672p);
    }

    public final W e(C1817l c1817l) {
        return new W(this.f21658a, this.f21659b, this.f21660c, this.f21661d, this.f21662e, c1817l, this.f21664g, this.f21665h, this.f21666i, this.j, this.f21667k, this.f21668l, this.f21669m, this.f21670n, this.f21671o, this.f21673q, this.f21674r, this.f21675s, this.f21676t, this.f21672p);
    }

    public final W f(C1408E c1408e) {
        return new W(this.f21658a, this.f21659b, this.f21660c, this.f21661d, this.f21662e, this.f21663f, this.f21664g, this.f21665h, this.f21666i, this.j, this.f21667k, this.f21668l, this.f21669m, this.f21670n, c1408e, this.f21673q, this.f21674r, this.f21675s, this.f21676t, this.f21672p);
    }

    public final W g(int i3) {
        return new W(this.f21658a, this.f21659b, this.f21660c, this.f21661d, i3, this.f21663f, this.f21664g, this.f21665h, this.f21666i, this.j, this.f21667k, this.f21668l, this.f21669m, this.f21670n, this.f21671o, this.f21673q, this.f21674r, this.f21675s, this.f21676t, this.f21672p);
    }

    public final W h(AbstractC1416M abstractC1416M) {
        return new W(abstractC1416M, this.f21659b, this.f21660c, this.f21661d, this.f21662e, this.f21663f, this.f21664g, this.f21665h, this.f21666i, this.j, this.f21667k, this.f21668l, this.f21669m, this.f21670n, this.f21671o, this.f21673q, this.f21674r, this.f21675s, this.f21676t, this.f21672p);
    }

    public final long j() {
        long j;
        long j3;
        if (!k()) {
            return this.f21675s;
        }
        do {
            j = this.f21676t;
            j3 = this.f21675s;
        } while (j != this.f21676t);
        return AbstractC1560u.J(AbstractC1560u.V(j3) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f21671o.f18026a)));
    }

    public final boolean k() {
        return this.f21662e == 3 && this.f21668l && this.f21670n == 0;
    }
}
