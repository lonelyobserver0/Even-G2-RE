package z1;

import T0.H;
import androidx.recyclerview.widget.C0466t;
import kotlin.jvm.internal.ByteCompanionObject;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s implements InterfaceC2004i {

    /* renamed from: a, reason: collision with root package name */
    public final C1608a f23934a;

    /* renamed from: b, reason: collision with root package name */
    public String f23935b;

    /* renamed from: c, reason: collision with root package name */
    public H f23936c;

    /* renamed from: d, reason: collision with root package name */
    public r f23937d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23938e;

    /* renamed from: l, reason: collision with root package name */
    public long f23944l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f23939f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final C0466t f23940g = new C0466t(32);

    /* renamed from: h, reason: collision with root package name */
    public final C0466t f23941h = new C0466t(33);

    /* renamed from: i, reason: collision with root package name */
    public final C0466t f23942i = new C0466t(34);
    public final C0466t j = new C0466t(39);

    /* renamed from: k, reason: collision with root package name */
    public final C0466t f23943k = new C0466t(40);

    /* renamed from: m, reason: collision with root package name */
    public long f23945m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final C1553n f23946n = new C1553n();

    public s(C1608a c1608a) {
        this.f23934a = c1608a;
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        this.f23944l = 0L;
        this.f23945m = -9223372036854775807L;
        s0.n.a(this.f23939f);
        this.f23940g.g();
        this.f23941h.g();
        this.f23942i.g();
        this.j.g();
        this.f23943k.g();
        ((O0.u) this.f23934a.f20822c).c(0);
        r rVar = this.f23937d;
        if (rVar != null) {
            rVar.f23927f = false;
            rVar.f23928g = false;
            rVar.f23929h = false;
            rVar.f23930i = false;
            rVar.j = false;
        }
    }

    public final void b(int i3, int i10, byte[] bArr) {
        r rVar = this.f23937d;
        if (rVar.f23927f) {
            int i11 = rVar.f23925d;
            int i12 = (i3 + 2) - i11;
            if (i12 < i10) {
                rVar.f23928g = (bArr[i12] & ByteCompanionObject.MIN_VALUE) != 0;
                rVar.f23927f = false;
            } else {
                rVar.f23925d = (i10 - i3) + i11;
            }
        }
        if (!this.f23938e) {
            this.f23940g.a(i3, i10, bArr);
            this.f23941h.a(i3, i10, bArr);
            this.f23942i.a(i3, i10, bArr);
        }
        this.j.a(i3, i10, bArr);
        this.f23943k.a(i3, i10, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024c A[SYNTHETIC] */
    @Override // z1.InterfaceC2004i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r0.C1553n r36) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.s.c(r0.n):void");
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
        AbstractC1550k.h(this.f23936c);
        int i3 = AbstractC1560u.f20190a;
        if (z2) {
            ((O0.u) this.f23934a.f20822c).c(0);
            r rVar = this.f23937d;
            long j = this.f23944l;
            rVar.f23933m = rVar.f23924c;
            rVar.a((int) (j - rVar.f23923b));
            rVar.f23931k = rVar.f23923b;
            rVar.f23923b = j;
            rVar.a(0);
            rVar.f23930i = false;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23945m = j;
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23935b = c1994f.f23755e;
        c1994f.b();
        H w10 = qVar.w(c1994f.f23754d, 2);
        this.f23936c = w10;
        this.f23937d = new r(w10);
        this.f23934a.i(qVar, c1994f);
    }
}
