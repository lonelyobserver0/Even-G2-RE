package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class BENES {
    protected final int GFBITS;
    protected final int SYS_N;
    protected final int SYS_T;

    public BENES(int i3, int i10, int i11) {
        this.SYS_N = i3;
        this.SYS_T = i10;
        this.GFBITS = i11;
    }

    public static void transpose_64x64(long[] jArr, long[] jArr2) {
        long[][] jArr3 = {new long[]{6148914691236517205L, -6148914691236517206L}, new long[]{3689348814741910323L, -3689348814741910324L}, new long[]{1085102592571150095L, -1085102592571150096L}, new long[]{71777214294589695L, -71777214294589696L}, new long[]{281470681808895L, -281470681808896L}, new long[]{BodyPartID.bodyIdMax, -4294967296L}};
        for (int i3 = 0; i3 < 64; i3++) {
            jArr[i3] = jArr2[i3];
        }
        for (int i10 = 5; i10 >= 0; i10--) {
            int i11 = 1 << i10;
            for (int i12 = 0; i12 < 64; i12 += i11 * 2) {
                for (int i13 = i12; i13 < i12 + i11; i13++) {
                    long j = jArr[i13];
                    long[] jArr4 = jArr3[i10];
                    long j3 = jArr4[0];
                    int i14 = i13 + i11;
                    long j10 = jArr[i14];
                    long j11 = jArr4[1];
                    jArr[i13] = ((j10 & j3) << i11) | (j & j3);
                    jArr[i14] = ((j & j11) >>> i11) | (j10 & j11);
                }
            }
        }
    }

    public abstract void support_gen(short[] sArr, byte[] bArr);

    public static void transpose_64x64(long[] jArr, long[] jArr2, int i3) {
        long[][] jArr3 = {new long[]{6148914691236517205L, -6148914691236517206L}, new long[]{3689348814741910323L, -3689348814741910324L}, new long[]{1085102592571150095L, -1085102592571150096L}, new long[]{71777214294589695L, -71777214294589696L}, new long[]{281470681808895L, -281470681808896L}, new long[]{BodyPartID.bodyIdMax, -4294967296L}};
        for (int i10 = 0; i10 < 64; i10++) {
            int i11 = i10 + i3;
            jArr[i11] = jArr2[i11];
        }
        for (int i12 = 5; i12 >= 0; i12--) {
            int i13 = 1 << i12;
            for (int i14 = 0; i14 < 64; i14 += i13 * 2) {
                for (int i15 = i14; i15 < i14 + i13; i15++) {
                    long j = jArr[i15 + i3];
                    long[] jArr4 = jArr3[i12];
                    long j3 = jArr4[0];
                    int i16 = i15 + i13 + i3;
                    long j10 = jArr[i16];
                    long j11 = jArr4[1];
                    jArr[i15 + i3] = ((j10 & j3) << i13) | (j & j3);
                    jArr[i16] = ((j & j11) >>> i13) | (j10 & j11);
                }
            }
        }
    }
}
