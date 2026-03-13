package D0;

import android.graphics.Bitmap;
import android.os.Trace;
import com.stub.StubApp;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayDeque;
import o0.C1438m;
import r0.AbstractC1550k;
import v0.AbstractC1810e;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends AbstractC1810e {

    /* renamed from: A, reason: collision with root package name */
    public long f1247A;

    /* renamed from: B, reason: collision with root package name */
    public long f1248B;

    /* renamed from: C, reason: collision with root package name */
    public int f1249C;

    /* renamed from: D, reason: collision with root package name */
    public int f1250D;

    /* renamed from: E, reason: collision with root package name */
    public C1438m f1251E;

    /* renamed from: F, reason: collision with root package name */
    public b f1252F;

    /* renamed from: G, reason: collision with root package name */
    public u0.e f1253G;

    /* renamed from: H, reason: collision with root package name */
    public e f1254H;

    /* renamed from: I, reason: collision with root package name */
    public Bitmap f1255I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1256K;

    /* renamed from: L, reason: collision with root package name */
    public g f1257L;

    /* renamed from: O, reason: collision with root package name */
    public g f1258O;

    /* renamed from: P, reason: collision with root package name */
    public int f1259P;

    /* renamed from: t, reason: collision with root package name */
    public final s2.d f1260t;

    /* renamed from: v, reason: collision with root package name */
    public final u0.e f1261v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f1262w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1263x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1264y;

    /* renamed from: z, reason: collision with root package name */
    public f f1265z;

    public h(s2.d dVar) {
        super(4);
        this.f1260t = dVar;
        this.f1254H = e.f1240a;
        this.f1261v = new u0.e(0);
        this.f1265z = f.f1241c;
        this.f1262w = new ArrayDeque();
        this.f1248B = -9223372036854775807L;
        this.f1247A = -9223372036854775807L;
        this.f1249C = 0;
        this.f1250D = 1;
    }

    @Override // v0.AbstractC1810e
    public final int B(C1438m c1438m) {
        return this.f1260t.A(c1438m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
    
        if (r14.f1244a == ((r0.f18201K * r1.f18200J) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.h.D(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0105, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(long r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.h.E(long):boolean");
    }

    public final void F() {
        C1438m c1438m = this.f1251E;
        s2.d dVar = this.f1260t;
        int A4 = dVar.A(c1438m);
        if (A4 != AbstractC1810e.f(4, 0, 0, 0) && A4 != AbstractC1810e.f(3, 0, 0, 0)) {
            throw g(new d(StubApp.getString2(PlatformPlugin.DEFAULT_SYSTEM_UI)), this.f1251E, false, 4005);
        }
        b bVar = this.f1252F;
        if (bVar != null) {
            bVar.release();
        }
        this.f1252F = new b((A1.a) dVar.f20712b);
    }

    public final void G() {
        this.f1253G = null;
        this.f1249C = 0;
        this.f1248B = -9223372036854775807L;
        b bVar = this.f1252F;
        if (bVar != null) {
            bVar.release();
            this.f1252F = null;
        }
    }

    @Override // v0.AbstractC1810e, v0.Y
    public final void d(int i3, Object obj) {
        if (i3 != 15) {
            return;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar == null) {
            eVar = e.f1240a;
        }
        this.f1254H = eVar;
    }

    @Override // v0.AbstractC1810e
    public final String j() {
        return StubApp.getString2(1281);
    }

    @Override // v0.AbstractC1810e
    public final boolean l() {
        return this.f1264y;
    }

    @Override // v0.AbstractC1810e
    public final boolean n() {
        int i3 = this.f1250D;
        if (i3 != 3) {
            return i3 == 0 && this.f1256K;
        }
        return true;
    }

    @Override // v0.AbstractC1810e
    public final void o() {
        this.f1251E = null;
        this.f1265z = f.f1241c;
        this.f1262w.clear();
        G();
        this.f1254H.getClass();
    }

    @Override // v0.AbstractC1810e
    public final void p(boolean z2, boolean z10) {
        this.f1250D = z10 ? 1 : 0;
    }

    @Override // v0.AbstractC1810e
    public final void q(long j, boolean z2) {
        this.f1250D = Math.min(this.f1250D, 1);
        this.f1264y = false;
        this.f1263x = false;
        this.f1255I = null;
        this.f1257L = null;
        this.f1258O = null;
        this.f1256K = false;
        this.f1253G = null;
        b bVar = this.f1252F;
        if (bVar != null) {
            bVar.flush();
        }
        this.f1262w.clear();
    }

    @Override // v0.AbstractC1810e
    public final void r() {
        G();
    }

    @Override // v0.AbstractC1810e
    public final void s() {
        G();
        this.f1250D = Math.min(this.f1250D, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // v0.AbstractC1810e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(o0.C1438m[] r5, long r6, long r8, L0.B r10) {
        /*
            r4 = this;
            D0.f r5 = r4.f1265z
            long r5 = r5.f1243b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f1262w
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f1248B
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f1247A
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            D0.f r6 = new D0.f
            long r0 = r4.f1248B
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            D0.f r5 = new D0.f
            r5.<init>(r0, r8)
            r4.f1265z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.h.v(o0.m[], long, long, L0.B):void");
    }

    @Override // v0.AbstractC1810e
    public final void x(long j, long j3) {
        if (this.f1264y) {
            return;
        }
        if (this.f1251E == null) {
            C1803F c1803f = this.f21718c;
            c1803f.c();
            u0.e eVar = this.f1261v;
            eVar.s();
            int w10 = w(c1803f, eVar, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    AbstractC1550k.g(eVar.k(4));
                    this.f1263x = true;
                    this.f1264y = true;
                    return;
                }
                return;
            }
            C1438m c1438m = (C1438m) c1803f.f21582b;
            AbstractC1550k.h(c1438m);
            this.f1251E = c1438m;
            F();
        }
        try {
            Trace.beginSection(StubApp.getString2("1282"));
            while (D(j)) {
            }
            while (E(j)) {
            }
            Trace.endSection();
        } catch (d e10) {
            throw g(e10, null, false, 4003);
        }
    }
}
