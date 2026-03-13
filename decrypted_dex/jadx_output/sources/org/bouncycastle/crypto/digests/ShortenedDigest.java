package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.ExtendedDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ShortenedDigest implements ExtendedDigest {
    private ExtendedDigest baseDigest;
    private int length;

    public ShortenedDigest(ExtendedDigest extendedDigest, int i3) {
        if (extendedDigest == null) {
            throw new IllegalArgumentException(StubApp.getString2(28498));
        }
        if (i3 > extendedDigest.getDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(28514));
        }
        this.baseDigest = extendedDigest;
        this.length = i3;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[this.baseDigest.getDigestSize()];
        this.baseDigest.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, i3, this.length);
        return this.length;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.baseDigest.getAlgorithmName() + StubApp.getString2(2830) + (this.length * 8) + StubApp.getString2(74);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.baseDigest.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.length;
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
