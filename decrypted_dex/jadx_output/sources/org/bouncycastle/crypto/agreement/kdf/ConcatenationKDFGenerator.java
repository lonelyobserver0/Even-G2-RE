package org.bouncycastle.crypto.agreement.kdf;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KDFParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ConcatenationKDFGenerator implements DerivationFunction {
    private Digest digest;
    private int hLen;
    private byte[] otherInfo;
    private byte[] shared;

    public ConcatenationKDFGenerator(Digest digest) {
        this.digest = digest;
        this.hLen = digest.getDigestSize();
    }

    private void ItoOSP(int i3, byte[] bArr) {
        bArr[0] = (byte) (i3 >>> 24);
        bArr[1] = (byte) (i3 >>> 16);
        bArr[2] = (byte) (i3 >>> 8);
        bArr[3] = (byte) i3;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        int i11;
        int i12;
        if (bArr.length - i10 < i3) {
            throw new OutputLengthException(StubApp.getString2(28433));
        }
        byte[] bArr2 = new byte[this.hLen];
        byte[] bArr3 = new byte[4];
        this.digest.reset();
        int i13 = 1;
        if (i10 > this.hLen) {
            i11 = 0;
            while (true) {
                ItoOSP(i13, bArr3);
                this.digest.update(bArr3, 0, 4);
                Digest digest = this.digest;
                byte[] bArr4 = this.shared;
                digest.update(bArr4, 0, bArr4.length);
                Digest digest2 = this.digest;
                byte[] bArr5 = this.otherInfo;
                digest2.update(bArr5, 0, bArr5.length);
                this.digest.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i3 + i11, this.hLen);
                int i14 = this.hLen;
                i11 += i14;
                i12 = i13 + 1;
                if (i13 >= i10 / i14) {
                    break;
                }
                i13 = i12;
            }
            i13 = i12;
        } else {
            i11 = 0;
        }
        if (i11 < i10) {
            ItoOSP(i13, bArr3);
            this.digest.update(bArr3, 0, 4);
            Digest digest3 = this.digest;
            byte[] bArr6 = this.shared;
            digest3.update(bArr6, 0, bArr6.length);
            Digest digest4 = this.digest;
            byte[] bArr7 = this.otherInfo;
            digest4.update(bArr7, 0, bArr7.length);
            this.digest.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i3 + i11, i10 - i11);
        }
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
        this.otherInfo = kDFParameters.getIV();
    }
}
