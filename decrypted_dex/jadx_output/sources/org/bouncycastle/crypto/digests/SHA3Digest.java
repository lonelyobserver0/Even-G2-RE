package org.bouncycastle.crypto.digests;

import Xa.h;
import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest() {
        this(256, CryptoServicePurpose.ANY);
    }

    private static int checkBitLength(int i3) {
        if (i3 == 224 || i3 == 256 || i3 == 384 || i3 == 512) {
            return i3;
        }
        throw new IllegalArgumentException(h.g(i3, StubApp.getString2(28502), StubApp.getString2(28503)));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i3);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28505) + this.fixedOutputLength;
    }

    public SHA3Digest(int i3) {
        super(checkBitLength(i3), CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i3, byte b2, int i10) {
        if (i10 < 0 || i10 > 7) {
            throw new IllegalArgumentException(StubApp.getString2(28504));
        }
        int i11 = (b2 & ((1 << i10) - 1)) | (2 << i10);
        int i12 = i10 + 2;
        if (i12 >= 8) {
            absorb((byte) i11);
            i12 = i10 - 6;
            i11 >>>= 8;
        }
        return super.doFinal(bArr, i3, (byte) i11, i12);
    }

    public SHA3Digest(int i3, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i3), cryptoServicePurpose);
    }

    public SHA3Digest(CryptoServicePurpose cryptoServicePurpose) {
        this(256, cryptoServicePurpose);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }
}
