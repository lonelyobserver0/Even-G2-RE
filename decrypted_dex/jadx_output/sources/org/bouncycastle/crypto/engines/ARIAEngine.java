package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.lang.reflect.Array;
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
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ARIAEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;

    /* renamed from: C, reason: collision with root package name */
    private static final byte[][] f18917C = {Hex.decodeStrict(StubApp.getString2(28555)), Hex.decodeStrict(StubApp.getString2(28556)), Hex.decodeStrict(StubApp.getString2(28557))};
    private static final byte[] SB1_sbox = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] SB2_sbox = {-30, 78, 84, -4, -108, -62, 74, -52, 98, 13, 106, 70, 60, 77, -117, -47, 94, -6, 100, -53, -76, -105, -66, 43, PSSSigner.TRAILER_IMPLICIT, 119, 46, 3, -45, 25, 89, -63, 29, 6, 65, 107, 85, -16, -103, 105, -22, -100, 24, -82, 99, -33, -25, -69, 0, 115, 102, -5, -106, 76, -123, -28, 58, 9, 69, -86, 15, -18, Tnaf.POW_2_WIDTH, -21, 45, ByteCompanionObject.MAX_VALUE, -12, 41, -84, -49, -83, -111, -115, 120, -56, -107, -7, 47, -50, -51, 8, 122, -120, 56, 92, -125, 42, 40, 71, -37, -72, -57, -109, -92, 18, 83, -1, -121, 14, 49, 54, 33, 88, 72, 1, -114, 55, 116, 50, -54, -23, -79, -73, -85, 12, -41, -60, 86, 66, 38, 7, -104, 96, -39, -74, -71, 17, 64, -20, 32, -116, -67, -96, -55, -124, 4, 73, 35, -15, 79, 80, 31, 19, -36, -40, -64, -98, 87, -29, -61, 123, 101, 59, 2, -113, 62, -24, 37, -110, -27, 21, -35, -3, 23, -87, -65, -44, -102, 126, -59, 57, 103, -2, 118, -99, 67, -89, -31, -48, -11, 104, -14, 27, 52, 112, 5, -93, -118, -43, 121, -122, -88, 48, -58, 81, 75, 30, -90, 39, -10, 53, -46, 110, 36, 22, -126, 95, -38, -26, 117, -94, -17, 44, -78, 28, -97, 93, 111, ByteCompanionObject.MIN_VALUE, 10, 114, 68, -101, 108, -112, 11, 91, 51, 125, 90, 82, -13, 97, -95, -9, -80, -42, 63, 124, 109, -19, 20, -32, -91, Base64.padSymbol, 34, -77, -8, -119, -34, 113, 26, -81, -70, -75, -127};
    private static final byte[] SB3_sbox = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, ByteCompanionObject.MIN_VALUE, -20, 95, 96, 81, ByteCompanionObject.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final byte[] SB4_sbox = {48, 104, -103, 27, -121, -71, 33, 120, 80, 57, -37, -31, 114, 9, 98, 60, 62, 126, 94, -114, -15, -96, -52, -93, 42, 29, -5, -74, -42, 32, -60, -115, -127, 101, -11, -119, -53, -99, 119, -58, 87, 67, 86, 23, -44, 64, 26, 77, -64, 99, 108, -29, -73, -56, 100, 106, 83, -86, 56, -104, 12, -12, -101, -19, ByteCompanionObject.MAX_VALUE, 34, 118, -81, -35, 58, 11, 88, 103, -120, 6, -61, 53, 13, 1, -117, -116, -62, -26, 95, 2, 36, 117, -109, 102, 30, -27, -30, 84, -40, Tnaf.POW_2_WIDTH, -50, 122, -24, 8, 44, 18, -105, 50, -85, -76, 39, 10, 35, -33, -17, -54, -39, -72, -6, -36, 49, 107, -47, -83, 25, 73, -67, 81, -106, -18, -28, -88, 65, -38, -1, -51, 85, -122, 54, -66, 97, 82, -8, -69, 14, -126, 72, 105, -102, -32, 71, -98, 92, 4, 75, 52, 21, 121, 38, -89, -34, 41, -82, -110, -41, -124, -23, -46, -70, 93, -13, -59, -80, -65, -92, 59, 113, 68, 70, 43, -4, -21, 111, -43, -10, 20, -2, 124, 112, 90, 125, -3, 47, 24, -125, 22, -91, -111, 31, 5, -107, 116, -87, -63, 91, 74, -123, 109, 19, 7, 79, 78, 69, -78, 15, -55, 28, -90, PSSSigner.TRAILER_IMPLICIT, -20, 115, -112, 123, -49, 89, -113, -95, -7, 45, -14, -79, 0, -108, 55, -97, -48, 46, -100, 110, 40, 63, ByteCompanionObject.MIN_VALUE, -16, Base64.padSymbol, -45, 37, -118, -75, -25, 66, -77, -57, -22, -9, 76, 17, 51, 3, -94, -84, 96};
    boolean forEncryption;
    private byte[][] roundKeys;

    public ARIAEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
    }

    public static void A(byte[] bArr) {
        byte b2 = bArr[0];
        byte b10 = bArr[1];
        byte b11 = bArr[2];
        byte b12 = bArr[3];
        byte b13 = bArr[4];
        byte b14 = bArr[5];
        byte b15 = bArr[6];
        byte b16 = bArr[7];
        byte b17 = bArr[8];
        byte b18 = bArr[9];
        byte b19 = bArr[10];
        byte b20 = bArr[11];
        byte b21 = bArr[12];
        byte b22 = bArr[13];
        byte b23 = bArr[14];
        byte b24 = bArr[15];
        bArr[0] = (byte) ((((((b12 ^ b13) ^ b15) ^ b17) ^ b18) ^ b22) ^ b23);
        bArr[1] = (byte) ((((((b11 ^ b14) ^ b16) ^ b17) ^ b18) ^ b21) ^ b24);
        bArr[2] = (byte) ((((((b10 ^ b13) ^ b15) ^ b19) ^ b20) ^ b21) ^ b24);
        bArr[3] = (byte) ((((((b2 ^ b14) ^ b16) ^ b19) ^ b20) ^ b22) ^ b23);
        int i3 = b2 ^ b11;
        bArr[4] = (byte) (((((i3 ^ b14) ^ b17) ^ b20) ^ b23) ^ b24);
        int i10 = b10 ^ b12;
        bArr[5] = (byte) (((((i10 ^ b13) ^ b18) ^ b19) ^ b23) ^ b24);
        bArr[6] = (byte) (((((i3 ^ b16) ^ b18) ^ b19) ^ b21) ^ b22);
        bArr[7] = (byte) (((((i10 ^ b15) ^ b17) ^ b20) ^ b21) ^ b22);
        int i11 = b2 ^ b10;
        bArr[8] = (byte) (((((i11 ^ b13) ^ b16) ^ b19) ^ b22) ^ b24);
        bArr[9] = (byte) (((((i11 ^ b14) ^ b15) ^ b20) ^ b21) ^ b23);
        int i12 = b11 ^ b12;
        bArr[10] = (byte) (((((i12 ^ b14) ^ b15) ^ b17) ^ b22) ^ b24);
        bArr[11] = (byte) (((((i12 ^ b13) ^ b16) ^ b18) ^ b21) ^ b23);
        int i13 = b10 ^ b11;
        bArr[12] = (byte) (((((i13 ^ b15) ^ b16) ^ b18) ^ b20) ^ b21);
        int i14 = b2 ^ b12;
        bArr[13] = (byte) (((((i14 ^ b15) ^ b16) ^ b17) ^ b19) ^ b22);
        bArr[14] = (byte) (((((i14 ^ b13) ^ b14) ^ b18) ^ b20) ^ b23);
        bArr[15] = (byte) (((((i13 ^ b13) ^ b14) ^ b17) ^ b19) ^ b24);
    }

    public static void FE(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL2(bArr);
        A(bArr);
    }

    public static void FO(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL1(bArr);
        A(bArr);
    }

    public static byte SB1(byte b2) {
        return SB1_sbox[b2 & UByte.MAX_VALUE];
    }

    public static byte SB2(byte b2) {
        return SB2_sbox[b2 & UByte.MAX_VALUE];
    }

    public static byte SB3(byte b2) {
        return SB3_sbox[b2 & UByte.MAX_VALUE];
    }

    public static byte SB4(byte b2) {
        return SB4_sbox[b2 & UByte.MAX_VALUE];
    }

    public static void SL1(byte[] bArr) {
        bArr[0] = SB1(bArr[0]);
        bArr[1] = SB2(bArr[1]);
        bArr[2] = SB3(bArr[2]);
        bArr[3] = SB4(bArr[3]);
        bArr[4] = SB1(bArr[4]);
        bArr[5] = SB2(bArr[5]);
        bArr[6] = SB3(bArr[6]);
        bArr[7] = SB4(bArr[7]);
        bArr[8] = SB1(bArr[8]);
        bArr[9] = SB2(bArr[9]);
        bArr[10] = SB3(bArr[10]);
        bArr[11] = SB4(bArr[11]);
        bArr[12] = SB1(bArr[12]);
        bArr[13] = SB2(bArr[13]);
        bArr[14] = SB3(bArr[14]);
        bArr[15] = SB4(bArr[15]);
    }

    public static void SL2(byte[] bArr) {
        bArr[0] = SB3(bArr[0]);
        bArr[1] = SB4(bArr[1]);
        bArr[2] = SB1(bArr[2]);
        bArr[3] = SB2(bArr[3]);
        bArr[4] = SB3(bArr[4]);
        bArr[5] = SB4(bArr[5]);
        bArr[6] = SB1(bArr[6]);
        bArr[7] = SB2(bArr[7]);
        bArr[8] = SB3(bArr[8]);
        bArr[9] = SB4(bArr[9]);
        bArr[10] = SB1(bArr[10]);
        bArr[11] = SB2(bArr[11]);
        bArr[12] = SB3(bArr[12]);
        bArr[13] = SB4(bArr[13]);
        bArr[14] = SB1(bArr[14]);
        bArr[15] = SB2(bArr[15]);
    }

    private int bitsOfSecurity() {
        byte[][] bArr = this.roundKeys;
        if (bArr.length > 13) {
            return bArr.length > 15 ? 256 : 192;
        }
        return 128;
    }

    public static byte[][] keySchedule(boolean z2, byte[] bArr) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28551));
        }
        int i3 = length >>> 3;
        int i10 = i3 - 2;
        byte[][] bArr2 = f18917C;
        byte[] bArr3 = bArr2[i10];
        byte[] bArr4 = bArr2[(i3 - 1) % 3];
        byte[] bArr5 = bArr2[i3 % 3];
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        System.arraycopy(bArr, 0, bArr6, 0, 16);
        System.arraycopy(bArr, 16, bArr7, 0, length - 16);
        byte[] bArr8 = new byte[16];
        byte[] bArr9 = new byte[16];
        byte[] bArr10 = new byte[16];
        byte[] bArr11 = new byte[16];
        System.arraycopy(bArr6, 0, bArr8, 0, 16);
        System.arraycopy(bArr8, 0, bArr9, 0, 16);
        FO(bArr9, bArr3);
        xor(bArr9, bArr7);
        System.arraycopy(bArr9, 0, bArr10, 0, 16);
        FE(bArr10, bArr4);
        xor(bArr10, bArr8);
        System.arraycopy(bArr10, 0, bArr11, 0, 16);
        FO(bArr11, bArr5);
        xor(bArr11, bArr9);
        int i11 = i10 * 2;
        int i12 = i11 + 12;
        byte[][] bArr12 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11 + 13, 16);
        keyScheduleRound(bArr12[0], bArr8, bArr9, 19);
        keyScheduleRound(bArr12[1], bArr9, bArr10, 19);
        keyScheduleRound(bArr12[2], bArr10, bArr11, 19);
        keyScheduleRound(bArr12[3], bArr11, bArr8, 19);
        keyScheduleRound(bArr12[4], bArr8, bArr9, 31);
        keyScheduleRound(bArr12[5], bArr9, bArr10, 31);
        keyScheduleRound(bArr12[6], bArr10, bArr11, 31);
        keyScheduleRound(bArr12[7], bArr11, bArr8, 31);
        keyScheduleRound(bArr12[8], bArr8, bArr9, 67);
        keyScheduleRound(bArr12[9], bArr9, bArr10, 67);
        keyScheduleRound(bArr12[10], bArr10, bArr11, 67);
        keyScheduleRound(bArr12[11], bArr11, bArr8, 67);
        keyScheduleRound(bArr12[12], bArr8, bArr9, 97);
        if (i12 > 12) {
            keyScheduleRound(bArr12[13], bArr9, bArr10, 97);
            keyScheduleRound(bArr12[14], bArr10, bArr11, 97);
            if (i12 > 14) {
                keyScheduleRound(bArr12[15], bArr11, bArr8, 97);
                keyScheduleRound(bArr12[16], bArr8, bArr9, 109);
            }
        }
        if (!z2) {
            reverseKeys(bArr12);
            for (int i13 = 1; i13 < i12; i13++) {
                A(bArr12[i13]);
            }
        }
        return bArr12;
    }

    public static void keyScheduleRound(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3) {
        int i10 = i3 >>> 3;
        int i11 = i3 & 7;
        int i12 = 8 - i11;
        int i13 = bArr3[15 - i10] & 255;
        int i14 = 0;
        while (i14 < 16) {
            int i15 = bArr3[(i14 - i10) & 15] & 255;
            bArr[i14] = (byte) (((i13 << i12) | (i15 >>> i11)) ^ (bArr2[i14] & 255));
            i14++;
            i13 = i15;
        }
    }

    public static void reverseKeys(byte[][] bArr) {
        int length = bArr.length;
        int i3 = length / 2;
        int i10 = length - 1;
        for (int i11 = 0; i11 < i3; i11++) {
            byte[] bArr2 = bArr[i11];
            int i12 = i10 - i11;
            bArr[i11] = bArr[i12];
            bArr[i12] = bArr2;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < 16; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28558);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28559), cipherParameters));
        }
        this.forEncryption = z2;
        this.roundKeys = keySchedule(z2, ((KeyParameter) cipherParameters).getKey());
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        if (this.roundKeys == null) {
            throw new IllegalStateException(StubApp.getString2(28560));
        }
        if (i3 > bArr.length - 16) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 > bArr2.length - 16) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, i3, bArr3, 0, 16);
        int length = this.roundKeys.length - 3;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            FO(bArr3, this.roundKeys[i11]);
            i11 += 2;
            FE(bArr3, this.roundKeys[i12]);
        }
        FO(bArr3, this.roundKeys[i11]);
        xor(bArr3, this.roundKeys[i11 + 1]);
        SL2(bArr3);
        xor(bArr3, this.roundKeys[i11 + 2]);
        System.arraycopy(bArr3, 0, bArr2, i10, 16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
