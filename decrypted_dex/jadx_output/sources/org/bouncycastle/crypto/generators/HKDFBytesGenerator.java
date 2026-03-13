package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HKDFBytesGenerator implements DerivationFunction {
    private byte[] currentT;
    private int generatedBytes;
    private HMac hMacHash;
    private int hashLen;
    private byte[] info;

    public HKDFBytesGenerator(Digest digest) {
        this.hMacHash = new HMac(digest);
        this.hashLen = digest.getDigestSize();
    }

    private void expandNext() throws DataLengthException {
        int i3 = this.generatedBytes;
        int i10 = this.hashLen;
        int i11 = (i3 / i10) + 1;
        if (i11 >= 256) {
            throw new DataLengthException(StubApp.getString2(28917));
        }
        if (i3 != 0) {
            this.hMacHash.update(this.currentT, 0, i10);
        }
        HMac hMac = this.hMacHash;
        byte[] bArr = this.info;
        hMac.update(bArr, 0, bArr.length);
        this.hMacHash.update((byte) i11);
        this.hMacHash.doFinal(this.currentT, 0);
    }

    private KeyParameter extract(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            this.hMacHash.init(new KeyParameter(new byte[this.hashLen]));
        } else {
            this.hMacHash.init(new KeyParameter(bArr));
        }
        this.hMacHash.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.hashLen];
        this.hMacHash.doFinal(bArr3, 0);
        return new KeyParameter(bArr3);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        int i11 = this.generatedBytes;
        int i12 = i11 + i10;
        int i13 = this.hashLen;
        if (i12 > i13 * 255) {
            throw new DataLengthException(StubApp.getString2(28918));
        }
        if (i11 % i13 == 0) {
            expandNext();
        }
        int i14 = this.generatedBytes;
        int i15 = this.hashLen;
        int i16 = i14 % i15;
        int min = Math.min(i15 - (i14 % i15), i10);
        System.arraycopy(this.currentT, i16, bArr, i3, min);
        this.generatedBytes += min;
        int i17 = i10 - min;
        while (true) {
            i3 += min;
            if (i17 <= 0) {
                return i10;
            }
            expandNext();
            min = Math.min(this.hashLen, i17);
            System.arraycopy(this.currentT, 0, bArr, i3, min);
            this.generatedBytes += min;
            i17 -= min;
        }
    }

    public Digest getDigest() {
        return this.hMacHash.getUnderlyingDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        HMac hMac;
        KeyParameter extract;
        if (!(derivationParameters instanceof HKDFParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28919));
        }
        HKDFParameters hKDFParameters = (HKDFParameters) derivationParameters;
        if (hKDFParameters.skipExtract()) {
            hMac = this.hMacHash;
            extract = new KeyParameter(hKDFParameters.getIKM());
        } else {
            hMac = this.hMacHash;
            extract = extract(hKDFParameters.getSalt(), hKDFParameters.getIKM());
        }
        hMac.init(extract);
        this.info = hKDFParameters.getInfo();
        this.generatedBytes = 0;
        this.currentT = new byte[this.hashLen];
    }
}
