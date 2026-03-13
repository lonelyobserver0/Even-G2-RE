package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3411_2012_512Digest extends GOST3411_2012Digest {
    private static final byte[] IV = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public GOST3411_2012_512Digest() {
        super(IV, CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411_2012_512Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28195);
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public GOST3411_2012_512Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(IV, cryptoServicePurpose);
    }

    public GOST3411_2012_512Digest(GOST3411_2012_512Digest gOST3411_2012_512Digest) {
        super(IV, gOST3411_2012_512Digest.purpose);
        reset(gOST3411_2012_512Digest);
    }
}
