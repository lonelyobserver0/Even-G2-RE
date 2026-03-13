package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KDFParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;
    private byte[] iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i10 < i3) {
            throw new OutputLengthException(StubApp.getString2(28433));
        }
        long j = i10 * 8;
        if (j > this.digest.getDigestSize() * 17179869184L) {
            throw new IllegalArgumentException(StubApp.getString2(28436));
        }
        int digestSize = (int) (j / this.digest.getDigestSize());
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        for (int i11 = 1; i11 <= digestSize; i11++) {
            Digest digest = this.digest;
            byte[] bArr3 = this.shared;
            digest.update(bArr3, 0, bArr3.length);
            this.digest.update((byte) (i11 & 255));
            this.digest.update((byte) ((i11 >> 8) & 255));
            this.digest.update((byte) ((i11 >> 16) & 255));
            this.digest.update((byte) ((i11 >> 24) & 255));
            Digest digest2 = this.digest;
            byte[] bArr4 = this.iv;
            digest2.update(bArr4, 0, bArr4.length);
            this.digest.doFinal(bArr2, 0);
            int i12 = i10 - i3;
            if (i12 > digestSize2) {
                System.arraycopy(bArr2, 0, bArr, i3, digestSize2);
                i3 += digestSize2;
            } else {
                System.arraycopy(bArr2, 0, bArr, i3, i12);
            }
        }
        this.digest.reset();
        return i10;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28434));
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.shared = kDFParameters.getSharedSecret();
        this.iv = kDFParameters.getIV();
    }
}
