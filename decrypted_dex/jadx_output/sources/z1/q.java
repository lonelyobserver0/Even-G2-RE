package z1;

import T0.H;
import androidx.recyclerview.widget.C0466t;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q implements InterfaceC2004i {

    /* renamed from: a, reason: collision with root package name */
    public final C1608a f23908a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23909b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23910c;

    /* renamed from: g, reason: collision with root package name */
    public long f23914g;

    /* renamed from: i, reason: collision with root package name */
    public String f23916i;
    public H j;

    /* renamed from: k, reason: collision with root package name */
    public p f23917k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23918l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23920n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f23915h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final C0466t f23911d = new C0466t(7);

    /* renamed from: e, reason: collision with root package name */
    public final C0466t f23912e = new C0466t(8);

    /* renamed from: f, reason: collision with root package name */
    public final C0466t f23913f = new C0466t(6);

    /* renamed from: m, reason: collision with root package name */
    public long f23919m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final C1553n f23921o = new C1553n();

    public q(C1608a c1608a, boolean z2, boolean z10) {
        this.f23908a = c1608a;
        this.f23909b = z2;
        this.f23910c = z10;
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        this.f23914g = 0L;
        this.f23920n = false;
        this.f23919m = -9223372036854775807L;
        s0.n.a(this.f23915h);
        this.f23911d.g();
        this.f23912e.g();
        this.f23913f.g();
        ((O0.u) this.f23908a.f20822c).c(0);
        p pVar = this.f23917k;
        if (pVar != null) {
            pVar.f23899k = false;
            pVar.f23903o = false;
            o oVar = pVar.f23902n;
            oVar.f23876b = false;
            oVar.f23875a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r18, int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.q.b(int, int, byte[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0244, code lost:
    
        if (r5.f23887n != r6.f23887n) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0255, code lost:
    
        if (r5.f23889p != r6.f23889p) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0263, code lost:
    
        if (r5.f23885l != r6.f23885l) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0281  */
    @Override // z1.InterfaceC2004i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r0.C1553n r30) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.q.c(r0.n):void");
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
        AbstractC1550k.h(this.j);
        int i3 = AbstractC1560u.f20190a;
        if (z2) {
            ((O0.u) this.f23908a.f20822c).c(0);
            p pVar = this.f23917k;
            long j = this.f23914g;
            pVar.a();
            pVar.j = j;
            long j3 = pVar.f23905q;
            if (j3 != -9223372036854775807L) {
                boolean z10 = pVar.f23906r;
                pVar.f23890a.c(j3, z10 ? 1 : 0, (int) (j - pVar.f23904p), 0, null);
            }
            pVar.f23903o = false;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23919m = j;
        this.f23920n = ((i3 & 2) != 0) | this.f23920n;
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23916i = c1994f.f23755e;
        c1994f.b();
        H w10 = qVar.w(c1994f.f23754d, 2);
        this.j = w10;
        this.f23917k = new p(w10, this.f23909b, this.f23910c);
        this.f23908a.i(qVar, c1994f);
    }
}
