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
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class TwofishEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int INPUT_WHITEN = 0;
    private static final int MAX_KEY_BITS = 256;
    private static final int MAX_ROUNDS = 16;
    private static final int OUTPUT_WHITEN = 4;

    /* renamed from: P, reason: collision with root package name */
    private static final byte[][] f18965P = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, ByteCompanionObject.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, Base64.padSymbol, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, ByteCompanionObject.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, Tnaf.POW_2_WIDTH, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, -79, 14, ByteCompanionObject.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, Tnaf.POW_2_WIDTH, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, Base64.padSymbol, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, ByteCompanionObject.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int ROUNDS = 16;
    private static final int ROUND_SUBKEYS = 8;
    private static final int RS_GF_FDBK = 333;
    private static final int SK_BUMP = 16843009;
    private static final int SK_ROTL = 9;
    private static final int SK_STEP = 33686018;
    private static final int TOTAL_SUBKEYS = 40;
    private int[] gSBox;
    private int[] gSubKeys;
    private boolean encrypting = false;
    private int[] gMDS0 = new int[256];
    private int[] gMDS1 = new int[256];
    private int[] gMDS2 = new int[256];
    private int[] gMDS3 = new int[256];
    private int k64Cnt = 0;
    private byte[] workingKey = null;

    public TwofishEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
        for (int i3 = 0; i3 < 256; i3++) {
            byte[][] bArr = f18965P;
            int i10 = bArr[0][i3] & UByte.MAX_VALUE;
            int Mx_X = Mx_X(i10) & 255;
            int Mx_Y = Mx_Y(i10) & 255;
            int i11 = bArr[1][i3] & 255;
            int[] iArr = {i10, i11};
            int[] iArr2 = {Mx_X, Mx_X(i11) & 255};
            int[] iArr3 = {Mx_Y, Mx_Y(i11) & 255};
            int[] iArr4 = this.gMDS0;
            int i12 = iArr[1] | (iArr2[1] << 8);
            int i13 = iArr3[1];
            iArr4[i3] = i12 | (i13 << 16) | (i13 << 24);
            int[] iArr5 = this.gMDS1;
            int i14 = iArr3[0];
            iArr5[i3] = i14 | (i14 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = this.gMDS2;
            int i15 = iArr2[1];
            int i16 = iArr3[1];
            iArr6[i3] = (iArr[1] << 16) | i15 | (i16 << 8) | (i16 << 24);
            int[] iArr7 = this.gMDS3;
            int i17 = iArr2[0];
            iArr7[i3] = (iArr3[0] << 16) | (iArr[0] << 8) | i17 | (i17 << 24);
        }
    }

    private int F32(int i3, int[] iArr) {
        int i10;
        int i11;
        int b02 = b0(i3);
        int b12 = b1(i3);
        int b2 = b2(i3);
        int b32 = b3(i3);
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = this.k64Cnt & 3;
        if (i16 != 0) {
            if (i16 == 1) {
                int[] iArr2 = this.gMDS0;
                byte[][] bArr = f18965P;
                i10 = (iArr2[(bArr[0][b02] & UByte.MAX_VALUE) ^ b0(i12)] ^ this.gMDS1[(bArr[0][b12] & UByte.MAX_VALUE) ^ b1(i12)]) ^ this.gMDS2[(bArr[1][b2] & UByte.MAX_VALUE) ^ b2(i12)];
                i11 = this.gMDS3[(bArr[1][b32] & UByte.MAX_VALUE) ^ b3(i12)];
                return i11 ^ i10;
            }
            if (i16 != 2) {
                if (i16 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.gMDS0;
            byte[][] bArr2 = f18965P;
            byte[] bArr3 = bArr2[0];
            i10 = (iArr3[(bArr3[(bArr3[b02] & UByte.MAX_VALUE) ^ b0(i13)] & UByte.MAX_VALUE) ^ b0(i12)] ^ this.gMDS1[(bArr2[0][(bArr2[1][b12] & UByte.MAX_VALUE) ^ b1(i13)] & UByte.MAX_VALUE) ^ b1(i12)]) ^ this.gMDS2[(bArr2[1][(bArr2[0][b2] & UByte.MAX_VALUE) ^ b2(i13)] & UByte.MAX_VALUE) ^ b2(i12)];
            int[] iArr4 = this.gMDS3;
            byte[] bArr4 = bArr2[1];
            i11 = iArr4[(bArr4[(bArr4[b32] & UByte.MAX_VALUE) ^ b3(i13)] & UByte.MAX_VALUE) ^ b3(i12)];
            return i11 ^ i10;
        }
        byte[][] bArr5 = f18965P;
        b02 = (bArr5[1][b02] & UByte.MAX_VALUE) ^ b0(i15);
        b12 = (bArr5[0][b12] & UByte.MAX_VALUE) ^ b1(i15);
        b2 = (bArr5[0][b2] & UByte.MAX_VALUE) ^ b2(i15);
        b32 = (bArr5[1][b32] & UByte.MAX_VALUE) ^ b3(i15);
        byte[][] bArr6 = f18965P;
        b02 = (bArr6[1][b02] & UByte.MAX_VALUE) ^ b0(i14);
        b12 = (bArr6[1][b12] & UByte.MAX_VALUE) ^ b1(i14);
        b2 = (bArr6[0][b2] & UByte.MAX_VALUE) ^ b2(i14);
        b32 = (bArr6[0][b32] & UByte.MAX_VALUE) ^ b3(i14);
        int[] iArr32 = this.gMDS0;
        byte[][] bArr22 = f18965P;
        byte[] bArr32 = bArr22[0];
        i10 = (iArr32[(bArr32[(bArr32[b02] & UByte.MAX_VALUE) ^ b0(i13)] & UByte.MAX_VALUE) ^ b0(i12)] ^ this.gMDS1[(bArr22[0][(bArr22[1][b12] & UByte.MAX_VALUE) ^ b1(i13)] & UByte.MAX_VALUE) ^ b1(i12)]) ^ this.gMDS2[(bArr22[1][(bArr22[0][b2] & UByte.MAX_VALUE) ^ b2(i13)] & UByte.MAX_VALUE) ^ b2(i12)];
        int[] iArr42 = this.gMDS3;
        byte[] bArr42 = bArr22[1];
        i11 = iArr42[(bArr42[(bArr42[b32] & UByte.MAX_VALUE) ^ b3(i13)] & UByte.MAX_VALUE) ^ b3(i12)];
        return i11 ^ i10;
    }

    private int Fe32_0(int i3) {
        int[] iArr = this.gSBox;
        return iArr[(((i3 >>> 24) & 255) * 2) + 513] ^ ((iArr[(i3 & 255) * 2] ^ iArr[(((i3 >>> 8) & 255) * 2) + 1]) ^ iArr[(((i3 >>> 16) & 255) * 2) + 512]);
    }

    private int Fe32_3(int i3) {
        int[] iArr = this.gSBox;
        return iArr[(((i3 >>> 16) & 255) * 2) + 513] ^ ((iArr[((i3 >>> 24) & 255) * 2] ^ iArr[((i3 & 255) * 2) + 1]) ^ iArr[(((i3 >>> 8) & 255) * 2) + 512]);
    }

    private int LFSR1(int i3) {
        return ((i3 & 1) != 0 ? GF256_FDBK_2 : 0) ^ (i3 >> 1);
    }

    private int LFSR2(int i3) {
        return ((i3 >> 2) ^ ((i3 & 2) != 0 ? GF256_FDBK_2 : 0)) ^ ((i3 & 1) != 0 ? GF256_FDBK_4 : 0);
    }

    private int Mx_X(int i3) {
        return i3 ^ LFSR2(i3);
    }

    private int Mx_Y(int i3) {
        return LFSR2(i3) ^ (LFSR1(i3) ^ i3);
    }

    private int RS_MDS_Encode(int i3, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = RS_rem(i10);
        }
        int i12 = i3 ^ i10;
        for (int i13 = 0; i13 < 4; i13++) {
            i12 = RS_rem(i12);
        }
        return i12;
    }

    private int RS_rem(int i3) {
        int i10 = i3 >>> 24;
        int i11 = i10 & 255;
        int i12 = ((i11 << 1) ^ ((i10 & 128) != 0 ? RS_GF_FDBK : 0)) & 255;
        int i13 = ((i11 >>> 1) ^ ((i10 & 1) != 0 ? 166 : 0)) ^ i12;
        return ((((i3 << 8) ^ (i13 << 24)) ^ (i12 << 16)) ^ (i13 << 8)) ^ i11;
    }

    private int b0(int i3) {
        return i3 & 255;
    }

    private int b1(int i3) {
        return (i3 >>> 8) & 255;
    }

    private int b2(int i3) {
        return (i3 >>> 16) & 255;
    }

    private int b3(int i3) {
        return (i3 >>> 24) & 255;
    }

    private void decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i3) ^ this.gSubKeys[4];
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i3 + 4) ^ this.gSubKeys[5];
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i3 + 8) ^ this.gSubKeys[6];
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i3 + 12) ^ this.gSubKeys[7];
        int i11 = 39;
        for (int i12 = 0; i12 < 16; i12 += 2) {
            int Fe32_0 = Fe32_0(littleEndianToInt);
            int Fe32_3 = Fe32_3(littleEndianToInt2);
            int i13 = littleEndianToInt4 ^ (((Fe32_3 * 2) + Fe32_0) + this.gSubKeys[i11]);
            littleEndianToInt3 = Integers.rotateLeft(littleEndianToInt3, 1) ^ ((Fe32_0 + Fe32_3) + this.gSubKeys[i11 - 1]);
            littleEndianToInt4 = Integers.rotateRight(i13, 1);
            int Fe32_02 = Fe32_0(littleEndianToInt3);
            int Fe32_32 = Fe32_3(littleEndianToInt4);
            int i14 = i11 - 3;
            int i15 = littleEndianToInt2 ^ (((Fe32_32 * 2) + Fe32_02) + this.gSubKeys[i11 - 2]);
            i11 -= 4;
            littleEndianToInt = Integers.rotateLeft(littleEndianToInt, 1) ^ ((Fe32_02 + Fe32_32) + this.gSubKeys[i14]);
            littleEndianToInt2 = Integers.rotateRight(i15, 1);
        }
        Pack.intToLittleEndian(littleEndianToInt3 ^ this.gSubKeys[0], bArr2, i10);
        Pack.intToLittleEndian(littleEndianToInt4 ^ this.gSubKeys[1], bArr2, i10 + 4);
        Pack.intToLittleEndian(this.gSubKeys[2] ^ littleEndianToInt, bArr2, i10 + 8);
        Pack.intToLittleEndian(this.gSubKeys[3] ^ littleEndianToInt2, bArr2, i10 + 12);
    }

    private void encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int i11 = 0;
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i3) ^ this.gSubKeys[0];
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i3 + 4) ^ this.gSubKeys[1];
        int i12 = 2;
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i3 + 8) ^ this.gSubKeys[2];
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i3 + 12) ^ this.gSubKeys[3];
        int i13 = 8;
        while (i11 < 16) {
            int Fe32_0 = Fe32_0(littleEndianToInt);
            int Fe32_3 = Fe32_3(littleEndianToInt2);
            littleEndianToInt3 = Integers.rotateRight(littleEndianToInt3 ^ ((Fe32_0 + Fe32_3) + this.gSubKeys[i13]), 1);
            littleEndianToInt4 = Integers.rotateLeft(littleEndianToInt4, 1) ^ (((Fe32_3 * i12) + Fe32_0) + this.gSubKeys[i13 + 1]);
            int Fe32_02 = Fe32_0(littleEndianToInt3);
            int Fe32_32 = Fe32_3(littleEndianToInt4);
            int i14 = i12;
            int i15 = i13 + 3;
            littleEndianToInt = Integers.rotateRight(littleEndianToInt ^ ((Fe32_02 + Fe32_32) + this.gSubKeys[i13 + 2]), 1);
            i13 += 4;
            littleEndianToInt2 = Integers.rotateLeft(littleEndianToInt2, 1) ^ (((Fe32_32 * 2) + Fe32_02) + this.gSubKeys[i15]);
            i11 += 2;
            i12 = i14;
        }
        Pack.intToLittleEndian(this.gSubKeys[4] ^ littleEndianToInt3, bArr2, i10);
        Pack.intToLittleEndian(littleEndianToInt4 ^ this.gSubKeys[5], bArr2, i10 + 4);
        Pack.intToLittleEndian(this.gSubKeys[6] ^ littleEndianToInt, bArr2, i10 + 8);
        Pack.intToLittleEndian(this.gSubKeys[7] ^ littleEndianToInt2, bArr2, i10 + 12);
    }

    private void setKey(byte[] bArr) {
        int b02;
        int b12;
        int b2;
        int b32;
        int i3;
        int i10;
        int i11;
        int i12;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.gSubKeys = new int[40];
        for (int i13 = 0; i13 < this.k64Cnt; i13++) {
            int i14 = i13 * 8;
            iArr[i13] = Pack.littleEndianToInt(bArr, i14);
            int littleEndianToInt = Pack.littleEndianToInt(bArr, i14 + 4);
            iArr2[i13] = littleEndianToInt;
            iArr3[(this.k64Cnt - 1) - i13] = RS_MDS_Encode(iArr[i13], littleEndianToInt);
        }
        for (int i15 = 0; i15 < 20; i15++) {
            int i16 = SK_STEP * i15;
            int F32 = F32(i16, iArr);
            int rotateLeft = Integers.rotateLeft(F32(i16 + 16843009, iArr2), 8);
            int i17 = F32 + rotateLeft;
            int[] iArr4 = this.gSubKeys;
            int i18 = i15 * 2;
            iArr4[i18] = i17;
            int i19 = i17 + rotateLeft;
            iArr4[i18 + 1] = (i19 << 9) | (i19 >>> 23);
        }
        int i20 = iArr3[0];
        int i21 = iArr3[1];
        int i22 = 2;
        int i23 = iArr3[2];
        int i24 = iArr3[3];
        this.gSBox = new int[1024];
        int i25 = 0;
        while (i25 < 256) {
            int i26 = this.k64Cnt & 3;
            if (i26 != 0) {
                if (i26 == 1) {
                    int[] iArr5 = this.gSBox;
                    int i27 = i25 * 2;
                    int[] iArr6 = this.gMDS0;
                    byte[][] bArr2 = f18965P;
                    iArr5[i27] = iArr6[(bArr2[0][i25] & UByte.MAX_VALUE) ^ b0(i20)];
                    this.gSBox[i27 + 1] = this.gMDS1[(bArr2[0][i25] & UByte.MAX_VALUE) ^ b1(i20)];
                    this.gSBox[i27 + 512] = this.gMDS2[(bArr2[1][i25] & UByte.MAX_VALUE) ^ b2(i20)];
                    this.gSBox[i27 + 513] = this.gMDS3[(bArr2[1][i25] & UByte.MAX_VALUE) ^ b3(i20)];
                } else if (i26 == i22) {
                    i12 = i25;
                    i11 = i12;
                    i10 = i11;
                    i3 = i10;
                    int[] iArr7 = this.gSBox;
                    int i28 = i25 * 2;
                    int[] iArr8 = this.gMDS0;
                    byte[][] bArr3 = f18965P;
                    byte[] bArr4 = bArr3[0];
                    iArr7[i28] = iArr8[(bArr4[(bArr4[i11] & UByte.MAX_VALUE) ^ b0(i21)] & UByte.MAX_VALUE) ^ b0(i20)];
                    this.gSBox[i28 + 1] = this.gMDS1[(bArr3[0][(bArr3[1][i10] & UByte.MAX_VALUE) ^ b1(i21)] & UByte.MAX_VALUE) ^ b1(i20)];
                    this.gSBox[i28 + 512] = this.gMDS2[(bArr3[1][(bArr3[0][i3] & UByte.MAX_VALUE) ^ b2(i21)] & UByte.MAX_VALUE) ^ b2(i20)];
                    int[] iArr9 = this.gMDS3;
                    byte[] bArr5 = bArr3[1];
                    this.gSBox[i28 + 513] = iArr9[(bArr5[(bArr5[i12] & UByte.MAX_VALUE) ^ b3(i21)] & UByte.MAX_VALUE) ^ b3(i20)];
                } else if (i26 == 3) {
                    b32 = i25;
                    b02 = b32;
                    b12 = b02;
                    b2 = b12;
                }
                i25++;
                i22 = 2;
            } else {
                byte[][] bArr6 = f18965P;
                b02 = (bArr6[1][i25] & UByte.MAX_VALUE) ^ b0(i24);
                b12 = (bArr6[0][i25] & UByte.MAX_VALUE) ^ b1(i24);
                b2 = (bArr6[0][i25] & UByte.MAX_VALUE) ^ b2(i24);
                b32 = (bArr6[1][i25] & UByte.MAX_VALUE) ^ b3(i24);
            }
            byte[][] bArr7 = f18965P;
            i11 = (bArr7[1][b02] & UByte.MAX_VALUE) ^ b0(i23);
            i10 = (bArr7[1][b12] & UByte.MAX_VALUE) ^ b1(i23);
            i3 = (bArr7[0][b2] & UByte.MAX_VALUE) ^ b2(i23);
            i12 = (bArr7[0][b32] & UByte.MAX_VALUE) ^ b3(i23);
            int[] iArr72 = this.gSBox;
            int i282 = i25 * 2;
            int[] iArr82 = this.gMDS0;
            byte[][] bArr32 = f18965P;
            byte[] bArr42 = bArr32[0];
            iArr72[i282] = iArr82[(bArr42[(bArr42[i11] & UByte.MAX_VALUE) ^ b0(i21)] & UByte.MAX_VALUE) ^ b0(i20)];
            this.gSBox[i282 + 1] = this.gMDS1[(bArr32[0][(bArr32[1][i10] & UByte.MAX_VALUE) ^ b1(i21)] & UByte.MAX_VALUE) ^ b1(i20)];
            this.gSBox[i282 + 512] = this.gMDS2[(bArr32[1][(bArr32[0][i3] & UByte.MAX_VALUE) ^ b2(i21)] & UByte.MAX_VALUE) ^ b2(i20)];
            int[] iArr92 = this.gMDS3;
            byte[] bArr52 = bArr32[1];
            this.gSBox[i282 + 513] = iArr92[(bArr52[(bArr52[i12] & UByte.MAX_VALUE) ^ b3(i21)] & UByte.MAX_VALUE) ^ b3(i20)];
            i25++;
            i22 = 2;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28788);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28789), cipherParameters));
        }
        this.encrypting = z2;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        int length = key.length * 8;
        if (length != 128 && length != 192 && length != 256) {
            throw new IllegalArgumentException(StubApp.getString2(28551));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), length, cipherParameters, Utils.getPurpose(z2)));
        byte[] bArr = this.workingKey;
        this.k64Cnt = bArr.length / 8;
        setKey(bArr);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (this.workingKey == null) {
            throw new IllegalStateException(StubApp.getString2(28790));
        }
        if (i3 + 16 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 16 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        if (this.encrypting) {
            encryptBlock(bArr, i3, bArr2, i10);
            return 16;
        }
        decryptBlock(bArr, i3, bArr2, i10);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.workingKey;
        if (bArr != null) {
            setKey(bArr);
        }
    }
}
