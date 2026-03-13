package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import kotlin.UByte;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Tables8kGCMMultiplier implements GCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f19048H;

    /* renamed from: T, reason: collision with root package name */
    private long[][][] f19049T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f19049T == null) {
            this.f19049T = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, 2, 256, 2);
        } else if (GCMUtil.areEqual(this.f19048H, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f19048H = bArr2;
        GCMUtil.copy(bArr, bArr2);
        for (int i3 = 0; i3 < 2; i3++) {
            long[][][] jArr = this.f19049T;
            long[][] jArr2 = jArr[i3];
            if (i3 == 0) {
                GCMUtil.asLongs(this.f19048H, jArr2[1]);
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
        long[][][] jArr = this.f19049T;
        long[][] jArr2 = jArr[0];
        long[][] jArr3 = jArr[1];
        long[] jArr4 = jArr2[bArr[14] & UByte.MAX_VALUE];
        long[] jArr5 = jArr3[bArr[15] & UByte.MAX_VALUE];
        long j = jArr4[0] ^ jArr5[0];
        long j3 = jArr5[1] ^ jArr4[1];
        for (int i3 = 12; i3 >= 0; i3 -= 2) {
            long[] jArr6 = jArr2[bArr[i3] & UByte.MAX_VALUE];
            long[] jArr7 = jArr3[bArr[i3 + 1] & UByte.MAX_VALUE];
            long j10 = j3 << 48;
            j3 = (jArr6[1] ^ jArr7[1]) ^ ((j3 >>> 16) | (j << 48));
            j = (((((j >>> 16) ^ (jArr6[0] ^ jArr7[0])) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2)) ^ (j10 >>> 7);
        }
        Pack.longToBigEndian(j, bArr, 0);
        Pack.longToBigEndian(j3, bArr, 8);
    }
}
