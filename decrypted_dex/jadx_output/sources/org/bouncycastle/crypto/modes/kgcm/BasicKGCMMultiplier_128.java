package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicKGCMMultiplier_128 implements KGCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private final long[] f19050H = new long[2];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_128.copy(jArr, this.f19050H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_128.multiply(jArr, this.f19050H, jArr);
    }
}
