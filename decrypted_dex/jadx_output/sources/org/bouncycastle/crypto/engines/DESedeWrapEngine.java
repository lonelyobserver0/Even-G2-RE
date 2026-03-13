package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import i2.u;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DESedeWrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private KeyParameter param;
    private ParametersWithIV paramPlusIV;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    private static byte[] reverse(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i3 = 0;
        while (i3 < bArr.length) {
            int i10 = i3 + 1;
            bArr2[i3] = bArr[bArr.length - i10];
            i3 = i10;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return StubApp.getString2(28590);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        this.forWrapping = z2;
        this.engine = new CBCBlockCipher(new DESedeEngine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            CipherParameters parameters = parametersWithRandom.getParameters();
            SecureRandom random = parametersWithRandom.getRandom();
            cipherParameters = parameters;
            secureRandom = random;
        } else {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.iv = bArr;
                secureRandom.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.iv);
                return;
            }
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.paramPlusIV = parametersWithIV;
            this.iv = parametersWithIV.getIV();
            this.param = (KeyParameter) this.paramPlusIV.getParameters();
            if (!this.forWrapping) {
                throw new IllegalArgumentException(StubApp.getString2(28595));
            }
            byte[] bArr2 = this.iv;
            if (bArr2 == null || bArr2.length != 8) {
                throw new IllegalArgumentException(StubApp.getString2(28594));
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28599));
        }
        if (bArr == null) {
            throw new InvalidCipherTextException(StubApp.getString2(28598));
        }
        int blockSize = this.engine.getBlockSize();
        if (i10 % blockSize != 0) {
            throw new InvalidCipherTextException(u.p(blockSize, StubApp.getString2(28597)));
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i10];
        for (int i11 = 0; i11 != i10; i11 += blockSize) {
            this.engine.processBlock(bArr, i3 + i11, bArr2, i11);
        }
        byte[] reverse = reverse(bArr2);
        byte[] bArr3 = new byte[8];
        this.iv = bArr3;
        int length = reverse.length;
        int i12 = length - 8;
        byte[] bArr4 = new byte[i12];
        System.arraycopy(reverse, 0, bArr3, 0, 8);
        System.arraycopy(reverse, 8, bArr4, 0, reverse.length - 8);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr5 = new byte[i12];
        for (int i13 = 0; i13 != i12; i13 += blockSize) {
            this.engine.processBlock(bArr4, i13, bArr5, i13);
        }
        int i14 = length - 16;
        byte[] bArr6 = new byte[i14];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, i14);
        System.arraycopy(bArr5, i14, bArr7, 0, 8);
        if (checkCMSKeyChecksum(bArr6, bArr7)) {
            return bArr6;
        }
        throw new InvalidCipherTextException(StubApp.getString2(28596));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i3, int i10) {
        if (!this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28601));
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        byte[] calculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = calculateCMSKeyChecksum.length + i10;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        System.arraycopy(calculateCMSKeyChecksum, 0, bArr3, i10, calculateCMSKeyChecksum.length);
        int blockSize = this.engine.getBlockSize();
        if (length % blockSize != 0) {
            throw new IllegalStateException(StubApp.getString2(28600));
        }
        this.engine.init(true, this.paramPlusIV);
        byte[] bArr4 = new byte[length];
        for (int i11 = 0; i11 != length; i11 += blockSize) {
            this.engine.processBlock(bArr3, i11, bArr4, i11);
        }
        byte[] bArr5 = this.iv;
        byte[] bArr6 = new byte[bArr5.length + length];
        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
        System.arraycopy(bArr4, 0, bArr6, this.iv.length, length);
        byte[] reverse = reverse(bArr6);
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i12 = 0; i12 != reverse.length; i12 += blockSize) {
            this.engine.processBlock(reverse, i12, reverse, i12);
        }
        return reverse;
    }
}
