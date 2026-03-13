package Qc;

import f5.u0;
import java.util.TimeZone;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5910e = {623158436, 623191204, 690562340, 1227434276};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[][] f5911f = {new byte[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11}, new byte[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11}, new byte[]{0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 11, 11}, new byte[]{0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11}};

    /* renamed from: g, reason: collision with root package name */
    public static final g f5912g;

    /* renamed from: c, reason: collision with root package name */
    public final int f5913c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5914d;

    static {
        Pc.b.values();
        f5912g = c.f5905c.a(Pc.b.f5656a);
    }

    public e(Pc.b bVar, boolean z2) {
        super(4, bVar);
        this.f5913c = AbstractC1856e.c(2);
        this.f5914d = z2;
    }

    @Override // Qc.g
    public final int b(int i3) {
        int i10 = i3 - 1;
        int i11 = i10 % 30;
        return (((i11 * 4) + (((i10 / 30) * 5) + 5)) + f5911f[this.f5913c][i11]) % 7;
    }

    @Override // Qc.g
    public final long c(long j, TimeZone timeZone) {
        if (timeZone != null) {
            j += timeZone.getOffset(j);
        }
        long j3 = j + (this.f5914d ? 42521587200000L : 42521673600000L);
        int i3 = (int) (j3 % 86400000);
        long j10 = j3 / 86400000;
        if (i3 < 0) {
            i3 += 86400000;
            j10--;
        }
        int i10 = (int) (j10 / 10631);
        long j11 = j10 % 10631;
        int i11 = (int) (j11 / 355);
        byte[][] bArr = f5911f;
        int i12 = this.f5913c;
        int i13 = ((int) (j11 - ((i11 * 354) + bArr[i12][i11]))) + 1;
        int i14 = i11 + 1;
        int[] iArr = f5910e;
        if (i13 > 355 || (i13 == 355 && (iArr[i12] & (1 << ((i11 % 30) + 1))) == 0)) {
            i13 -= (iArr[i12] & (1 << ((i11 % 30) + 1))) != 0 ? 355 : 354;
            i14 = i11 + 2;
        }
        int i15 = i3 / 60000;
        int i16 = i14;
        while (i13 < 1) {
            int i17 = i16 - 1;
            i13 += ((1 << (((i16 + (-2)) % 30) + 1)) & iArr[i12]) != 0 ? 355 : 354;
            i16 = i17;
        }
        while (true) {
            int i18 = (iArr[i12] & (1 << (((i16 + (-1)) % 30) + 1))) != 0 ? 355 : 354;
            if (i13 <= i18) {
                break;
            }
            i16++;
            i13 -= i18;
        }
        int i19 = i13 == 355 ? 11 : ((i13 - 1) * 2) / 59;
        int i20 = (i19 << 8) + (i13 - ((i19 * 29) + ((i19 + 1) >>> 1)));
        return u0.r((i10 * 30) + i14, i20 >> 8, i20 & 255, i15 / 60, i15 % 60, (i3 / 1000) % 60);
    }

    @Override // Qc.g
    public final long d(TimeZone timeZone, int i3, int i10, int i11, int i12, int i13, int i14) {
        long r8 = u0.r(i3, i10, i11, 0, 0, 0);
        int i15 = (int) ((r8 & 68451041280L) >>> 28);
        int i16 = (((int) ((r8 & 18014329790005248L) >>> 36)) - 1) % 30;
        long i17 = ((((((r5 / 30) * 10631) + ((i16 * 354) + f5911f[this.f5913c][i16])) + (((i15 * 29) + ((i15 + 1) >>> 1)) + u0.i(r8))) - 1) * 86400000) - (this.f5914d ? 42521587200000L : 42521673600000L);
        g gVar = f5912g;
        long c10 = gVar.c(i17, null);
        return gVar.d(timeZone, (int) ((18014329790005248L & c10) >>> 36), (int) ((c10 & 68451041280L) >>> 28), u0.i(c10), i12, i13, i14);
    }
}
