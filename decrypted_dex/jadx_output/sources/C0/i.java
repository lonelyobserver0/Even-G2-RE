package C0;

import M4.I;
import M4.e0;
import M4.r;
import java.util.List;
import java.util.Map;
import o0.C1435j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f943d;

    /* renamed from: e, reason: collision with root package name */
    public final long f944e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f945f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f946g;

    /* renamed from: h, reason: collision with root package name */
    public final long f947h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f948i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final long f949k;

    /* renamed from: l, reason: collision with root package name */
    public final int f950l;

    /* renamed from: m, reason: collision with root package name */
    public final long f951m;

    /* renamed from: n, reason: collision with root package name */
    public final long f952n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f953o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f954p;

    /* renamed from: q, reason: collision with root package name */
    public final C1435j f955q;

    /* renamed from: r, reason: collision with root package name */
    public final I f956r;

    /* renamed from: s, reason: collision with root package name */
    public final I f957s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f958t;

    /* renamed from: u, reason: collision with root package name */
    public final long f959u;

    /* renamed from: v, reason: collision with root package name */
    public final h f960v;

    public i(int i3, String str, List list, long j, boolean z2, long j3, boolean z10, int i10, long j10, int i11, long j11, long j12, boolean z11, boolean z12, boolean z13, C1435j c1435j, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        this.f943d = i3;
        this.f947h = j3;
        this.f946g = z2;
        this.f948i = z10;
        this.j = i10;
        this.f949k = j10;
        this.f950l = i11;
        this.f951m = j11;
        this.f952n = j12;
        this.f953o = z12;
        this.f954p = z13;
        this.f955q = c1435j;
        this.f956r = I.m(list2);
        this.f957s = I.m(list3);
        this.f958t = e0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) r.j(list3);
            this.f959u = dVar.f932e + dVar.f930c;
        } else if (list2.isEmpty()) {
            this.f959u = 0L;
        } else {
            f fVar = (f) r.j(list2);
            this.f959u = fVar.f932e + fVar.f930c;
        }
        this.f944e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f959u, j) : Math.max(0L, this.f959u + j) : -9223372036854775807L;
        this.f945f = j >= 0;
        this.f960v = hVar;
    }

    @Override // G0.a
    public final Object a(List list) {
        return this;
    }
}
