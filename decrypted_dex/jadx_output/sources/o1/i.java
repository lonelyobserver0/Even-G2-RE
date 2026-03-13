package o1;

import T0.H;
import T0.q;
import Y.m;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public H f18341b;

    /* renamed from: c, reason: collision with root package name */
    public q f18342c;

    /* renamed from: d, reason: collision with root package name */
    public g f18343d;

    /* renamed from: e, reason: collision with root package name */
    public long f18344e;

    /* renamed from: f, reason: collision with root package name */
    public long f18345f;

    /* renamed from: g, reason: collision with root package name */
    public long f18346g;

    /* renamed from: h, reason: collision with root package name */
    public int f18347h;

    /* renamed from: i, reason: collision with root package name */
    public int f18348i;

    /* renamed from: k, reason: collision with root package name */
    public long f18349k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18350l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18351m;

    /* renamed from: a, reason: collision with root package name */
    public final C1453e f18340a = new C1453e(0);
    public m j = new m(25, false);

    public void a(long j) {
        this.f18346g = j;
    }

    public abstract long b(C1553n c1553n);

    public abstract boolean c(C1553n c1553n, long j, m mVar);

    public void d(boolean z2) {
        if (z2) {
            this.j = new m(25, false);
            this.f18345f = 0L;
            this.f18347h = 0;
        } else {
            this.f18347h = 1;
        }
        this.f18344e = -1L;
        this.f18346g = 0L;
    }
}
