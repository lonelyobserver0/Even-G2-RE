package z1;

import no.nordicsemi.android.dfu.DfuBaseService;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;

/* renamed from: z1.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1991C implements InterfaceC1995G {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1990B f23724a;

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f23725b = new C1553n(32);

    /* renamed from: c, reason: collision with root package name */
    public int f23726c;

    /* renamed from: d, reason: collision with root package name */
    public int f23727d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23728e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23729f;

    public C1991C(InterfaceC1990B interfaceC1990B) {
        this.f23724a = interfaceC1990B;
    }

    @Override // z1.InterfaceC1995G
    public final void a() {
        this.f23729f = true;
    }

    @Override // z1.InterfaceC1995G
    public final void b(C1558s c1558s, T0.q qVar, C1994F c1994f) {
        this.f23724a.b(c1558s, qVar, c1994f);
        this.f23729f = true;
    }

    @Override // z1.InterfaceC1995G
    public final void c(int i3, C1553n c1553n) {
        boolean z2 = (i3 & 1) != 0;
        int u2 = z2 ? c1553n.f20177b + c1553n.u() : -1;
        if (this.f23729f) {
            if (!z2) {
                return;
            }
            this.f23729f = false;
            c1553n.G(u2);
            this.f23727d = 0;
        }
        while (c1553n.a() > 0) {
            int i10 = this.f23727d;
            C1553n c1553n2 = this.f23725b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int u10 = c1553n.u();
                    c1553n.G(c1553n.f20177b - 1);
                    if (u10 == 255) {
                        this.f23729f = true;
                        return;
                    }
                }
                int min = Math.min(c1553n.a(), 3 - this.f23727d);
                c1553n.f(this.f23727d, min, c1553n2.f20176a);
                int i11 = this.f23727d + min;
                this.f23727d = i11;
                if (i11 == 3) {
                    c1553n2.G(0);
                    c1553n2.F(3);
                    c1553n2.H(1);
                    int u11 = c1553n2.u();
                    int u12 = c1553n2.u();
                    this.f23728e = (u11 & 128) != 0;
                    int i12 = (((u11 & 15) << 8) | u12) + 3;
                    this.f23726c = i12;
                    byte[] bArr = c1553n2.f20176a;
                    if (bArr.length < i12) {
                        c1553n2.b(Math.min(DfuBaseService.ERROR_FILE_ERROR, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c1553n.a(), this.f23726c - this.f23727d);
                c1553n.f(this.f23727d, min2, c1553n2.f20176a);
                int i13 = this.f23727d + min2;
                this.f23727d = i13;
                int i14 = this.f23726c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f23728e) {
                        c1553n2.F(i14);
                    } else {
                        if (AbstractC1560u.l(0, i14, c1553n2.f20176a, -1) != 0) {
                            this.f23729f = true;
                            return;
                        }
                        c1553n2.F(this.f23726c - 4);
                    }
                    c1553n2.G(0);
                    this.f23724a.c(c1553n2);
                    this.f23727d = 0;
                }
            }
        }
    }
}
