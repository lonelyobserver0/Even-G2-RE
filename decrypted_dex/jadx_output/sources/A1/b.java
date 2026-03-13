package A1;

import T0.H;
import T0.q;
import com.stub.StubApp;
import java.math.RoundingMode;
import o0.AbstractC1405B;
import o0.C1406C;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements c {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f39m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f40n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final q f41a;

    /* renamed from: b, reason: collision with root package name */
    public final H f42b;

    /* renamed from: c, reason: collision with root package name */
    public final f f43c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f45e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553n f46f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47g;

    /* renamed from: h, reason: collision with root package name */
    public final C1438m f48h;

    /* renamed from: i, reason: collision with root package name */
    public int f49i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f50k;

    /* renamed from: l, reason: collision with root package name */
    public long f51l;

    public b(q qVar, H h2, f fVar) {
        this.f41a = qVar;
        this.f42b = h2;
        this.f43c = fVar;
        int i3 = fVar.f68b;
        int max = Math.max(1, i3 / 10);
        this.f47g = max;
        C1553n c1553n = new C1553n((byte[]) fVar.f71e);
        c1553n.n();
        int n10 = c1553n.n();
        this.f44d = n10;
        int i10 = fVar.f67a;
        int i11 = fVar.f69c;
        int i12 = (((i11 - (i10 * 4)) * 8) / (fVar.f70d * i10)) + 1;
        if (n10 != i12) {
            throw C1406C.a(StubApp.getString2(77) + i12 + StubApp.getString2(78) + n10, null);
        }
        int f10 = AbstractC1560u.f(max, n10);
        this.f45e = new byte[f10 * i11];
        this.f46f = new C1553n(n10 * 2 * i10 * f10);
        int i13 = ((i11 * i3) * 8) / n10;
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(76));
        c1437l.f18173h = i13;
        c1437l.f18174i = i13;
        c1437l.f18178n = max * 2 * i10;
        c1437l.f18156B = i10;
        c1437l.f18157C = i3;
        c1437l.f18158D = 2;
        this.f48h = new C1438m(c1437l);
    }

    @Override // A1.c
    public final void a(long j) {
        this.f49i = 0;
        this.j = j;
        this.f50k = 0;
        this.f51l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // A1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(T0.l r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.b.b(T0.l, long):boolean");
    }

    @Override // A1.c
    public final void c(int i3, long j) {
        this.f41a.D(new h(this.f43c, this.f44d, i3, j));
        this.f42b.d(this.f48h);
    }

    public final void d(int i3) {
        long j = this.j;
        long j3 = this.f51l;
        f fVar = this.f43c;
        long j10 = fVar.f68b;
        int i10 = AbstractC1560u.f20190a;
        long R10 = j + AbstractC1560u.R(j3, 1000000L, j10, RoundingMode.DOWN);
        int i11 = i3 * 2 * fVar.f67a;
        this.f42b.c(R10, 1, i11, this.f50k - i11, null);
        this.f51l += i3;
        this.f50k -= i11;
    }
}
