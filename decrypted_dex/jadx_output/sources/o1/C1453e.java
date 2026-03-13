package o1;

import T0.l;
import java.io.EOFException;
import r0.AbstractC1550k;
import r0.C1553n;
import s.C1590a;
import t0.C1715o;
import t0.InterfaceC1707g;
import t0.InterfaceC1708h;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1453e implements InterfaceC1707g {

    /* renamed from: a, reason: collision with root package name */
    public int f18325a;

    /* renamed from: b, reason: collision with root package name */
    public int f18326b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18327c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18328d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18329e;

    public C1453e(int i3) {
        switch (i3) {
            case 1:
                this.f18328d = new C1590a(3);
                this.f18325a = 8000;
                this.f18326b = 8000;
                break;
            default:
                this.f18328d = new f();
                this.f18329e = new C1553n(new byte[65025], 0);
                this.f18325a = -1;
                break;
        }
    }

    public int a(int i3) {
        int i10;
        int i11 = 0;
        this.f18326b = 0;
        do {
            int i12 = this.f18326b;
            int i13 = i3 + i12;
            f fVar = (f) this.f18328d;
            if (i13 >= fVar.f18332c) {
                break;
            }
            int[] iArr = fVar.f18335f;
            this.f18326b = i12 + 1;
            i10 = iArr[i12 + i3];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public boolean b(l lVar) {
        int i3;
        AbstractC1550k.g(lVar != null);
        boolean z2 = this.f18327c;
        C1553n c1553n = (C1553n) this.f18329e;
        if (z2) {
            this.f18327c = false;
            c1553n.D(0);
        }
        while (!this.f18327c) {
            int i10 = this.f18325a;
            f fVar = (f) this.f18328d;
            if (i10 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i11 = fVar.f18333d;
                    if ((fVar.f18330a & 1) == 1 && c1553n.f20178c == 0) {
                        i11 += a(0);
                        i3 = this.f18326b;
                    } else {
                        i3 = 0;
                    }
                    try {
                        lVar.u(i11);
                        this.f18325a = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a3 = a(this.f18325a);
            int i12 = this.f18325a + this.f18326b;
            if (a3 > 0) {
                c1553n.b(c1553n.f20178c + a3);
                lVar.e(c1553n.f20176a, c1553n.f20178c, a3, false);
                c1553n.F(c1553n.f20178c + a3);
                this.f18327c = fVar.f18335f[i12 + (-1)] != 255;
            }
            if (i12 == fVar.f18332c) {
                i12 = -1;
            }
            this.f18325a = i12;
        }
        return true;
    }

    @Override // t0.InterfaceC1707g
    public InterfaceC1708h g() {
        return new C1715o((String) this.f18329e, this.f18325a, this.f18326b, this.f18327c, (C1590a) this.f18328d);
    }
}
