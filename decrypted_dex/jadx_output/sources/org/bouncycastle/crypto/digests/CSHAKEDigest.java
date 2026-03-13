package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CSHAKEDigest extends SHAKEDigest {
    private static final byte[] padding = new byte[100];
    private final byte[] diff;

    public CSHAKEDigest(int i3, CryptoServicePurpose cryptoServicePurpose, byte[] bArr, byte[] bArr2) {
        super(i3, cryptoServicePurpose);
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            this.diff = null;
        } else {
            this.diff = Arrays.concatenate(XofUtils.leftEncode(this.rate / 8), encodeString(bArr), encodeString(bArr2));
            diffPadAndAbsorb();
        }
    }

    private void diffPadAndAbsorb() {
        int i3 = this.rate / 8;
        byte[] bArr = this.diff;
        absorb(bArr, 0, bArr.length);
        int length = this.diff.length % i3;
        if (length == 0) {
            return;
        }
        while (true) {
            i3 -= length;
            byte[] bArr2 = padding;
            if (i3 <= bArr2.length) {
                absorb(bArr2, 0, i3);
                return;
            } else {
                absorb(bArr2, 0, bArr2.length);
                length = bArr2.length;
            }
        }
    }

    private byte[] encodeString(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? XofUtils.leftEncode(0L) : Arrays.concatenate(XofUtils.leftEncode(bArr.length * 8), bArr);
    }

    @Override // org.bouncycastle.crypto.digests.SHAKEDigest, org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i3, int i10) {
        if (this.diff == null) {
            return super.doOutput(bArr, i3, i10);
        }
        if (!this.squeezing) {
            absorbBits(0, 2);
        }
        squeeze(bArr, i3, i10 * 8);
        return i10;
    }

    @Override // org.bouncycastle.crypto.digests.SHAKEDigest, org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28476) + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        if (this.diff != null) {
            diffPadAndAbsorb();
        }
    }

    public CSHAKEDigest(int i3, byte[] bArr, byte[] bArr2) {
        this(i3, CryptoServicePurpose.ANY, bArr, bArr2);
    }

    public CSHAKEDigest(CSHAKEDigest cSHAKEDigest) {
        super(cSHAKEDigest);
        this.diff = Arrays.clone(cSHAKEDigest.diff);
    }
}
