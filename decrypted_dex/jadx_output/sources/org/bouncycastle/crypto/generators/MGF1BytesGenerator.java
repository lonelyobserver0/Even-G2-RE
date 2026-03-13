package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.MGFParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MGF1BytesGenerator implements DerivationFunction {
    private Digest digest;
    private int hLen;
    private byte[] seed;

    public MGF1BytesGenerator(Digest digest) {
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
        if (bArr.length - i10 < i3) {
            throw new OutputLengthException(StubApp.getString2(28433));
        }
        byte[] bArr2 = new byte[this.hLen];
        byte[] bArr3 = new byte[4];
        this.digest.reset();
        if (i10 > this.hLen) {
            i11 = 0;
            do {
                ItoOSP(i11, bArr3);
                Digest digest = this.digest;
                byte[] bArr4 = this.seed;
                digest.update(bArr4, 0, bArr4.length);
                this.digest.update(bArr3, 0, 4);
                this.digest.doFinal(bArr2, 0);
                int i12 = this.hLen;
                System.arraycopy(bArr2, 0, bArr, (i11 * i12) + i3, i12);
                i11++;
            } while (i11 < i10 / this.hLen);
        } else {
            i11 = 0;
        }
        if (this.hLen * i11 < i10) {
            ItoOSP(i11, bArr3);
            Digest digest2 = this.digest;
            byte[] bArr5 = this.seed;
            digest2.update(bArr5, 0, bArr5.length);
            this.digest.update(bArr3, 0, 4);
            this.digest.doFinal(bArr2, 0);
            int i13 = this.hLen;
            System.arraycopy(bArr2, 0, bArr, (i11 * i13) + i3, i10 - (i11 * i13));
        }
        return i10;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof MGFParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28923));
        }
        this.seed = ((MGFParameters) derivationParameters).getSeed();
    }
}
