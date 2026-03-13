package org.bouncycastle.crypto.modes.gcm;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicGCMMultiplier implements GCMMultiplier {

    /* renamed from: H, reason: collision with root package name */
    private long[] f19042H;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.f19042H = GCMUtil.asLongs(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        GCMUtil.multiply(bArr, this.f19042H);
    }
}
