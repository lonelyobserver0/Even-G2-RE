package z1;

import T0.AbstractC0311b;
import kotlin.UByte;
import r0.C1553n;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1997b implements T0.o {

    /* renamed from: a, reason: collision with root package name */
    public final C1998c f23757a = new C1998c();

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f23758b = new C1553n(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f23759c;

    @Override // T0.o
    public final void b(long j, long j3) {
        this.f23759c = false;
        this.f23757a.a();
    }

    @Override // T0.o
    public final int c(T0.p pVar, T0.s sVar) {
        C1553n c1553n = this.f23758b;
        int read = ((T0.l) pVar).read(c1553n.f20176a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        c1553n.G(0);
        c1553n.F(read);
        boolean z2 = this.f23759c;
        C1998c c1998c = this.f23757a;
        if (!z2) {
            c1998c.f23772n = 0L;
            this.f23759c = true;
        }
        c1998c.c(c1553n);
        return 0;
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        this.f23757a.f(qVar, new C1994F(0, 1));
        qVar.q();
        qVar.D(new T0.t(-9223372036854775807L));
    }

    @Override // T0.o
    public final boolean h(T0.p pVar) {
        T0.l lVar;
        int h2;
        C1553n c1553n = new C1553n(10);
        int i3 = 0;
        while (true) {
            lVar = (T0.l) pVar;
            lVar.i(c1553n.f20176a, 0, 10, false);
            c1553n.G(0);
            if (c1553n.x() != 4801587) {
                break;
            }
            c1553n.H(3);
            int t3 = c1553n.t();
            i3 += t3 + 10;
            lVar.a(t3, false);
        }
        lVar.f7032f = 0;
        lVar.a(i3, false);
        int i10 = 0;
        int i11 = i3;
        while (true) {
            lVar.i(c1553n.f20176a, 0, 6, false);
            c1553n.G(0);
            if (c1553n.A() != 2935) {
                lVar.f7032f = 0;
                i11++;
                if (i11 - i3 >= 8192) {
                    break;
                }
                lVar.a(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = c1553n.f20176a;
                if (bArr.length < 6) {
                    h2 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    h2 = ((((bArr[2] & 7) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    h2 = AbstractC0311b.h((b2 & 192) >> 6, b2 & 63);
                }
                if (h2 == -1) {
                    break;
                }
                lVar.a(h2 - 6, false);
            }
        }
        return false;
    }

    @Override // T0.o
    public final void release() {
    }
}
