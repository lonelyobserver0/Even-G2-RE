package org.bouncycastle.math.raw;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Mont256 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f19306M = 4294967295L;

    public static int inverse32(int i3) {
        int i10 = (2 - (i3 * i3)) * i3;
        int i11 = (2 - (i3 * i10)) * i10;
        int i12 = (2 - (i3 * i11)) * i11;
        return (2 - (i3 * i12)) * i12;
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i3) {
        char c10 = 0;
        long j = 4294967295L;
        long j3 = iArr2[0] & 4294967295L;
        int i10 = 0;
        int i11 = 0;
        while (i10 < 8) {
            long j10 = iArr[i10] & j;
            long j11 = j10 * j3;
            long j12 = (j11 & j) + (iArr3[c10] & j);
            char c11 = c10;
            long j13 = j;
            long j14 = (((int) j12) * i3) & j13;
            long j15 = (iArr4[c11] & j13) * j14;
            char c12 = ' ';
            long j16 = ((j12 + (j15 & j13)) >>> 32) + (j11 >>> 32) + (j15 >>> 32);
            int i12 = 1;
            while (i12 < 8) {
                long j17 = (iArr2[i12] & j13) * j10;
                char c13 = c12;
                long j18 = (iArr4[i12] & j13) * j14;
                long j19 = (j17 & j13) + (j18 & j13) + (iArr3[i12] & j13) + j16;
                iArr3[i12 - 1] = (int) j19;
                j16 = (j19 >>> c13) + (j17 >>> c13) + (j18 >>> c13);
                i12++;
                c12 = c13;
                j3 = j3;
                j14 = j14;
            }
            char c14 = c12;
            long j20 = j16 + (i11 & j13);
            iArr3[7] = (int) j20;
            i11 = (int) (j20 >>> c14);
            i10++;
            c10 = c11;
            j = j13;
            j3 = j3;
        }
        if (i11 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c10 = 0;
        long j = 4294967295L;
        long j3 = iArr2[0] & 4294967295L;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i3 >= 8) {
                break;
            }
            long j10 = iArr[i3] & j;
            long j11 = (j10 * j3) + (iArr3[c10] & j);
            long j12 = j11 & j;
            long j13 = (j11 >>> 32) + j12;
            int i11 = 1;
            for (int i12 = 8; i11 < i12; i12 = 8) {
                long j14 = j;
                long j15 = (iArr2[i11] & j14) * j10;
                int i13 = i11;
                long j16 = (iArr4[i11] & j14) * j12;
                long j17 = (j15 & j14) + (j16 & j14) + (iArr3[i13] & j14) + j13;
                iArr3[i13 - 1] = (int) j17;
                j13 = (j17 >>> 32) + (j15 >>> 32) + (j16 >>> 32);
                i11 = i13 + 1;
                j = j14;
                j3 = j3;
            }
            long j18 = j13 + (i10 & j);
            iArr3[7] = (int) j18;
            i10 = (int) (j18 >>> 32);
            i3++;
            j3 = j3;
            c10 = 0;
        }
        if (i10 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i3) {
        char c10 = 0;
        int i10 = 0;
        while (i10 < 8) {
            long j = (r5 * i3) & 4294967295L;
            long j3 = (((iArr2[c10] & 4294967295L) * j) + (iArr[c10] & 4294967295L)) >>> 32;
            int i11 = 1;
            while (i11 < 8) {
                long j10 = ((iArr2[i11] & 4294967295L) * j) + (iArr[i11] & 4294967295L) + j3;
                iArr[i11 - 1] = (int) j10;
                j3 = j10 >>> 32;
                i11++;
                i10 = i10;
            }
            iArr[7] = (int) j3;
            i10++;
            c10 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 8; i3++) {
            long j = iArr[0] & 4294967295L;
            long j3 = j;
            for (int i10 = 1; i10 < 8; i10++) {
                long j10 = ((iArr2[i10] & 4294967295L) * j) + (iArr[i10] & 4294967295L) + j3;
                iArr[i10 - 1] = (int) j10;
                j3 = j10 >>> 32;
            }
            iArr[7] = (int) j3;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
