package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;
    private byte[] iv;
    private byte[] shared;

    public BaseKDFBytesGenerator(int i3, Digest digest) {
        this.counterStart = i3;
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        int i11 = i10;
        int i12 = i3;
        if (bArr.length - i11 < i12) {
            throw new OutputLengthException(StubApp.getString2(28433));
        }
        long j = i11;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            throw new IllegalArgumentException(StubApp.getString2(28436));
        }
        long j3 = digestSize;
        int i13 = (int) (((j + j3) - 1) / j3);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Pack.intToBigEndian(this.counterStart, bArr3, 0);
        int i14 = this.counterStart & (-256);
        for (int i15 = 0; i15 < i13; i15++) {
            Digest digest = this.digest;
            byte[] bArr4 = this.shared;
            digest.update(bArr4, 0, bArr4.length);
            this.digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.iv;
            if (bArr5 != null) {
                this.digest.update(bArr5, 0, bArr5.length);
            }
            this.digest.doFinal(bArr2, 0);
            if (i11 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i12, digestSize);
                i12 += digestSize;
                i11 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i12, i11);
            }
            byte b2 = (byte) (bArr3[3] + 1);
            bArr3[3] = b2;
            if (b2 == 0) {
                i14 += 256;
                Pack.intToBigEndian(i14, bArr3, 0);
            }
        }
        this.digest.reset();
        return (int) j;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.iv = kDFParameters.getIV();
        } else {
            if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                throw new IllegalArgumentException(StubApp.getString2(28434));
            }
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.iv = null;
        }
    }
}
