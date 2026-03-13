package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;
    private SecureRandom sr;
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

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return StubApp.getString2(28256);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) {
        this.forWrapping = z2;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.sr = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.param = cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.iv = bArr;
                this.sr.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.iv);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.paramPlusIV = parametersWithIV;
        this.iv = parametersWithIV.getIV();
        this.param = this.paramPlusIV.getParameters();
        if (!this.forWrapping) {
            throw new IllegalArgumentException(StubApp.getString2(28595));
        }
        byte[] bArr2 = this.iv;
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException(StubApp.getString2(28594));
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
        if (i10 % this.engine.getBlockSize() != 0) {
            throw new InvalidCipherTextException(StubApp.getString2(28597) + this.engine.getBlockSize());
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i3, bArr2, 0, i10);
        for (int i11 = 0; i11 < i10 / this.engine.getBlockSize(); i11++) {
            int blockSize = this.engine.getBlockSize() * i11;
            this.engine.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i10];
        int i12 = 0;
        while (i12 < i10) {
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[i10 - i13];
            i12 = i13;
        }
        byte[] bArr4 = new byte[8];
        this.iv = bArr4;
        int i14 = i10 - 8;
        byte[] bArr5 = new byte[i14];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i14);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i14];
        System.arraycopy(bArr5, 0, bArr6, 0, i14);
        for (int i15 = 0; i15 < i14 / this.engine.getBlockSize(); i15++) {
            int blockSize2 = this.engine.getBlockSize() * i15;
            this.engine.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i16 = i10 - 16;
        byte[] bArr7 = new byte[i16];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i16);
        System.arraycopy(bArr6, i16, bArr8, 0, 8);
        if (!checkCMSKeyChecksum(bArr7, bArr8)) {
            throw new InvalidCipherTextException(StubApp.getString2(28596));
        }
        int i17 = bArr7[0];
        if (i16 - ((i17 & 255) + 1) <= 7) {
            byte[] bArr9 = new byte[i17];
            System.arraycopy(bArr7, 1, bArr9, 0, i17);
            return bArr9;
        }
        throw new InvalidCipherTextException(StubApp.getString2(28715) + (i16 - ((bArr7[0] & 255) + 1)) + StubApp.getString2(74));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i3, int i10) {
        if (!this.forWrapping) {
            throw new IllegalStateException(StubApp.getString2(28601));
        }
        int i11 = i10 + 1;
        int i12 = i11 % 8;
        int i13 = i12 != 0 ? (8 - i12) + i11 : i11;
        byte[] bArr2 = new byte[i13];
        bArr2[0] = (byte) i10;
        System.arraycopy(bArr, i3, bArr2, 1, i10);
        int i14 = (i13 - i10) - 1;
        byte[] bArr3 = new byte[i14];
        if (i14 > 0) {
            this.sr.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i11, i14);
        }
        byte[] calculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = calculateCMSKeyChecksum.length + i13;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, i13);
        System.arraycopy(calculateCMSKeyChecksum, 0, bArr4, i13, calculateCMSKeyChecksum.length);
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.engine.getBlockSize();
        if (length % this.engine.getBlockSize() != 0) {
            throw new IllegalStateException(StubApp.getString2(28600));
        }
        this.engine.init(true, this.paramPlusIV);
        for (int i15 = 0; i15 < blockSize; i15++) {
            int blockSize2 = this.engine.getBlockSize() * i15;
            this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i16 = 0;
        while (i16 < length2) {
            int i17 = i16 + 1;
            bArr8[i16] = bArr7[length2 - i17];
            i16 = i17;
        }
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i18 = 0; i18 < blockSize + 1; i18++) {
            int blockSize3 = this.engine.getBlockSize() * i18;
            this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
