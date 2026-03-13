package org.bouncycastle.crypto.modes.gcm;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* renamed from: x, reason: collision with root package name */
    private long[] f19041x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j, byte[] bArr) {
        long[] oneAsLongs = GCMUtil.oneAsLongs();
        if (j > 0) {
            long[] jArr = new long[2];
            GCMUtil.copy(this.f19041x, jArr);
            do {
                if ((1 & j) != 0) {
                    GCMUtil.multiply(oneAsLongs, jArr);
                }
                GCMUtil.square(jArr, jArr);
                j >>>= 1;
            } while (j > 0);
        }
        GCMUtil.asBytes(oneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f19041x = GCMUtil.asLongs(bArr);
    }
}
