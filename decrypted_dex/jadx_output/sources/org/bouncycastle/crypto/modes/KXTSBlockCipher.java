package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KXTSBlockCipher extends BufferedBlockCipher {
    private static final long RED_POLY_128 = 135;
    private static final long RED_POLY_256 = 1061;
    private static final long RED_POLY_512 = 293;
    private final int blockSize;
    private int counter;
    private final long reductionPolynomial;
    private final long[] tw_current;
    private final long[] tw_init;

    public KXTSBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.reductionPolynomial = getReductionPolynomial(blockSize);
        this.tw_init = new long[blockSize >>> 3];
        this.tw_current = new long[blockSize >>> 3];
        this.counter = -1;
    }

    private static void GF_double(long j, long[] jArr) {
        long j3 = 0;
        int i3 = 0;
        while (i3 < jArr.length) {
            long j10 = jArr[i3];
            jArr[i3] = j3 ^ (j10 << 1);
            i3++;
            j3 = j10 >>> 63;
        }
        jArr[0] = (j & (-j3)) ^ jArr[0];
    }

    public static long getReductionPolynomial(int i3) {
        if (i3 == 16) {
            return RED_POLY_128;
        }
        if (i3 == 32) {
            return RED_POLY_256;
        }
        if (i3 == 64) {
            return RED_POLY_512;
        }
        throw new IllegalArgumentException(StubApp.getString2(29142));
    }

    private void processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int i11 = this.counter;
        if (i11 == -1) {
            throw new IllegalStateException(StubApp.getString2(29110));
        }
        this.counter = i11 + 1;
        GF_double(this.reductionPolynomial, this.tw_current);
        byte[] bArr3 = new byte[this.blockSize];
        Pack.longToLittleEndian(this.tw_current, bArr3, 0);
        int i12 = this.blockSize;
        byte[] bArr4 = new byte[i12];
        System.arraycopy(bArr3, 0, bArr4, 0, i12);
        for (int i13 = 0; i13 < this.blockSize; i13++) {
            bArr4[i13] = (byte) (bArr4[i13] ^ bArr[i3 + i13]);
        }
        this.cipher.processBlock(bArr4, 0, bArr4, 0);
        for (int i14 = 0; i14 < this.blockSize; i14++) {
            bArr2[i10 + i14] = (byte) (bArr4[i14] ^ bArr3[i14]);
        }
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i3) {
        reset();
        return 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i3) {
        return i3;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i3) {
        return i3;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(29148));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        int i3 = this.blockSize;
        if (length != i3) {
            throw new IllegalArgumentException(StubApp.getString2(29147));
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(iv, 0, bArr, 0, i3);
        this.cipher.init(true, parameters);
        this.cipher.processBlock(bArr, 0, bArr, 0);
        this.cipher.init(z2, parameters);
        Pack.littleEndianToLong(bArr, 0, this.tw_init);
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b2, byte[] bArr, int i3) {
        throw new IllegalStateException(StubApp.getString2(29149));
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        if (bArr.length - i3 < i10) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        if (bArr2.length - i3 < i10) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        if (i10 % this.blockSize != 0) {
            throw new IllegalArgumentException(StubApp.getString2(29150));
        }
        int i12 = 0;
        while (i12 < i10) {
            processBlock(bArr, i3 + i12, bArr2, i11 + i12);
            i12 += this.blockSize;
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        this.cipher.reset();
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }
}
