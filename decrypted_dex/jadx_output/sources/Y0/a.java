package Y0;

import T0.AbstractC0311b;
import T0.C0318i;
import T0.InterfaceC0319j;
import T0.l;
import T0.s;
import T0.u;
import kotlin.UByte;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC0319j {

    /* renamed from: a, reason: collision with root package name */
    public final u f8708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8709b;

    /* renamed from: c, reason: collision with root package name */
    public final s f8710c = new s();

    public a(u uVar, int i3) {
        this.f8708a = uVar;
        this.f8709b = i3;
    }

    public final long a(l lVar) {
        long j;
        s sVar;
        u uVar;
        long j3;
        boolean d8;
        int g10;
        while (true) {
            long l9 = lVar.l();
            j = lVar.f7029c;
            long j10 = j - 6;
            sVar = this.f8710c;
            uVar = this.f8708a;
            if (l9 >= j10) {
                j3 = 6;
                break;
            }
            long l10 = lVar.l();
            byte[] bArr = new byte[2];
            lVar.i(bArr, 0, 2, false);
            int i3 = ((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            int i10 = this.f8709b;
            if (i3 != i10) {
                lVar.f7032f = 0;
                lVar.a((int) (l10 - lVar.f7030d), false);
                j3 = 6;
                d8 = false;
            } else {
                j3 = 6;
                C1553n c1553n = new C1553n(16);
                System.arraycopy(bArr, 0, c1553n.f20176a, 0, 2);
                byte[] bArr2 = c1553n.f20176a;
                int i11 = 0;
                for (int i12 = 2; i11 < 14 && (g10 = lVar.g(i12 + i11, 14 - i11, bArr2)) != -1; i12 = 2) {
                    i11 += g10;
                }
                c1553n.F(i11);
                lVar.f7032f = 0;
                lVar.a((int) (l10 - lVar.f7030d), false);
                d8 = AbstractC0311b.d(c1553n, uVar, i10, sVar);
            }
            if (d8) {
                break;
            }
            lVar.a(1, false);
        }
        if (lVar.l() < j - j3) {
            return sVar.f7043a;
        }
        lVar.a((int) (j - lVar.l()), false);
        return uVar.j;
    }

    @Override // T0.InterfaceC0319j
    public final C0318i b(l lVar, long j) {
        long j3 = lVar.f7030d;
        long a3 = a(lVar);
        long l9 = lVar.l();
        lVar.a(Math.max(6, this.f8708a.f7049c), false);
        long a9 = a(lVar);
        return (a3 > j || a9 <= j) ? a9 <= j ? new C0318i(a9, -2, lVar.l()) : new C0318i(a3, -1, j3) : new C0318i(-9223372036854775807L, 0, l9);
    }
}
