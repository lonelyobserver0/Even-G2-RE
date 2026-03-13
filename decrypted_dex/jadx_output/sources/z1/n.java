package z1;

import T0.H;
import androidx.recyclerview.widget.C0466t;
import r0.AbstractC1550k;
import r0.C1553n;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n implements InterfaceC2004i {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f23864l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final C1803F f23865a;

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f23866b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f23867c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final l f23868d;

    /* renamed from: e, reason: collision with root package name */
    public final C0466t f23869e;

    /* renamed from: f, reason: collision with root package name */
    public m f23870f;

    /* renamed from: g, reason: collision with root package name */
    public long f23871g;

    /* renamed from: h, reason: collision with root package name */
    public String f23872h;

    /* renamed from: i, reason: collision with root package name */
    public H f23873i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f23874k;

    public n(C1803F c1803f) {
        this.f23865a = c1803f;
        l lVar = new l();
        lVar.f23855e = new byte[128];
        this.f23868d = lVar;
        this.f23874k = -9223372036854775807L;
        this.f23869e = new C0466t(178);
        this.f23866b = new C1553n();
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        s0.n.a(this.f23867c);
        l lVar = this.f23868d;
        lVar.f23851a = false;
        lVar.f23853c = 0;
        lVar.f23852b = 0;
        m mVar = this.f23870f;
        if (mVar != null) {
            mVar.f23857b = false;
            mVar.f23858c = false;
            mVar.f23859d = false;
            mVar.f23860e = -1;
        }
        C0466t c0466t = this.f23869e;
        if (c0466t != null) {
            c0466t.g();
        }
        this.f23871g = 0L;
        this.f23874k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    @Override // z1.InterfaceC2004i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r0.C1553n r23) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.n.c(r0.n):void");
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
        AbstractC1550k.h(this.f23870f);
        if (z2) {
            this.f23870f.b(this.j, this.f23871g, 0);
            m mVar = this.f23870f;
            mVar.f23857b = false;
            mVar.f23858c = false;
            mVar.f23859d = false;
            mVar.f23860e = -1;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23874k = j;
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23872h = c1994f.f23755e;
        c1994f.b();
        H w10 = qVar.w(c1994f.f23754d, 2);
        this.f23873i = w10;
        this.f23870f = new m(w10);
        this.f23865a.f(qVar, c1994f);
    }
}
