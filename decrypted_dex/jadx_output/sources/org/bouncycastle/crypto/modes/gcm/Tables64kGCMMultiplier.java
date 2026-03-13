package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import kotlin.UByte;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Tables64kGCMMultiplier implements GCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f19046H;

    /* renamed from: T, reason: collision with root package name */
    private long[][][] f19047T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f19047T == null) {
            this.f19047T = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, 16, 256, 2);
        } else if (GCMUtil.areEqual(this.f19046H, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f19046H = bArr2;
        GCMUtil.copy(bArr, bArr2);
        for (int i3 = 0; i3 < 16; i3++) {
            long[][][] jArr = this.f19047T;
            long[][] jArr2 = jArr[i3];
            if (i3 == 0) {
                GCMUtil.asLongs(this.f19046H, jArr2[1]);
                long[] jArr3 = jArr2[1];
                GCMUtil.multiplyP7(jArr3, jArr3);
            } else {
                GCMUtil.multiplyP8(jArr[i3 - 1][1], jArr2[1]);
            }
            for (int i10 = 2; i10 < 256; i10 += 2) {
                GCMUtil.divideP(jArr2[i10 >> 1], jArr2[i10]);
                GCMUtil.xor(jArr2[i10], jArr2[1], jArr2[i10 + 1]);
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[][][] jArr = this.f19047T;
        long[] jArr2 = jArr[0][bArr[0] & UByte.MAX_VALUE];
        long[] jArr3 = jArr[1][bArr[1] & UByte.MAX_VALUE];
        long[] jArr4 = jArr[2][bArr[2] & UByte.MAX_VALUE];
        long[] jArr5 = jArr[3][bArr[3] & UByte.MAX_VALUE];
        long[] jArr6 = jArr[4][bArr[4] & UByte.MAX_VALUE];
        long[] jArr7 = jArr[5][bArr[5] & UByte.MAX_VALUE];
        long[] jArr8 = jArr[6][bArr[6] & UByte.MAX_VALUE];
        long[] jArr9 = jArr[7][bArr[7] & UByte.MAX_VALUE];
        long[] jArr10 = jArr[8][bArr[8] & UByte.MAX_VALUE];
        long[] jArr11 = jArr[9][bArr[9] & UByte.MAX_VALUE];
        long[] jArr12 = jArr[10][bArr[10] & UByte.MAX_VALUE];
        long[] jArr13 = jArr[11][bArr[11] & UByte.MAX_VALUE];
        long[] jArr14 = jArr[12][bArr[12] & UByte.MAX_VALUE];
        long[] jArr15 = jArr[13][bArr[13] & UByte.MAX_VALUE];
        long[] jArr16 = jArr[14][bArr[14] & UByte.MAX_VALUE];
        long[] jArr17 = jArr[15][bArr[15] & UByte.MAX_VALUE];
        long j = ((((((((((((((jArr2[0] ^ jArr3[0]) ^ jArr4[0]) ^ jArr5[0]) ^ jArr6[0]) ^ jArr7[0]) ^ jArr8[0]) ^ jArr9[0]) ^ jArr10[0]) ^ jArr11[0]) ^ jArr12[0]) ^ jArr13[0]) ^ jArr14[0]) ^ jArr15[0]) ^ jArr16[0]) ^ jArr17[0];
        long j3 = (((((jArr12[1] ^ (((((((((jArr2[1] ^ jArr3[1]) ^ jArr4[1]) ^ jArr5[1]) ^ jArr6[1]) ^ jArr7[1]) ^ jArr8[1]) ^ jArr9[1]) ^ jArr10[1]) ^ jArr11[1])) ^ jArr13[1]) ^ jArr14[1]) ^ jArr15[1]) ^ jArr16[1]) ^ jArr17[1];
        Pack.longToBigEndian(j, bArr, 0);
        Pack.longToBigEndian(j3, bArr, 8);
    }
}
