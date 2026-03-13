package org.bouncycastle.crypto.encodings;

import com.stub.StubApp;
import java.math.BigInteger;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private byte[] decodeBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        byte[] processBlock = this.engine.processBlock(bArr, i3, i10);
        int i11 = (this.bitSize + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, processBlock);
        BigInteger bigInteger2 = SIXTEEN;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = SIX;
        if (!mod.equals(bigInteger3)) {
            if (!this.modulus.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException(StubApp.getString2(28539));
            }
            bigInteger = this.modulus.subtract(bigInteger);
        }
        byte[] convertOutputDecryptOnly = convertOutputDecryptOnly(bigInteger);
        if ((convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] & 15) != 6) {
            throw new InvalidCipherTextException(StubApp.getString2(28538));
        }
        convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] = (byte) (((convertOutputDecryptOnly[convertOutputDecryptOnly.length - 1] & UByte.MAX_VALUE) >>> 4) | (inverse[(convertOutputDecryptOnly[convertOutputDecryptOnly.length - 2] & UByte.MAX_VALUE) >> 4] << 4));
        byte[] bArr2 = shadows;
        byte b2 = convertOutputDecryptOnly[1];
        byte b10 = (byte) (bArr2[b2 & 15] | (bArr2[(b2 & UByte.MAX_VALUE) >>> 4] << 4));
        convertOutputDecryptOnly[0] = b10;
        int i12 = 1;
        int i13 = 0;
        boolean z2 = false;
        for (int length = convertOutputDecryptOnly.length - 1; length >= convertOutputDecryptOnly.length - (i11 * 2); length -= 2) {
            byte[] bArr3 = shadows;
            byte b11 = convertOutputDecryptOnly[length];
            int i14 = bArr3[b11 & 15] | (bArr3[(b11 & UByte.MAX_VALUE) >>> 4] << 4);
            int i15 = length - 1;
            byte b12 = convertOutputDecryptOnly[i15];
            if (((b12 ^ i14) & 255) != 0) {
                if (z2) {
                    throw new InvalidCipherTextException(StubApp.getString2(28537));
                }
                i12 = (b12 ^ i14) & 255;
                z2 = true;
                i13 = i15;
            }
        }
        convertOutputDecryptOnly[i13] = 0;
        int length2 = (convertOutputDecryptOnly.length - i13) / 2;
        byte[] bArr4 = new byte[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            bArr4[i16] = convertOutputDecryptOnly[AbstractC1482f.c(i16, 2, i13, 1)];
        }
        this.padBits = i12 - 1;
        return bArr4;
    }

    private byte[] encodeBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        int i11 = this.bitSize;
        int i12 = (i11 + 7) / 8;
        byte[] bArr2 = new byte[i12];
        int i13 = 1;
        int i14 = this.padBits + 1;
        int i15 = (i11 + 13) / 16;
        int i16 = 0;
        while (i16 < i15) {
            if (i16 > i15 - i10) {
                int i17 = i15 - i16;
                System.arraycopy(bArr, (i3 + i10) - i17, bArr2, i12 - i15, i17);
            } else {
                System.arraycopy(bArr, i3, bArr2, i12 - (i16 + i10), i10);
            }
            i16 += i10;
        }
        for (int i18 = i12 - (i15 * 2); i18 != i12; i18 += 2) {
            byte b2 = bArr2[(i18 / 2) + (i12 - i15)];
            byte[] bArr3 = shadows;
            bArr2[i18] = (byte) (bArr3[b2 & 15] | (bArr3[(b2 & UByte.MAX_VALUE) >>> 4] << 4));
            bArr2[i18 + 1] = b2;
        }
        int i19 = i12 - (i10 * 2);
        bArr2[i19] = (byte) (bArr2[i19] ^ i14);
        int i20 = i12 - 1;
        bArr2[i20] = (byte) ((bArr2[i20] << 4) | 6);
        int i21 = 8 - ((this.bitSize - 1) % 8);
        if (i21 != 8) {
            byte b10 = (byte) (bArr2[0] & (255 >>> i21));
            bArr2[0] = b10;
            bArr2[0] = (byte) ((128 >>> i21) | b10);
            i13 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | ByteCompanionObject.MIN_VALUE);
        }
        return this.engine.processBlock(bArr2, i13, i12 - i13);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.engine.init(z2, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.modulus = modulus;
        this.bitSize = modulus.bitLength();
        this.forEncryption = z2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i3, int i10) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i3, i10) : decodeBlock(bArr, i3, i10);
    }

    public void setPadBits(int i3) {
        if (i3 > 7) {
            throw new IllegalArgumentException(StubApp.getString2(28540));
        }
        this.padBits = i3;
    }
}
