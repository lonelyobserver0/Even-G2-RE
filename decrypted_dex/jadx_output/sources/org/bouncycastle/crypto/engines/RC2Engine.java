package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, Base64.padSymbol, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, ByteCompanionObject.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, Tnaf.POW_2_WIDTH, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, ByteCompanionObject.MAX_VALUE, -63, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int i11 = ((bArr[i3 + 7] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 6] & UByte.MAX_VALUE);
        int i12 = ((bArr[i3 + 5] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 4] & UByte.MAX_VALUE);
        int i13 = ((bArr[i3 + 3] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 2] & UByte.MAX_VALUE);
        int i14 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) + (bArr[i3] & UByte.MAX_VALUE);
        for (int i15 = 60; i15 >= 44; i15 -= 4) {
            i11 = rotateWordLeft(i11, 11) - ((((~i12) & i14) + (i13 & i12)) + this.workingKey[i15 + 3]);
            i12 = rotateWordLeft(i12, 13) - ((((~i13) & i11) + (i14 & i13)) + this.workingKey[i15 + 2]);
            i13 = rotateWordLeft(i13, 14) - ((((~i14) & i12) + (i11 & i14)) + this.workingKey[i15 + 1]);
            i14 = rotateWordLeft(i14, 15) - ((((~i11) & i13) + (i12 & i11)) + this.workingKey[i15]);
        }
        int[] iArr = this.workingKey;
        int i16 = i11 - iArr[i12 & 63];
        int i17 = i12 - iArr[i13 & 63];
        int i18 = i13 - iArr[i14 & 63];
        int i19 = i14 - iArr[i16 & 63];
        for (int i20 = 40; i20 >= 20; i20 -= 4) {
            i16 = rotateWordLeft(i16, 11) - ((((~i17) & i19) + (i18 & i17)) + this.workingKey[i20 + 3]);
            i17 = rotateWordLeft(i17, 13) - ((((~i18) & i16) + (i19 & i18)) + this.workingKey[i20 + 2]);
            i18 = rotateWordLeft(i18, 14) - ((((~i19) & i17) + (i16 & i19)) + this.workingKey[i20 + 1]);
            i19 = rotateWordLeft(i19, 15) - ((((~i16) & i18) + (i17 & i16)) + this.workingKey[i20]);
        }
        int[] iArr2 = this.workingKey;
        int i21 = i16 - iArr2[i17 & 63];
        int i22 = i17 - iArr2[i18 & 63];
        int i23 = i18 - iArr2[i19 & 63];
        int i24 = i19 - iArr2[i21 & 63];
        for (int i25 = 16; i25 >= 0; i25 -= 4) {
            i21 = rotateWordLeft(i21, 11) - ((((~i22) & i24) + (i23 & i22)) + this.workingKey[i25 + 3]);
            i22 = rotateWordLeft(i22, 13) - ((((~i23) & i21) + (i24 & i23)) + this.workingKey[i25 + 2]);
            i23 = rotateWordLeft(i23, 14) - ((((~i24) & i22) + (i21 & i24)) + this.workingKey[i25 + 1]);
            i24 = rotateWordLeft(i24, 15) - ((((~i21) & i23) + (i22 & i21)) + this.workingKey[i25]);
        }
        bArr2[i10] = (byte) i24;
        bArr2[i10 + 1] = (byte) (i24 >> 8);
        bArr2[i10 + 2] = (byte) i23;
        bArr2[i10 + 3] = (byte) (i23 >> 8);
        bArr2[i10 + 4] = (byte) i22;
        bArr2[i10 + 5] = (byte) (i22 >> 8);
        bArr2[i10 + 6] = (byte) i21;
        bArr2[i10 + 7] = (byte) (i21 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int i11 = ((bArr[i3 + 7] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 6] & UByte.MAX_VALUE);
        int i12 = ((bArr[i3 + 5] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 4] & UByte.MAX_VALUE);
        int i13 = ((bArr[i3 + 3] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 2] & UByte.MAX_VALUE);
        int i14 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) + (bArr[i3] & UByte.MAX_VALUE);
        for (int i15 = 0; i15 <= 16; i15 += 4) {
            i14 = rotateWordLeft(i14 + ((~i11) & i13) + (i12 & i11) + this.workingKey[i15], 1);
            i13 = rotateWordLeft(i13 + ((~i14) & i12) + (i11 & i14) + this.workingKey[i15 + 1], 2);
            i12 = rotateWordLeft(i12 + ((~i13) & i11) + (i14 & i13) + this.workingKey[i15 + 2], 3);
            i11 = rotateWordLeft(i11 + ((~i12) & i14) + (i13 & i12) + this.workingKey[i15 + 3], 5);
        }
        int[] iArr = this.workingKey;
        int i16 = i14 + iArr[i11 & 63];
        int i17 = i13 + iArr[i16 & 63];
        int i18 = i12 + iArr[i17 & 63];
        int i19 = i11 + iArr[i18 & 63];
        for (int i20 = 20; i20 <= 40; i20 += 4) {
            i16 = rotateWordLeft(i16 + ((~i19) & i17) + (i18 & i19) + this.workingKey[i20], 1);
            i17 = rotateWordLeft(i17 + ((~i16) & i18) + (i19 & i16) + this.workingKey[i20 + 1], 2);
            i18 = rotateWordLeft(i18 + ((~i17) & i19) + (i16 & i17) + this.workingKey[i20 + 2], 3);
            i19 = rotateWordLeft(i19 + ((~i18) & i16) + (i17 & i18) + this.workingKey[i20 + 3], 5);
        }
        int[] iArr2 = this.workingKey;
        int i21 = i16 + iArr2[i19 & 63];
        int i22 = i17 + iArr2[i21 & 63];
        int i23 = i18 + iArr2[i22 & 63];
        int i24 = i19 + iArr2[i23 & 63];
        for (int i25 = 44; i25 < 64; i25 += 4) {
            i21 = rotateWordLeft(i21 + ((~i24) & i22) + (i23 & i24) + this.workingKey[i25], 1);
            i22 = rotateWordLeft(i22 + ((~i21) & i23) + (i24 & i21) + this.workingKey[i25 + 1], 2);
            i23 = rotateWordLeft(i23 + ((~i22) & i24) + (i21 & i22) + this.workingKey[i25 + 2], 3);
            i24 = rotateWordLeft(i24 + ((~i23) & i21) + (i22 & i23) + this.workingKey[i25 + 3], 5);
        }
        bArr2[i10] = (byte) i21;
        bArr2[i10 + 1] = (byte) (i21 >> 8);
        bArr2[i10 + 2] = (byte) i22;
        bArr2[i10 + 3] = (byte) (i22 >> 8);
        bArr2[i10 + 4] = (byte) i23;
        bArr2[i10 + 5] = (byte) (i23 >> 8);
        bArr2[i10 + 6] = (byte) i24;
        bArr2[i10 + 7] = (byte) (i24 >> 8);
    }

    private int[] generateWorkingKey(byte[] bArr, int i3) {
        int[] iArr = new int[128];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            iArr[i10] = bArr[i10] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i11 = iArr[length - 1];
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                i11 = piTable[(i11 + iArr[i12]) & 255] & UByte.MAX_VALUE;
                int i14 = length + 1;
                iArr[length] = i11;
                if (i14 >= 128) {
                    break;
                }
                length = i14;
                i12 = i13;
            }
        }
        int i15 = (i3 + 7) >> 3;
        int i16 = 128 - i15;
        int i17 = piTable[(255 >> ((-i3) & 7)) & iArr[i16]] & UByte.MAX_VALUE;
        iArr[i16] = i17;
        for (int i18 = 127 - i15; i18 >= 0; i18--) {
            i17 = piTable[i17 ^ iArr[i18 + i15]] & UByte.MAX_VALUE;
            iArr[i18] = i17;
        }
        int[] iArr2 = new int[64];
        for (int i19 = 0; i19 != 64; i19++) {
            int i20 = i19 * 2;
            iArr2[i19] = iArr[i20] + (iArr[i20 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i3, int i10) {
        int i11 = i3 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        return (i11 >> (16 - i10)) | (i11 << i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28256);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        byte[] key;
        this.encrypting = z2;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.workingKey = generateWorkingKey(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
            key = rC2Parameters.getKey();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.g(StubApp.getString2(28713), cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = generateWorkingKey(key, key.length * 8);
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (this.workingKey == null) {
            throw new IllegalStateException(StubApp.getString2(28714));
        }
        if (i3 + 8 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 8 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        if (this.encrypting) {
            encryptBlock(bArr, i3, bArr2, i10);
            return 8;
        }
        decryptBlock(bArr, i3, bArr2, i10);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
