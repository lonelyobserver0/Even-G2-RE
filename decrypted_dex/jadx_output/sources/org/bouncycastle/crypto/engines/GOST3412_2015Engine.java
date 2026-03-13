package org.bouncycastle.crypto.engines;

import E1.a;
import com.stub.StubApp;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3412_2015Engine implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    private static final byte[] PI = {-4, -18, -35, 17, -49, 110, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, -30, 92, -17, 33, -127, 28, 60, 66, -117, 1, -114, 79, 5, -124, 2, -82, -29, 106, -113, -96, 6, 11, -19, -104, ByteCompanionObject.MAX_VALUE, -44, -45, 31, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, 112, 14, 86, 8, 12, 118, 18, -65, 114, 19, 71, -100, -73, 93, -121, 21, -95, -106, 41, Tnaf.POW_2_WIDTH, 123, -102, -57, -13, -111, 120, 111, -99, -98, -78, -79, 50, 117, 25, Base64.padSymbol, -1, 53, -118, 126, 109, 84, -58, ByteCompanionObject.MIN_VALUE, -61, -67, 13, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, 15, -20, -34, 122, -108, -80, PSSSigner.TRAILER_IMPLICIT, -36, -24, 40, 80, 78, 51, 10, 74, -89, -105, 96, 115, 30, 0, 98, 68, 26, -72, 56, -126, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, 48, 55, 107, -28, -120, -39, -25, -119, -31, 27, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, -64, -47, 102, -81, -62, 57, 75, 99, -74};
    private static final byte[] inversePI = {-91, 45, 50, -113, 14, 48, 56, -64, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, 28, 96, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, 12, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, 21, -73, -56, 6, 112, -99, 65, 117, 25, -55, -86, -4, 77, -65, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, -17, -39, 121, -74, 83, ByteCompanionObject.MAX_VALUE, -63, -16, 35, -25, 37, 94, -75, 30, -94, -33, -90, -2, -84, 34, -7, -30, 74, PSSSigner.TRAILER_IMPLICIT, 53, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, -116, -69, 119, 60, 123, 40, -85, -46, 49, -34, -60, 95, -52, -49, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, -96, -123, -125, -38, 71, -59, -80, 51, -6, -106, 111, 110, -62, -10, 80, -1, 93, -87, -114, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, Base64.padSymbol, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, ByteCompanionObject.MIN_VALUE, -112, -48, 36, 52, -53, -19, -12, -50, -103, Tnaf.POW_2_WIDTH, 68, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, -127, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};
    private boolean forEncryption;
    private final byte[] lFactors = {-108, 32, -123, Tnaf.POW_2_WIDTH, -62, -64, 1, -5, 1, -64, -62, Tnaf.POW_2_WIDTH, -123, 32, -108, 1};
    private int KEY_LENGTH = 32;
    private int SUB_LENGTH = 32 / 2;
    private byte[][] subKeys = null;
    private byte[][] _gf_mul = init_gf256_mul_table();

    private void C(byte[] bArr, int i3) {
        Arrays.clear(bArr);
        bArr[15] = (byte) i3;
        L(bArr);
    }

    private void F(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] LSX = LSX(bArr, bArr2);
        X(LSX, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 0, this.SUB_LENGTH);
        System.arraycopy(LSX, 0, bArr2, 0, this.SUB_LENGTH);
    }

    private void GOST3412_2015Func(byte[] bArr, int i3, byte[] bArr2, int i10) {
        byte[][] bArr3;
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i3, bArr4, 0, 16);
        int i11 = 9;
        if (this.forEncryption) {
            for (int i12 = 0; i12 < 9; i12++) {
                bArr4 = Arrays.copyOf(LSX(this.subKeys[i12], bArr4), 16);
            }
            X(bArr4, this.subKeys[9]);
        } else {
            while (true) {
                bArr3 = this.subKeys;
                if (i11 <= 0) {
                    break;
                }
                bArr4 = Arrays.copyOf(XSL(bArr3[i11], bArr4), 16);
                i11--;
            }
            X(bArr4, bArr3[0]);
        }
        System.arraycopy(bArr4, 0, bArr2, i10, 16);
    }

    private void L(byte[] bArr) {
        for (int i3 = 0; i3 < 16; i3++) {
            R(bArr);
        }
    }

    private byte[] LSX(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        X(copyOf, bArr2);
        S(copyOf);
        L(copyOf);
        return copyOf;
    }

    private void R(byte[] bArr) {
        byte l9 = l(bArr);
        System.arraycopy(bArr, 0, bArr, 1, 15);
        bArr[0] = l9;
    }

    private void S(byte[] bArr) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = PI[unsignedByte(bArr[i3])];
        }
    }

    private void X(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
    }

    private byte[] XSL(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        X(copyOf, bArr2);
        inverseL(copyOf);
        inverseS(copyOf);
        return copyOf;
    }

    private void generateSubKeys(byte[] bArr) {
        int i3;
        if (bArr.length != this.KEY_LENGTH) {
            throw new IllegalArgumentException(StubApp.getString2(28633));
        }
        this.subKeys = new byte[10][];
        for (int i10 = 0; i10 < 10; i10++) {
            this.subKeys[i10] = new byte[this.SUB_LENGTH];
        }
        int i11 = this.SUB_LENGTH;
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[i11];
        int i12 = 0;
        while (true) {
            i3 = this.SUB_LENGTH;
            if (i12 >= i3) {
                break;
            }
            byte[][] bArr4 = this.subKeys;
            byte[] bArr5 = bArr4[0];
            byte b2 = bArr[i12];
            bArr2[i12] = b2;
            bArr5[i12] = b2;
            byte[] bArr6 = bArr4[1];
            byte b10 = bArr[i3 + i12];
            bArr3[i12] = b10;
            bArr6[i12] = b10;
            i12++;
        }
        byte[] bArr7 = new byte[i3];
        for (int i13 = 1; i13 < 5; i13++) {
            for (int i14 = 1; i14 <= 8; i14++) {
                C(bArr7, a.f(i13, 1, 8, i14));
                F(bArr7, bArr2, bArr3);
            }
            int i15 = i13 * 2;
            System.arraycopy(bArr2, 0, this.subKeys[i15], 0, this.SUB_LENGTH);
            System.arraycopy(bArr3, 0, this.subKeys[i15 + 1], 0, this.SUB_LENGTH);
        }
    }

    private static byte[][] init_gf256_mul_table() {
        byte[][] bArr = new byte[256][];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr[i3] = new byte[256];
            for (int i10 = 0; i10 < 256; i10++) {
                bArr[i3][i10] = kuz_mul_gf256_slow((byte) i3, (byte) i10);
            }
        }
        return bArr;
    }

    private void inverseL(byte[] bArr) {
        for (int i3 = 0; i3 < 16; i3++) {
            inverseR(bArr);
        }
    }

    private void inverseR(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 1, bArr2, 0, 15);
        bArr2[15] = bArr[0];
        byte l9 = l(bArr2);
        System.arraycopy(bArr, 1, bArr, 0, 15);
        bArr[15] = l9;
    }

    private void inverseS(byte[] bArr) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = inversePI[unsignedByte(bArr[i3])];
        }
    }

    private static byte kuz_mul_gf256_slow(byte b2, byte b10) {
        byte b11 = 0;
        for (byte b12 = 0; b12 < 8 && b2 != 0 && b10 != 0; b12 = (byte) (b12 + 1)) {
            if ((b10 & 1) != 0) {
                b11 = (byte) (b11 ^ b2);
            }
            byte b13 = (byte) (b2 & ByteCompanionObject.MIN_VALUE);
            b2 = (byte) (b2 << 1);
            if (b13 != 0) {
                b2 = (byte) (b2 ^ 195);
            }
            b10 = (byte) (b10 >> 1);
        }
        return b11;
    }

    private byte l(byte[] bArr) {
        byte b2 = bArr[15];
        for (int i3 = 14; i3 >= 0; i3--) {
            b2 = (byte) (b2 ^ this._gf_mul[unsignedByte(bArr[i3])][unsignedByte(this.lFactors[i3])]);
        }
        return b2;
    }

    private int unsignedByte(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28641);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (cipherParameters instanceof KeyParameter) {
            this.forEncryption = z2;
            generateSubKeys(((KeyParameter) cipherParameters).getKey());
        } else if (cipherParameters != null) {
            throw new IllegalArgumentException(org.bouncycastle.asn1.a.g(StubApp.getString2(28642), cipherParameters));
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        if (this.subKeys == null) {
            throw new IllegalStateException(StubApp.getString2(28643));
        }
        if (i3 + 16 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 16 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        GOST3412_2015Func(bArr, i3, bArr2, i10);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
