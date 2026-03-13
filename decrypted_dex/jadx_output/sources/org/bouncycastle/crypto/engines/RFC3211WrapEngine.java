package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RFC3211WrapEngine implements Wrapper {
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private ParametersWithIV param;
    private SecureRandom rand;

    public RFC3211WrapEngine(BlockCipher blockCipher) {
        this.engine = new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getUnderlyingCipher().getAlgorithmName() + StubApp.getString2(28724);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forWrapping = z2;
        boolean z10 = cipherParameters instanceof ParametersWithRandom;
        String string2 = StubApp.getString2(28725);
        if (z10) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.rand = parametersWithRandom.getRandom();
            if (!(parametersWithRandom.getParameters() instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(string2);
            }
            this.param = (ParametersWithIV) parametersWithRandom.getParameters();
            return;
        }
        if (z2) {
            this.rand = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(string2);
        }
        this.param = (ParametersWithIV) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28615));
        }
        int blockSize = this.engine.getBlockSize();
        if (i10 < blockSize * 2) {
            throw new InvalidCipherTextException(StubApp.getString2(28727));
        }
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[blockSize];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        System.arraycopy(bArr, i3, bArr3, 0, blockSize);
        this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
        for (int i11 = blockSize; i11 < i10; i11 += blockSize) {
            this.engine.processBlock(bArr2, i11, bArr2, i11);
        }
        System.arraycopy(bArr2, i10 - blockSize, bArr3, 0, blockSize);
        this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
        this.engine.processBlock(bArr2, 0, bArr2, 0);
        this.engine.init(false, this.param);
        for (int i12 = 0; i12 < i10; i12 += blockSize) {
            this.engine.processBlock(bArr2, i12, bArr2, i12);
        }
        int i13 = bArr2[0];
        int i14 = i10 - 4;
        boolean z2 = (i13 & 255) > i14;
        byte[] bArr4 = z2 ? new byte[i14] : new byte[i13 & 255];
        System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i15 = 0;
        int i16 = 0;
        while (i15 != 3) {
            int i17 = i15 + 1;
            i16 |= bArr2[i15 + 4] ^ ((byte) (~bArr2[i17]));
            i15 = i17;
        }
        Arrays.clear(bArr2);
        if (!z2 && !(i16 != 0)) {
            return bArr4;
        }
        throw new InvalidCipherTextException(StubApp.getString2(28726));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i3, int i10) {
        if (!this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28617));
        }
        if (i10 > 255 || i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(28728));
        }
        this.engine.init(true, this.param);
        int blockSize = this.engine.getBlockSize();
        int i11 = i10 + 4;
        int i12 = blockSize * 2;
        if (i11 >= i12) {
            i12 = i11 % blockSize == 0 ? i11 : ((i11 / blockSize) + 1) * blockSize;
        }
        byte[] bArr2 = new byte[i12];
        bArr2[0] = (byte) i10;
        System.arraycopy(bArr, i3, bArr2, 4, i10);
        int length = bArr2.length - i11;
        byte[] bArr3 = new byte[length];
        this.rand.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i11, length);
        bArr2[1] = (byte) (~bArr2[4]);
        bArr2[2] = (byte) (~bArr2[5]);
        bArr2[3] = (byte) (~bArr2[6]);
        for (int i13 = 0; i13 < bArr2.length; i13 += blockSize) {
            this.engine.processBlock(bArr2, i13, bArr2, i13);
        }
        for (int i14 = 0; i14 < bArr2.length; i14 += blockSize) {
            this.engine.processBlock(bArr2, i14, bArr2, i14);
        }
        return bArr2;
    }
}
