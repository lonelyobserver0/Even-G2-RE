package L0;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1427b;
import o0.C1442q;
import o0.C1443r;
import o0.C1444s;
import o0.C1445t;
import o0.C1447v;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d0 extends AbstractC1416M {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f4059n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f4060b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4061c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4062d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4063e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4064f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4065g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4066h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4067i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4068k;

    /* renamed from: l, reason: collision with root package name */
    public final C1447v f4069l;

    /* renamed from: m, reason: collision with root package name */
    public final C1443r f4070m;

    static {
        T0.s sVar = new T0.s();
        M4.G g10 = M4.I.f4549b;
        M4.Z z2 = M4.Z.f4578e;
        List list = Collections.EMPTY_LIST;
        M4.Z z10 = M4.Z.f4578e;
        C1442q c1442q = new C1442q();
        C1445t c1445t = C1445t.f18247a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C1444s(uri, null, null, list, z10, -9223372036854775807L);
        }
        sVar.a();
        c1442q.a();
        o0.y yVar = o0.y.f18281B;
    }

    public d0(long j, boolean z2, boolean z10, C1447v c1447v) {
        this(j, j, 0L, 0L, z2, false, z10, null, c1447v);
    }

    @Override // o0.AbstractC1416M
    public final int b(Object obj) {
        return f4059n.equals(obj) ? 0 : -1;
    }

    @Override // o0.AbstractC1416M
    public final C1414K f(int i3, C1414K c1414k, boolean z2) {
        AbstractC1550k.e(i3, 1);
        Object obj = z2 ? f4059n : null;
        long j = -this.f4064f;
        c1414k.getClass();
        c1414k.h(null, obj, 0, this.f4062d, j, C1427b.f18123c, false);
        return c1414k;
    }

    @Override // o0.AbstractC1416M
    public final int h() {
        return 1;
    }

    @Override // o0.AbstractC1416M
    public final Object l(int i3) {
        AbstractC1550k.e(i3, 1);
        return f4059n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // o0.AbstractC1416M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o0.C1415L m(int r23, o0.C1415L r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            r0.AbstractC1550k.e(r2, r1)
            long r1 = r0.f4065g
            boolean r13 = r0.f4067i
            if (r13 == 0) goto L2c
            boolean r3 = r0.j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f4063e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = o0.C1415L.f18049q
            o0.r r14 = r0.f4070m
            long r1 = r0.f4063e
            o0.v r4 = r0.f4069l
            java.lang.Object r5 = r0.f4068k
            long r6 = r0.f4060b
            long r8 = r0.f4061c
            boolean r12 = r0.f4066h
            r19 = 0
            long r10 = r0.f4064f
            r3 = r24
            r17 = r1
            r20 = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.d0.m(int, o0.L, long):o0.L");
    }

    @Override // o0.AbstractC1416M
    public final int o() {
        return 1;
    }

    public d0(long j, long j3, long j10, long j11, boolean z2, boolean z10, boolean z11, Object obj, C1447v c1447v) {
        this(-9223372036854775807L, -9223372036854775807L, j, j3, j10, j11, z2, z10, false, obj, c1447v, z11 ? c1447v.f18250c : null);
    }

    public d0(long j, long j3, long j10, long j11, long j12, long j13, boolean z2, boolean z10, boolean z11, Object obj, C1447v c1447v, C1443r c1443r) {
        this.f4060b = j;
        this.f4061c = j3;
        this.f4062d = j10;
        this.f4063e = j11;
        this.f4064f = j12;
        this.f4065g = j13;
        this.f4066h = z2;
        this.f4067i = z10;
        this.j = z11;
        this.f4068k = obj;
        c1447v.getClass();
        this.f4069l = c1447v;
        this.f4070m = c1443r;
    }
}
