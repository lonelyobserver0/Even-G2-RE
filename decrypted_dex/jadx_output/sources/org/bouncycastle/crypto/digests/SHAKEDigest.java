package org.bouncycastle.crypto.digests;

import Xa.h;
import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Xof;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest() {
        this(128);
    }

    private static int checkBitLength(int i3) {
        if (i3 == 128 || i3 == 256) {
            return i3;
        }
        throw new IllegalArgumentException(h.g(i3, StubApp.getString2(28511), StubApp.getString2(28512)));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        return doFinal(bArr, i3, getDigestSize());
    }

    public int doOutput(byte[] bArr, int i3, int i10) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i3, i10 * 8);
        return i10;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28513) + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    public SHAKEDigest(int i3) {
        super(checkBitLength(i3), CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i3, byte b2, int i10) {
        return doFinal(bArr, i3, getDigestSize(), b2, i10);
    }

    public SHAKEDigest(int i3, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i3), cryptoServicePurpose);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i3, int i10) {
        int doOutput = doOutput(bArr, i3, i10);
        reset();
        return doOutput;
    }

    public SHAKEDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(128, cryptoServicePurpose);
    }

    public int doFinal(byte[] bArr, int i3, int i10, byte b2, int i11) {
        if (i11 < 0 || i11 > 7) {
            throw new IllegalArgumentException(StubApp.getString2(28504));
        }
        int i12 = (b2 & ((1 << i11) - 1)) | (15 << i11);
        int i13 = i11 + 4;
        if (i13 >= 8) {
            absorb((byte) i12);
            i13 = i11 - 4;
            i12 >>>= 8;
        }
        if (i13 > 0) {
            absorbBits(i12, i13);
        }
        squeeze(bArr, i3, i10 * 8);
        reset();
        return i10;
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }
}
