package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA384Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 48;

    public SHA384Digest() {
        this(CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA384Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        finish();
        Pack.longToBigEndian(this.f18803H1, bArr, i3);
        Pack.longToBigEndian(this.H2, bArr, i3 + 8);
        Pack.longToBigEndian(this.f18804H3, bArr, i3 + 16);
        Pack.longToBigEndian(this.f18805H4, bArr, i3 + 24);
        Pack.longToBigEndian(this.f18806H5, bArr, i3 + 32);
        Pack.longToBigEndian(this.f18807H6, bArr, i3 + 40);
        reset();
        return 48;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(23704);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 48;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int encodedStateSize = getEncodedStateSize();
        byte[] bArr = new byte[encodedStateSize + 1];
        super.populateState(bArr);
        bArr[encodedStateSize] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f18803H1 = -3766243637369397544L;
        this.H2 = 7105036623409894663L;
        this.f18804H3 = -7973340178411365097L;
        this.f18805H4 = 1526699215303891257L;
        this.f18806H5 = 7436329637833083697L;
        this.f18807H6 = -8163818279084223215L;
        this.f18808H7 = -2662702644619276377L;
        this.f18809H8 = 5167115440072839076L;
    }

    public SHA384Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        super.copyIn((SHA384Digest) memoable);
    }

    public SHA384Digest(SHA384Digest sHA384Digest) {
        super(sHA384Digest);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public SHA384Digest(byte[] bArr) {
        super(CryptoServicePurpose.values()[bArr[bArr.length - 1]]);
        restoreState(bArr);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
