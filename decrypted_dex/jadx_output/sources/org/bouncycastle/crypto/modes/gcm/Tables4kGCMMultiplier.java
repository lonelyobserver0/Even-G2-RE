package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import kotlin.UByte;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Tables4kGCMMultiplier implements GCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f19044H;

    /* renamed from: T, reason: collision with root package name */
    private long[][] f19045T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f19045T == null) {
            this.f19045T = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (GCMUtil.areEqual(this.f19044H, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f19044H = bArr2;
        GCMUtil.copy(bArr, bArr2);
        GCMUtil.asLongs(this.f19044H, this.f19045T[1]);
        long[] jArr = this.f19045T[1];
        GCMUtil.multiplyP7(jArr, jArr);
        for (int i3 = 2; i3 < 256; i3 += 2) {
            long[][] jArr2 = this.f19045T;
            GCMUtil.divideP(jArr2[i3 >> 1], jArr2[i3]);
            long[][] jArr3 = this.f19045T;
            GCMUtil.xor(jArr3[i3], jArr3[1], jArr3[i3 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.f19045T[bArr[15] & UByte.MAX_VALUE];
        long j = jArr[0];
        long j3 = jArr[1];
        for (int i3 = 14; i3 >= 0; i3--) {
            long[] jArr2 = this.f19045T[bArr[i3] & UByte.MAX_VALUE];
            long j10 = j3 << 56;
            j3 = ((j3 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j10) ^ (j10 >>> 1)) ^ (j10 >>> 2)) ^ (j10 >>> 7);
        }
        Pack.longToBigEndian(j, bArr, 0);
        Pack.longToBigEndian(j3, bArr, 8);
    }
}
