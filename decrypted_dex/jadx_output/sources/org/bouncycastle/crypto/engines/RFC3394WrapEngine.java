package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RFC3394WrapEngine implements Wrapper {
    private BlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private KeyParameter param;
    private boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
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
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.iv = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.iv.length != 8) {
                throw new IllegalArgumentException(StubApp.getString2(28729));
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28615));
        }
        int i11 = i10 / 8;
        if (i11 * 8 != i10) {
            throw new InvalidCipherTextException(StubApp.getString2(28730));
        }
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[i10 - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length + 8];
        System.arraycopy(bArr, i3, bArr4, 0, bArr2.length);
        byte[] bArr6 = this.iv;
        System.arraycopy(bArr, i3 + bArr6.length, bArr3, 0, i10 - bArr6.length);
        this.engine.init(!this.wrapCipherMode, this.param);
        int i12 = i11 - 1;
        for (int i13 = 5; i13 >= 0; i13--) {
            for (int i14 = i12; i14 >= 1; i14--) {
                System.arraycopy(bArr4, 0, bArr5, 0, this.iv.length);
                int i15 = (i14 - 1) * 8;
                System.arraycopy(bArr3, i15, bArr5, this.iv.length, 8);
                int i16 = (i12 * i13) + i14;
                int i17 = 1;
                while (i16 != 0) {
                    int length = this.iv.length - i17;
                    bArr5[length] = (byte) (((byte) i16) ^ bArr5[length]);
                    i16 >>>= 8;
                    i17++;
                }
                this.engine.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr4, 0, 8);
                System.arraycopy(bArr5, 8, bArr3, i15, 8);
            }
        }
        if (Arrays.constantTimeAreEqual(bArr4, this.iv)) {
            return bArr3;
        }
        throw new InvalidCipherTextException(StubApp.getString2(28613));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i3, int i10) {
        if (!this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28617));
        }
        int i11 = i10 / 8;
        if (i11 * 8 != i10) {
            throw new DataLengthException(StubApp.getString2(28731));
        }
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[bArr2.length + i10];
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i3, bArr3, this.iv.length, i10);
        this.engine.init(this.wrapCipherMode, this.param);
        for (int i12 = 0; i12 != 6; i12++) {
            for (int i13 = 1; i13 <= i11; i13++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.iv.length);
                int i14 = i13 * 8;
                System.arraycopy(bArr3, i14, bArr4, this.iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i15 = (i11 * i12) + i13;
                int i16 = 1;
                while (i15 != 0) {
                    int length = this.iv.length - i16;
                    bArr4[length] = (byte) (((byte) i15) ^ bArr4[length]);
                    i15 >>>= 8;
                    i16++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i14, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z2) {
        this.iv = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.engine = blockCipher;
        this.wrapCipherMode = !z2;
    }
}
