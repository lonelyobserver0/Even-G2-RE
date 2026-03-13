package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.ExtendedDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NonMemoableDigest implements ExtendedDigest {
    private ExtendedDigest baseDigest;

    public NonMemoableDigest(ExtendedDigest extendedDigest) {
        if (extendedDigest == null) {
            throw new IllegalArgumentException(StubApp.getString2(28498));
        }
        this.baseDigest = extendedDigest;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        return this.baseDigest.doFinal(bArr, i3);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.baseDigest.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.baseDigest.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.baseDigest.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.baseDigest.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        this.baseDigest.update(b2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        this.baseDigest.update(bArr, i3, i10);
    }
}
