package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RFC5649WrapEngine implements Wrapper {
    private BlockCipher engine;
    private byte[] extractedAIV = null;
    private boolean forWrapping;
    private byte[] highOrderIV;
    private KeyParameter param;
    private byte[] preIV;

    public RFC5649WrapEngine(BlockCipher blockCipher) {
        byte[] bArr = {-90, 89, 89, -90};
        this.highOrderIV = bArr;
        this.preIV = bArr;
        this.engine = blockCipher;
    }

    private byte[] padPlaintext(byte[] bArr) {
        int length = bArr.length;
        int i3 = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i3];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i3 != 0) {
            System.arraycopy(new byte[i3], 0, bArr2, length, i3);
        }
        return bArr2;
    }

    private byte[] rfc3394UnwrapNoIvCheck(byte[] bArr, int i3, int i10) {
        int i11 = i10 - 8;
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i3, bArr3, 0, 8);
        System.arraycopy(bArr, i3 + 8, bArr2, 0, i11);
        this.engine.init(false, this.param);
        int i12 = (i10 / 8) - 1;
        for (int i13 = 5; i13 >= 0; i13--) {
            for (int i14 = i12; i14 >= 1; i14--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i15 = (i14 - 1) * 8;
                System.arraycopy(bArr2, i15, bArr4, 8, 8);
                int i16 = (i12 * i13) + i14;
                int i17 = 1;
                while (i16 != 0) {
                    int i18 = 8 - i17;
                    bArr4[i18] = (byte) (((byte) i16) ^ bArr4[i18]);
                    i16 >>>= 8;
                    i17++;
                }
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i15, 8);
            }
        }
        this.extractedAIV = bArr3;
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forWrapping = z2;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            this.preIV = this.highOrderIV;
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.preIV = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.preIV.length != 4) {
                throw new IllegalArgumentException(StubApp.getString2(28732));
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        byte[] rfc3394UnwrapNoIvCheck;
        if (this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28615));
        }
        int i11 = i10 / 8;
        if (i11 * 8 != i10) {
            throw new InvalidCipherTextException(StubApp.getString2(28730));
        }
        if (i11 <= 1) {
            throw new InvalidCipherTextException(StubApp.getString2(28733));
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        byte[] bArr3 = new byte[i10];
        if (i11 == 2) {
            this.engine.init(false, this.param);
            int i12 = 0;
            while (i12 < i10) {
                this.engine.processBlock(bArr2, i12, bArr3, i12);
                i12 += this.engine.getBlockSize();
            }
            byte[] bArr4 = new byte[8];
            this.extractedAIV = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
            byte[] bArr5 = this.extractedAIV;
            int length = i10 - bArr5.length;
            rfc3394UnwrapNoIvCheck = new byte[length];
            System.arraycopy(bArr3, bArr5.length, rfc3394UnwrapNoIvCheck, 0, length);
        } else {
            rfc3394UnwrapNoIvCheck = rfc3394UnwrapNoIvCheck(bArr, i3, i10);
        }
        int i13 = 4;
        byte[] bArr6 = new byte[4];
        byte[] bArr7 = new byte[4];
        System.arraycopy(this.extractedAIV, 0, bArr6, 0, 4);
        System.arraycopy(this.extractedAIV, 4, bArr7, 0, 4);
        int bigEndianToInt = Pack.bigEndianToInt(bArr7, 0);
        boolean constantTimeAreEqual = Arrays.constantTimeAreEqual(bArr6, this.preIV);
        int length2 = rfc3394UnwrapNoIvCheck.length;
        if (bigEndianToInt <= length2 - 8) {
            constantTimeAreEqual = false;
        }
        if (bigEndianToInt > length2) {
            constantTimeAreEqual = false;
        }
        int i14 = length2 - bigEndianToInt;
        if (i14 >= 8 || i14 < 0) {
            constantTimeAreEqual = false;
        } else {
            i13 = i14;
        }
        byte[] bArr8 = new byte[i13];
        System.arraycopy(rfc3394UnwrapNoIvCheck, rfc3394UnwrapNoIvCheck.length - i13, bArr8, 0, i13);
        if (!Arrays.constantTimeAreEqual(bArr8, new byte[i13])) {
            constantTimeAreEqual = false;
        }
        if (!constantTimeAreEqual) {
            throw new InvalidCipherTextException(StubApp.getString2(28613));
        }
        byte[] bArr9 = new byte[bigEndianToInt];
        System.arraycopy(rfc3394UnwrapNoIvCheck, 0, bArr9, 0, bigEndianToInt);
        return bArr9;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i3, int i10) {
        if (!this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28617));
        }
        byte[] bArr2 = new byte[8];
        byte[] intToBigEndian = Pack.intToBigEndian(i10);
        byte[] bArr3 = this.preIV;
        int i11 = 0;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(intToBigEndian, 0, bArr2, this.preIV.length, intToBigEndian.length);
        byte[] bArr4 = new byte[i10];
        System.arraycopy(bArr, i3, bArr4, 0, i10);
        byte[] padPlaintext = padPlaintext(bArr4);
        if (padPlaintext.length != 8) {
            RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine(this.engine);
            rFC3394WrapEngine.init(true, new ParametersWithIV(this.param, bArr2));
            return rFC3394WrapEngine.wrap(padPlaintext, 0, padPlaintext.length);
        }
        int length = padPlaintext.length + 8;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, 8);
        System.arraycopy(padPlaintext, 0, bArr5, 8, padPlaintext.length);
        this.engine.init(true, this.param);
        while (i11 < length) {
            this.engine.processBlock(bArr5, i11, bArr5, i11);
            i11 += this.engine.getBlockSize();
        }
        return bArr5;
    }
}
