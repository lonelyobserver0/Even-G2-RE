package q1;

import T0.H;
import T0.o;
import T0.p;
import T0.q;
import T0.y;
import com.stub.StubApp;
import java.util.ArrayList;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements o {

    /* renamed from: a, reason: collision with root package name */
    public final l f19892a;

    /* renamed from: b, reason: collision with root package name */
    public final C1438m f19893b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19894c;

    /* renamed from: f, reason: collision with root package name */
    public H f19897f;

    /* renamed from: g, reason: collision with root package name */
    public int f19898g;

    /* renamed from: h, reason: collision with root package name */
    public int f19899h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f19900i;
    public long j;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f19896e = AbstractC1560u.f20195f;

    /* renamed from: d, reason: collision with root package name */
    public final C1553n f19895d = new C1553n();

    public h(l lVar, C1438m c1438m) {
        this.f19892a = lVar;
        C1437l a3 = c1438m.a();
        a3.f18177m = AbstractC1405B.m(StubApp.getString2(462));
        a3.j = c1438m.f18216n;
        a3.f18162H = lVar.p();
        this.f19893b = new C1438m(a3);
        this.f19894c = new ArrayList();
        this.f19899h = 0;
        this.f19900i = AbstractC1560u.f20196g;
        this.j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        AbstractC1550k.h(this.f19897f);
        byte[] bArr = gVar.f19891b;
        int length = bArr.length;
        C1553n c1553n = this.f19895d;
        c1553n.getClass();
        c1553n.E(bArr.length, bArr);
        this.f19897f.a(c1553n, length, 0);
        this.f19897f.c(gVar.f19890a, 1, length, 0, null);
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        int i3 = this.f19899h;
        AbstractC1550k.g((i3 == 0 || i3 == 5) ? false : true);
        this.j = j3;
        if (this.f19899h == 2) {
            this.f19899h = 1;
        }
        if (this.f19899h == 4) {
            this.f19899h = 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r23.f19898g != r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r0 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r4 = r23.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0086, code lost:
    
        r0 = new q1.k(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        r23.f19892a.n(r23.f19896e, 0, r23.f19898g, r0, new c5.B(r23, 23));
        java.util.Collections.sort(r8);
        r23.f19900i = new long[r8.size()];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bb, code lost:
    
        if (r0 >= r8.size()) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bd, code lost:
    
        r23.f19900i[r0] = ((q1.g) r8.get(r0)).f19890a;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        r23.f19896e = r0.AbstractC1560u.f20195f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d2, code lost:
    
        r23.f19899h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008e, code lost:
    
        r0 = q1.k.f19903c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e0, code lost:
    
        throw o0.C1406C.a(com.stub.StubApp.getString2(22190), r0);
     */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r24, T0.s r25) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.h.c(T0.p, T0.s):int");
    }

    @Override // T0.o
    public final void f(q qVar) {
        AbstractC1550k.g(this.f19899h == 0);
        H w10 = qVar.w(0, 3);
        this.f19897f = w10;
        w10.d(this.f19893b);
        qVar.q();
        qVar.D(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f19899h = 1;
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        return true;
    }

    @Override // T0.o
    public final void release() {
        if (this.f19899h == 5) {
            return;
        }
        this.f19892a.reset();
        this.f19899h = 5;
    }
}
