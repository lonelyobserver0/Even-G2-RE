package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CamelliaLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 255;
    private int _keySize;
    private boolean forEncryption;
    private static final int[] SIGMA = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};
    private static final byte[] SBOX1 = {112, -126, 44, -20, -77, 39, -64, -27, -28, -123, 87, 53, -22, 12, -82, 65, 35, -17, 107, -109, 69, 25, -91, 33, -19, 14, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, 31, -50, 62, 48, -36, 95, 94, -59, 11, 26, -90, -31, 57, -54, -43, 71, 93, Base64.padSymbol, -39, 1, 90, -42, 81, 86, 108, 77, -117, 13, -102, 102, -5, -52, -80, 45, 116, 18, 43, 32, -16, -79, -124, -103, -33, 76, -53, -62, 52, 126, 118, 5, 109, -73, -87, 49, -47, 23, 4, -41, 20, 88, 58, 97, -34, 27, 17, 28, 50, 15, -100, 22, 83, 24, -14, 34, -2, 68, -49, -78, -61, -75, 122, -111, 36, 8, -24, -88, 96, -4, 105, 80, -86, -48, -96, 125, -95, -119, 98, -105, 84, 91, 30, -107, -32, -1, 100, -46, Tnaf.POW_2_WIDTH, -60, 0, 72, -93, -9, 117, -37, -118, 3, -26, -38, 9, 63, -35, -108, -121, 92, -125, 2, -51, 74, -112, 51, 115, 103, -10, -13, -99, ByteCompanionObject.MAX_VALUE, -65, -30, 82, -101, -40, 38, -56, 55, -58, 59, -127, -106, 111, 75, 19, -66, 99, 46, -23, 121, -89, -116, -97, 110, PSSSigner.TRAILER_IMPLICIT, -114, 41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, 37, -85, 66, -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, 42, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, 21, -29, -83, -12, 119, -57, ByteCompanionObject.MIN_VALUE, -98};
    private boolean initialized = false;
    private int[] subkey = new int[96];
    private int[] kw = new int[8];
    private int[] ke = new int[12];

    public CamelliaLightEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private int bitsOfSecurity() {
        return this._keySize * 8;
    }

    private int bytes2int(byte[] bArr, int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) + (bArr[i11 + i3] & UByte.MAX_VALUE);
        }
        return i10;
    }

    private void camelliaF2(int[] iArr, int[] iArr2, int i3) {
        int i10 = iArr[0] ^ iArr2[i3];
        int sbox4 = sbox4(i10 & 255) | (sbox3((i10 >>> 8) & 255) << 8) | (sbox2((i10 >>> 16) & 255) << 16);
        byte[] bArr = SBOX1;
        int i11 = ((bArr[(i10 >>> 24) & 255] & UByte.MAX_VALUE) << 24) | sbox4;
        int i12 = iArr[1] ^ iArr2[i3 + 1];
        int leftRotate = leftRotate((sbox2((i12 >>> 24) & 255) << 24) | (bArr[i12 & 255] & UByte.MAX_VALUE) | (sbox4((i12 >>> 8) & 255) << 8) | (sbox3((i12 >>> 16) & 255) << 16), 8);
        int i13 = i11 ^ leftRotate;
        int leftRotate2 = leftRotate(leftRotate, 8) ^ i13;
        int rightRotate = rightRotate(i13, 8) ^ leftRotate2;
        iArr[2] = (leftRotate(leftRotate2, 16) ^ rightRotate) ^ iArr[2];
        iArr[3] = leftRotate(rightRotate, 8) ^ iArr[3];
        int i14 = iArr[2] ^ iArr2[i3 + 2];
        int sbox42 = ((bArr[(i14 >>> 24) & 255] & UByte.MAX_VALUE) << 24) | sbox4(i14 & 255) | (sbox3((i14 >>> 8) & 255) << 8) | (sbox2((i14 >>> 16) & 255) << 16);
        int i15 = iArr2[i3 + 3] ^ iArr[3];
        int leftRotate3 = leftRotate((sbox2((i15 >>> 24) & 255) << 24) | (bArr[i15 & 255] & UByte.MAX_VALUE) | (sbox4((i15 >>> 8) & 255) << 8) | (sbox3((i15 >>> 16) & 255) << 16), 8);
        int i16 = sbox42 ^ leftRotate3;
        int leftRotate4 = leftRotate(leftRotate3, 8) ^ i16;
        int rightRotate2 = rightRotate(i16, 8) ^ leftRotate4;
        iArr[0] = (leftRotate(leftRotate4, 16) ^ rightRotate2) ^ iArr[0];
        iArr[1] = iArr[1] ^ leftRotate(rightRotate2, 8);
    }

    private void camelliaFLs(int[] iArr, int[] iArr2, int i3) {
        int leftRotate = iArr[1] ^ leftRotate(iArr[0] & iArr2[i3], 1);
        iArr[1] = leftRotate;
        iArr[0] = (leftRotate | iArr2[i3 + 1]) ^ iArr[0];
        int i10 = iArr[2];
        int i11 = iArr2[i3 + 3];
        int i12 = iArr[3];
        int i13 = i10 ^ (i11 | i12);
        iArr[2] = i13;
        iArr[3] = leftRotate(iArr2[i3 + 2] & i13, 1) ^ i12;
    }

    private static void decroldq(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = i11 + 2;
        int i13 = i10 + 1;
        int i14 = 32 - i3;
        iArr2[i12] = (iArr[i10] << i3) | (iArr[i13] >>> i14);
        int i15 = i11 + 3;
        int i16 = i10 + 2;
        iArr2[i15] = (iArr[i13] << i3) | (iArr[i16] >>> i14);
        int i17 = i10 + 3;
        iArr2[i11] = (iArr[i16] << i3) | (iArr[i17] >>> i14);
        int i18 = i11 + 1;
        iArr2[i18] = (iArr[i17] << i3) | (iArr[i10] >>> i14);
        iArr[i10] = iArr2[i12];
        iArr[i13] = iArr2[i15];
        iArr[i16] = iArr2[i11];
        iArr[i17] = iArr2[i18];
    }

    private static void decroldqo32(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = i11 + 2;
        int i13 = i10 + 1;
        int i14 = i3 - 32;
        int i15 = i10 + 2;
        int i16 = 64 - i3;
        iArr2[i12] = (iArr[i13] << i14) | (iArr[i15] >>> i16);
        int i17 = i11 + 3;
        int i18 = i10 + 3;
        iArr2[i17] = (iArr[i15] << i14) | (iArr[i18] >>> i16);
        iArr2[i11] = (iArr[i18] << i14) | (iArr[i10] >>> i16);
        int i19 = i11 + 1;
        iArr2[i19] = (iArr[i13] >>> i16) | (iArr[i10] << i14);
        iArr[i10] = iArr2[i12];
        iArr[i13] = iArr2[i17];
        iArr[i15] = iArr2[i11];
        iArr[i18] = iArr2[i19];
    }

    private void int2bytes(int i3, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[(3 - i11) + i10] = (byte) i3;
            i3 >>>= 8;
        }
    }

    private byte lRot8(byte b2, int i3) {
        return (byte) (((b2 & 255) >>> (8 - i3)) | (b2 << i3));
    }

    private static int leftRotate(int i3, int i10) {
        return (i3 << i10) + (i3 >>> (32 - i10));
    }

    private int processBlock128(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] iArr = new int[4];
        for (int i11 = 0; i11 < 4; i11++) {
            iArr[i11] = bytes2int(bArr, (i11 * 4) + i3) ^ this.kw[i11];
        }
        camelliaF2(iArr, this.subkey, 0);
        camelliaF2(iArr, this.subkey, 4);
        camelliaF2(iArr, this.subkey, 8);
        camelliaFLs(iArr, this.ke, 0);
        camelliaF2(iArr, this.subkey, 12);
        camelliaF2(iArr, this.subkey, 16);
        camelliaF2(iArr, this.subkey, 20);
        camelliaFLs(iArr, this.ke, 4);
        camelliaF2(iArr, this.subkey, 24);
        camelliaF2(iArr, this.subkey, 28);
        camelliaF2(iArr, this.subkey, 32);
        int i12 = iArr[2];
        int[] iArr2 = this.kw;
        int i13 = iArr2[4] ^ i12;
        iArr[2] = i13;
        iArr[3] = iArr[3] ^ iArr2[5];
        iArr[0] = iArr[0] ^ iArr2[6];
        iArr[1] = iArr2[7] ^ iArr[1];
        int2bytes(i13, bArr2, i10);
        int2bytes(iArr[3], bArr2, i10 + 4);
        int2bytes(iArr[0], bArr2, i10 + 8);
        int2bytes(iArr[1], bArr2, i10 + 12);
        return 16;
    }

    private int processBlock192or256(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[] iArr = new int[4];
        for (int i11 = 0; i11 < 4; i11++) {
            iArr[i11] = bytes2int(bArr, (i11 * 4) + i3) ^ this.kw[i11];
        }
        camelliaF2(iArr, this.subkey, 0);
        camelliaF2(iArr, this.subkey, 4);
        camelliaF2(iArr, this.subkey, 8);
        camelliaFLs(iArr, this.ke, 0);
        camelliaF2(iArr, this.subkey, 12);
        camelliaF2(iArr, this.subkey, 16);
        camelliaF2(iArr, this.subkey, 20);
        camelliaFLs(iArr, this.ke, 4);
        camelliaF2(iArr, this.subkey, 24);
        camelliaF2(iArr, this.subkey, 28);
        camelliaF2(iArr, this.subkey, 32);
        camelliaFLs(iArr, this.ke, 8);
        camelliaF2(iArr, this.subkey, 36);
        camelliaF2(iArr, this.subkey, 40);
        camelliaF2(iArr, this.subkey, 44);
        int i12 = iArr[2];
        int[] iArr2 = this.kw;
        int i13 = i12 ^ iArr2[4];
        iArr[2] = i13;
        iArr[3] = iArr[3] ^ iArr2[5];
        iArr[0] = iArr[0] ^ iArr2[6];
        iArr[1] = iArr2[7] ^ iArr[1];
        int2bytes(i13, bArr2, i10);
        int2bytes(iArr[3], bArr2, i10 + 4);
        int2bytes(iArr[0], bArr2, i10 + 8);
        int2bytes(iArr[1], bArr2, i10 + 12);
        return 16;
    }

    private static int rightRotate(int i3, int i10) {
        return (i3 >>> i10) + (i3 << (32 - i10));
    }

    private static void roldq(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = i10 + 1;
        int i13 = 32 - i3;
        iArr2[i11] = (iArr[i10] << i3) | (iArr[i12] >>> i13);
        int i14 = i11 + 1;
        int i15 = i10 + 2;
        iArr2[i14] = (iArr[i12] << i3) | (iArr[i15] >>> i13);
        int i16 = i11 + 2;
        int i17 = i10 + 3;
        iArr2[i16] = (iArr[i15] << i3) | (iArr[i17] >>> i13);
        int i18 = i11 + 3;
        iArr2[i18] = (iArr[i17] << i3) | (iArr[i10] >>> i13);
        iArr[i10] = iArr2[i11];
        iArr[i12] = iArr2[i14];
        iArr[i15] = iArr2[i16];
        iArr[i17] = iArr2[i18];
    }

    private static void roldqo32(int i3, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = i10 + 1;
        int i13 = i3 - 32;
        int i14 = i10 + 2;
        int i15 = 64 - i3;
        iArr2[i11] = (iArr[i12] << i13) | (iArr[i14] >>> i15);
        int i16 = i11 + 1;
        int i17 = i10 + 3;
        iArr2[i16] = (iArr[i14] << i13) | (iArr[i17] >>> i15);
        int i18 = i11 + 2;
        iArr2[i18] = (iArr[i17] << i13) | (iArr[i10] >>> i15);
        int i19 = i11 + 3;
        iArr2[i19] = (iArr[i12] >>> i15) | (iArr[i10] << i13);
        iArr[i10] = iArr2[i11];
        iArr[i12] = iArr2[i16];
        iArr[i14] = iArr2[i18];
        iArr[i17] = iArr2[i19];
    }

    private int sbox2(int i3) {
        return lRot8(SBOX1[i3], 1) & UByte.MAX_VALUE;
    }

    private int sbox3(int i3) {
        return lRot8(SBOX1[i3], 7) & UByte.MAX_VALUE;
    }

    private int sbox4(int i3) {
        return SBOX1[lRot8((byte) i3, 1) & UByte.MAX_VALUE] & UByte.MAX_VALUE;
    }

    private void setKey(boolean z2, byte[] bArr) {
        this.forEncryption = z2;
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        this._keySize = bArr.length;
        int length = bArr.length;
        if (length == 16) {
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        } else if (length == 24) {
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[4] = bytes2int(bArr, 16);
            int bytes2int = bytes2int(bArr, 20);
            iArr[5] = bytes2int;
            iArr[6] = ~iArr[4];
            iArr[7] = ~bytes2int;
        } else {
            if (length != 32) {
                throw new IllegalArgumentException(StubApp.getString2(28569));
            }
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[4] = bytes2int(bArr, 16);
            iArr[5] = bytes2int(bArr, 20);
            iArr[6] = bytes2int(bArr, 24);
            iArr[7] = bytes2int(bArr, 28);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            iArr2[i3] = iArr[i3] ^ iArr[i3 + 4];
        }
        camelliaF2(iArr2, SIGMA, 0);
        for (int i10 = 0; i10 < 4; i10++) {
            iArr2[i10] = iArr2[i10] ^ iArr[i10];
        }
        camelliaF2(iArr2, SIGMA, 4);
        if (this._keySize == 16) {
            if (z2) {
                int[] iArr5 = this.kw;
                iArr5[0] = iArr[0];
                iArr5[1] = iArr[1];
                iArr5[2] = iArr[2];
                iArr5[3] = iArr[3];
                roldq(15, iArr, 0, this.subkey, 4);
                roldq(30, iArr, 0, this.subkey, 12);
                roldq(15, iArr, 0, iArr4, 0);
                int[] iArr6 = this.subkey;
                iArr6[18] = iArr4[2];
                iArr6[19] = iArr4[3];
                roldq(17, iArr, 0, this.ke, 4);
                roldq(17, iArr, 0, this.subkey, 24);
                roldq(17, iArr, 0, this.subkey, 32);
                int[] iArr7 = this.subkey;
                iArr7[0] = iArr2[0];
                iArr7[1] = iArr2[1];
                iArr7[2] = iArr2[2];
                iArr7[3] = iArr2[3];
                roldq(15, iArr2, 0, iArr7, 8);
                roldq(15, iArr2, 0, this.ke, 0);
                roldq(15, iArr2, 0, iArr4, 0);
                int[] iArr8 = this.subkey;
                iArr8[16] = iArr4[0];
                iArr8[17] = iArr4[1];
                roldq(15, iArr2, 0, iArr8, 20);
                roldqo32(34, iArr2, 0, this.subkey, 28);
                roldq(17, iArr2, 0, this.kw, 4);
                return;
            }
            int[] iArr9 = this.kw;
            iArr9[4] = iArr[0];
            iArr9[5] = iArr[1];
            iArr9[6] = iArr[2];
            iArr9[7] = iArr[3];
            decroldq(15, iArr, 0, this.subkey, 28);
            decroldq(30, iArr, 0, this.subkey, 20);
            decroldq(15, iArr, 0, iArr4, 0);
            int[] iArr10 = this.subkey;
            iArr10[16] = iArr4[0];
            iArr10[17] = iArr4[1];
            decroldq(17, iArr, 0, this.ke, 0);
            decroldq(17, iArr, 0, this.subkey, 8);
            decroldq(17, iArr, 0, this.subkey, 0);
            int[] iArr11 = this.subkey;
            iArr11[34] = iArr2[0];
            iArr11[35] = iArr2[1];
            iArr11[32] = iArr2[2];
            iArr11[33] = iArr2[3];
            decroldq(15, iArr2, 0, iArr11, 24);
            decroldq(15, iArr2, 0, this.ke, 4);
            decroldq(15, iArr2, 0, iArr4, 0);
            int[] iArr12 = this.subkey;
            iArr12[18] = iArr4[2];
            iArr12[19] = iArr4[3];
            decroldq(15, iArr2, 0, iArr12, 12);
            decroldqo32(34, iArr2, 0, this.subkey, 4);
            roldq(17, iArr2, 0, this.kw, 0);
            return;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            iArr3[i11] = iArr2[i11] ^ iArr[i11 + 4];
        }
        camelliaF2(iArr3, SIGMA, 8);
        if (z2) {
            int[] iArr13 = this.kw;
            iArr13[0] = iArr[0];
            iArr13[1] = iArr[1];
            iArr13[2] = iArr[2];
            iArr13[3] = iArr[3];
            roldqo32(45, iArr, 0, this.subkey, 16);
            roldq(15, iArr, 0, this.ke, 4);
            roldq(17, iArr, 0, this.subkey, 32);
            roldqo32(34, iArr, 0, this.subkey, 44);
            roldq(15, iArr, 4, this.subkey, 4);
            roldq(15, iArr, 4, this.ke, 0);
            roldq(30, iArr, 4, this.subkey, 24);
            roldqo32(34, iArr, 4, this.subkey, 36);
            roldq(15, iArr2, 0, this.subkey, 8);
            roldq(30, iArr2, 0, this.subkey, 20);
            int[] iArr14 = this.ke;
            iArr14[8] = iArr2[1];
            iArr14[9] = iArr2[2];
            iArr14[10] = iArr2[3];
            iArr14[11] = iArr2[0];
            roldqo32(49, iArr2, 0, this.subkey, 40);
            int[] iArr15 = this.subkey;
            iArr15[0] = iArr3[0];
            iArr15[1] = iArr3[1];
            iArr15[2] = iArr3[2];
            iArr15[3] = iArr3[3];
            roldq(30, iArr3, 0, iArr15, 12);
            roldq(30, iArr3, 0, this.subkey, 28);
            roldqo32(51, iArr3, 0, this.kw, 4);
            return;
        }
        int[] iArr16 = this.kw;
        iArr16[4] = iArr[0];
        iArr16[5] = iArr[1];
        iArr16[6] = iArr[2];
        iArr16[7] = iArr[3];
        decroldqo32(45, iArr, 0, this.subkey, 28);
        decroldq(15, iArr, 0, this.ke, 4);
        decroldq(17, iArr, 0, this.subkey, 12);
        decroldqo32(34, iArr, 0, this.subkey, 0);
        decroldq(15, iArr, 4, this.subkey, 40);
        decroldq(15, iArr, 4, this.ke, 8);
        decroldq(30, iArr, 4, this.subkey, 20);
        decroldqo32(34, iArr, 4, this.subkey, 8);
        decroldq(15, iArr2, 0, this.subkey, 36);
        decroldq(30, iArr2, 0, this.subkey, 24);
        int[] iArr17 = this.ke;
        iArr17[2] = iArr2[1];
        iArr17[3] = iArr2[2];
        iArr17[0] = iArr2[3];
        iArr17[1] = iArr2[0];
        decroldqo32(49, iArr2, 0, this.subkey, 4);
        int[] iArr18 = this.subkey;
        iArr18[46] = iArr3[0];
        iArr18[47] = iArr3[1];
        iArr18[44] = iArr3[2];
        iArr18[45] = iArr3[3];
        decroldq(30, iArr3, 0, iArr18, 32);
        decroldq(30, iArr3, 0, this.subkey, 16);
        roldqo32(51, iArr3, 0, this.kw, 0);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28258);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(28570));
        }
        setKey(z2, ((KeyParameter) cipherParameters).getKey());
        this.initialized = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws IllegalStateException {
        if (!this.initialized) {
            throw new IllegalStateException(StubApp.getString2(28572));
        }
        if (i3 + 16 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 + 16 <= bArr2.length) {
            return this._keySize == 16 ? processBlock128(bArr, i3, bArr2, i10) : processBlock192or256(bArr, i3, bArr2, i10);
        }
        throw new OutputLengthException(StubApp.getString2(28306));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
