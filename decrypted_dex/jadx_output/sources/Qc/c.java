package Qc;

import f5.u0;
import i2.u;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class c extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5905c = new b(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5906d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5907e = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    static {
        Pc.b.values();
    }

    @Override // Qc.g
    public int b(int i3) {
        int i10 = i3 - 1;
        return (((i10 % 400) * 6) + (((i10 % 100) * 4) + (((i10 & 3) * 5) + 1))) % 7;
    }

    @Override // Qc.g
    public long c(long j, TimeZone timeZone) {
        if (timeZone != null) {
            j += timeZone.getOffset(j);
        }
        int i3 = (int) (j % 86400000);
        long j3 = j - i3;
        if (i3 < 0) {
            i3 += 86400000;
            j3 -= 86400000;
        }
        int i10 = (int) ((j3 / 86400000) + 719162);
        int i11 = i10 / 146097;
        int i12 = i10 % 146097;
        int min = Math.min(i12 / 36524, 3);
        int i13 = i12 - (36524 * min);
        int min2 = Math.min(i13 / 1461, 24);
        int i14 = i13 - (min2 * 1461);
        int min3 = Math.min(i14 / 365, 3);
        int C10 = u.C(((i11 << 2) + min) * 100, min2 << 2, min3, 1);
        int f10 = f(C10, (i14 - (min3 * 365)) + 1);
        int i15 = i3 / 60000;
        return u0.r(C10, f10 >> 8, f10 & 255, i15 / 60, i15 % 60, (i3 / 1000) % 60);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    @Override // Qc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d(java.util.TimeZone r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r4 = r20
            int r2 = r22 * 60
            int r2 = r2 + r23
            int r2 = r2 * 60
            int r2 = r2 + r24
            int r7 = r2 * 1000
            int r2 = r0.h(r1, r4)
            int r2 = r2 + r21
            int r8 = r0.a(r1, r2)
            r9 = 0
            if (r18 != 0) goto L20
            r6 = r4
            r10 = r9
            goto L34
        L20:
            int r6 = r8 + 1
            r2 = 1
            r5 = r21
            r3 = r1
            r1 = r18
            int r2 = r1.getOffset(r2, r3, r4, r5, r6, r7)
            r1 = r3
            r6 = r4
            int r3 = r18.getRawOffset()
            int r2 = r2 - r3
            r10 = r2
        L34:
            int r2 = r0.h(r1, r6)
            int r2 = r2 + r21
            r3 = r22
            r4 = r23
            r5 = r24
            long r2 = r0.g(r1, r2, r3, r4, r5)
            int r7 = r7 - r10
            r4 = 1
            r5 = 86400000(0x5265c00, float:7.82218E-36)
            if (r7 >= 0) goto L6a
            int r7 = r7 + r5
            int r5 = r21 + (-1)
            if (r5 != 0) goto L66
            int r5 = r6 + (-1)
            if (r5 >= 0) goto L58
            int r1 = r1 + (-1)
            r5 = 11
        L58:
            int r6 = r0.e(r1, r5)
            int r8 = r8 + 6
            int r8 = r8 % 7
            r12 = r1
            r13 = r5
            r14 = r6
        L63:
            r16 = r7
            goto L8a
        L66:
            r12 = r1
            r14 = r5
        L68:
            r13 = r6
            goto L63
        L6a:
            if (r7 < r5) goto L86
            int r7 = r7 - r5
            int r5 = r21 + 1
            int r10 = r0.e(r1, r6)
            if (r5 <= r10) goto L66
            int r5 = r6 + 1
            r6 = 12
            if (r5 < r6) goto L7e
            int r1 = r1 + 1
            r5 = r9
        L7e:
            int r8 = r8 + 1
            int r8 = r8 % 7
            r12 = r1
            r14 = r4
            r13 = r5
            goto L63
        L86:
            r14 = r21
            r12 = r1
            goto L68
        L8a:
            if (r18 != 0) goto L8d
            goto L96
        L8d:
            r11 = 1
            int r15 = r8 + 1
            r10 = r18
            int r9 = r10.getOffset(r11, r12, r13, r14, r15, r16)
        L96:
            long r4 = (long) r9
            long r2 = r2 - r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Qc.c.d(java.util.TimeZone, int, int, int, int, int, int):long");
    }

    public final int e(int i3, int i10) {
        int[] iArr = f5906d;
        return (i10 == 1 && i(i3)) ? iArr[i10] + 1 : iArr[i10];
    }

    public final int f(int i3, int i10) {
        while (true) {
            int i11 = 365;
            if (i10 >= 1) {
                break;
            }
            i3--;
            if (i(i3)) {
                i11 = 366;
            }
            i10 += i11;
        }
        while (true) {
            int i12 = i(i3) ? 366 : 365;
            if (i10 <= i12) {
                break;
            }
            i3++;
            i10 -= i12;
        }
        int i13 = i10 >> 5;
        int i14 = i13 + 1;
        if (i14 < 12 && h(i3, i14) < i10) {
            i14 = i13 + 2;
        }
        int i15 = i14 - 1;
        return (i15 << 8) + (i10 - h(i3, i15));
    }

    public long g(int i3, int i10, int i11, int i12, int i13) {
        return ((((((((((((i3 - 1970) * 365) + i10) - 1) + j(i3)) * 24) + i11) * 60) + i12) * 60) + i13) * 1000) + 0;
    }

    public final int h(int i3, int i10) {
        int[] iArr = f5907e;
        return (i10 <= 1 || !i(i3)) ? iArr[i10] : iArr[i10] + 1;
    }

    public boolean i(int i3) {
        return ((i3 & 3) == 0 && i3 % 100 != 0) || i3 % 400 == 0;
    }

    public int j(int i3) {
        int i10 = i3 - 1;
        return ((r3 >> 2) - 4) + (((i10 >> 2) - 492) - ((i10 / 100) - 19));
    }
}
