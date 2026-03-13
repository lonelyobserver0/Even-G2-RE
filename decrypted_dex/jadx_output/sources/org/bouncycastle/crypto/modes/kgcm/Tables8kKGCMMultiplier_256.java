package org.bouncycastle.crypto.modes.kgcm;

import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Tables8kKGCMMultiplier_256 implements KGCMMultiplier {

    /* renamed from: T, reason: collision with root package name */
    private long[][] f19055T;

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        long[][] jArr2 = this.f19055T;
        if (jArr2 == null) {
            this.f19055T = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 4);
        } else if (KGCMUtil_256.equal(jArr, jArr2[1])) {
            return;
        }
        KGCMUtil_256.copy(jArr, this.f19055T[1]);
        for (int i3 = 2; i3 < 256; i3 += 2) {
            long[][] jArr3 = this.f19055T;
            KGCMUtil_256.multiplyX(jArr3[i3 >> 1], jArr3[i3]);
            long[][] jArr4 = this.f19055T;
            KGCMUtil_256.add(jArr4[i3], jArr4[1], jArr4[i3 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        long[] jArr2 = new long[4];
        KGCMUtil_256.copy(this.f19055T[((int) (jArr[3] >>> 56)) & 255], jArr2);
        for (int i3 = 30; i3 >= 0; i3--) {
            KGCMUtil_256.multiplyX8(jArr2, jArr2);
            KGCMUtil_256.add(this.f19055T[((int) (jArr[i3 >>> 3] >>> ((i3 & 7) << 3))) & 255], jArr2, jArr2);
        }
        KGCMUtil_256.copy(jArr2, jArr);
    }
}
