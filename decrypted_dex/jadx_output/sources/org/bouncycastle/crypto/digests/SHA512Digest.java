package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SHA512Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 64;

    public SHA512Digest() {
        this(CryptoServicePurpose.ANY);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA512Digest(this);
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
        Pack.longToBigEndian(this.f18808H7, bArr, i3 + 48);
        Pack.longToBigEndian(this.f18809H8, bArr, i3 + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(23705);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
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
        this.f18803H1 = 7640891576956012808L;
        this.H2 = -4942790177534073029L;
        this.f18804H3 = 4354685564936845355L;
        this.f18805H4 = -6534734903238641935L;
        this.f18806H5 = 5840696475078001361L;
        this.f18807H6 = -7276294671716946913L;
        this.f18808H7 = 2270897969802886507L;
        this.f18809H8 = 6620516959819538809L;
    }

    public SHA512Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA512Digest) memoable);
    }

    public SHA512Digest(SHA512Digest sHA512Digest) {
        super(sHA512Digest);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public SHA512Digest(byte[] bArr) {
        super(CryptoServicePurpose.values()[bArr[bArr.length - 1]]);
        restoreState(bArr);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
