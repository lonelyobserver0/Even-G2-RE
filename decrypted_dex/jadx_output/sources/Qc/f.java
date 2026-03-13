package Qc;

import f5.u0;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f extends c {

    /* renamed from: g, reason: collision with root package name */
    public static final b f5915g = new b(1);

    /* renamed from: f, reason: collision with root package name */
    public c f5916f;

    @Override // Qc.g
    public final int a(int i3, int i10) {
        int i11 = i3 - 1;
        return (((i10 + 5) + i11) + (i11 >> 2)) % 7;
    }

    @Override // Qc.c, Qc.g
    public final int b(int i3) {
        return ((i3 + 5) + ((i3 - 1) >> 2)) % 7;
    }

    @Override // Qc.c, Qc.g
    public final long c(long j, TimeZone timeZone) {
        if (timeZone != null) {
            j += timeZone.getOffset(j);
        }
        int i3 = (int) (j % 86400000);
        long j3 = j - i3;
        if (i3 < 0) {
            i3 += 86400000;
            j3 -= 86400000;
        }
        int i10 = (int) ((j3 / 86400000) + 719164);
        int i11 = i10 / 1461;
        int i12 = i10 - (i11 * 1461);
        int min = Math.min(i12 / 365, 3);
        int i13 = (i12 - (min * 365)) + 1;
        int i14 = (i11 << 2) + min + 1;
        int f10 = f(i14, i13);
        int i15 = i3 / 60000;
        return u0.r(i14, f10 >> 8, f10 & 255, i15 / 60, i15 % 60, (i3 / 1000) % 60);
    }

    @Override // Qc.c, Qc.g
    public final long d(TimeZone timeZone, int i3, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16 = i3;
        int i17 = i10;
        if (i17 > 1) {
            int i18 = i16 / 100;
            i15 = ((i18 - (i18 >> 2)) - 2) + i11;
        } else {
            int i19 = (i16 - 1) / 100;
            i15 = ((i19 - (i19 >> 2)) - 2) + i11;
            if (i17 == 1 && i15 > 28 && i16 % 100 == 0 && i16 % 400 != 0) {
                i15++;
            }
        }
        c cVar = this.f5916f;
        if (cVar == null) {
            cVar = new c(this.f5918b, this.f5917a);
            this.f5916f = cVar;
        }
        c cVar2 = cVar;
        int e10 = e(i16, i17);
        if (i15 > e10) {
            i15 -= e10;
            i17++;
            if (i17 > 11) {
                i16++;
                i17 = 0;
            }
        } else if (i15 < 1) {
            i17--;
            if (i17 < 0) {
                i16--;
                i17 = 11;
            }
            i15 += cVar2.e(i16, i17);
        }
        return cVar2.d(timeZone, i16, i17, i15, i12, i13, i14);
    }

    @Override // Qc.c
    public final long g(int i3, int i10, int i11, int i12, int i13) {
        return ((((((((((((i3 - 1970) * 365) + i10) - 1) + j(i3) + 13) * 24) + i11) * 60) + i12) * 60) + i13) * 1000) + 0;
    }

    @Override // Qc.c
    public final boolean i(int i3) {
        return (i3 & 3) == 0;
    }

    @Override // Qc.c
    public final int j(int i3) {
        return ((i3 - 1) >> 2) - 492;
    }
}
