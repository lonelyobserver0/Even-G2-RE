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
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f18913m1 = -2139062144;

    /* renamed from: m2, reason: collision with root package name */
    private static final int f18914m2 = 2139062143;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f18915m3 = 27;
    private static final int m4 = -1061109568;

    /* renamed from: m5, reason: collision with root package name */
    private static final int f18916m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f18912S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, ByteCompanionObject.MIN_VALUE, -20, 95, 96, 81, ByteCompanionObject.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};

    public AESLightEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private static int FFmulX(int i3) {
        return (((i3 & f18913m1) >>> 7) * 27) ^ ((f18914m2 & i3) << 1);
    }

    private static int FFmulX2(int i3) {
        int i10 = (f18916m5 & i3) << 2;
        int i11 = i3 & m4;
        int i12 = i11 ^ (i11 >>> 1);
        return (i12 >>> 5) ^ (i10 ^ (i12 >>> 2));
    }

    private int bitsOfSecurity() {
        if (this.WorkingKey == null) {
            return 256;
        }
        return (r0.length - 7) << 5;
    }

    private void decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10, int[][] iArr) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i3);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i3 + 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i3 + 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i3 + 12);
        int i11 = this.ROUNDS;
        int[] iArr2 = iArr[i11];
        char c10 = 0;
        int i12 = littleEndianToInt ^ iArr2[0];
        int i13 = 1;
        int i14 = littleEndianToInt2 ^ iArr2[1];
        int i15 = littleEndianToInt3 ^ iArr2[2];
        int i16 = i11 - 1;
        int i17 = littleEndianToInt4 ^ iArr2[3];
        while (i16 > i13) {
            byte[] bArr3 = Si;
            int inv_mcol = inv_mcol((((bArr3[i12 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(i17 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i15 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i14 >> 24) & 255] << 24)) ^ iArr[i16][c10];
            int inv_mcol2 = inv_mcol((((bArr3[i14 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(i12 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i17 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i15 >> 24) & 255] << 24)) ^ iArr[i16][i13];
            char c11 = c10;
            int inv_mcol3 = inv_mcol(((((bArr3[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8) ^ (bArr3[i15 & 255] & UByte.MAX_VALUE)) ^ ((bArr3[(i12 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i17 >> 24) & 255] << 24)) ^ iArr[i16][2];
            int inv_mcol4 = inv_mcol((((bArr3[i17 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(i15 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i12 >> 24) & 255] << 24));
            int i18 = i16 - 1;
            int i19 = inv_mcol4 ^ iArr[i16][3];
            int inv_mcol5 = inv_mcol((((bArr3[inv_mcol & 255] & UByte.MAX_VALUE) ^ ((bArr3[(i19 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(inv_mcol3 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(inv_mcol2 >> 24) & 255] << 24)) ^ iArr[i18][c11];
            int inv_mcol6 = inv_mcol((((bArr3[inv_mcol2 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(inv_mcol >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i19 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(inv_mcol3 >> 24) & 255] << 24)) ^ iArr[i18][i13];
            int i20 = i13;
            int inv_mcol7 = inv_mcol(((((bArr3[(inv_mcol2 >> 8) & 255] & UByte.MAX_VALUE) << 8) ^ (bArr3[inv_mcol3 & 255] & UByte.MAX_VALUE)) ^ ((bArr3[(inv_mcol >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i19 >> 24) & 255] << 24)) ^ iArr[i18][2];
            i16 -= 2;
            i17 = inv_mcol((((bArr3[i19 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(inv_mcol3 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(inv_mcol2 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(inv_mcol >> 24) & 255] << 24)) ^ iArr[i18][3];
            c10 = c11;
            i12 = inv_mcol5;
            i14 = inv_mcol6;
            i15 = inv_mcol7;
            i13 = i20;
        }
        char c12 = c10;
        int i21 = i13;
        byte[] bArr4 = Si;
        int inv_mcol8 = inv_mcol((((bArr4[i12 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i17 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i15 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i14 >> 24) & 255] << 24)) ^ iArr[i16][c12];
        int inv_mcol9 = inv_mcol((((bArr4[i14 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i12 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i17 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i15 >> 24) & 255] << 24)) ^ iArr[i16][i21];
        int inv_mcol10 = inv_mcol((((bArr4[i15 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i12 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i17 >> 24) & 255] << 24)) ^ iArr[i16][2];
        int inv_mcol11 = inv_mcol((((bArr4[i17 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i15 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i12 >> 24) & 255] << 24)) ^ iArr[i16][3];
        int i22 = (((bArr4[inv_mcol8 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(inv_mcol11 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(inv_mcol10 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(inv_mcol9 >> 24) & 255] << 24);
        int[] iArr3 = iArr[c12];
        int i23 = i22 ^ iArr3[c12];
        int i24 = ((((bArr4[inv_mcol9 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(inv_mcol8 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(inv_mcol11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(inv_mcol10 >> 24) & 255] << 24)) ^ iArr3[i21];
        int i25 = ((((bArr4[inv_mcol10 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(inv_mcol9 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(inv_mcol8 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(inv_mcol11 >> 24) & 255] << 24)) ^ iArr3[2];
        int i26 = ((((bArr4[inv_mcol11 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(inv_mcol10 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(inv_mcol9 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(inv_mcol8 >> 24) & 255] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i23, bArr2, i10);
        Pack.intToLittleEndian(i24, bArr2, i10 + 4);
        Pack.intToLittleEndian(i25, bArr2, i10 + 8);
        Pack.intToLittleEndian(i26, bArr2, i10 + 12);
    }

    private void encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10, int[][] iArr) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i3);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i3 + 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i3 + 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i3 + 12);
        char c10 = 0;
        int[] iArr2 = iArr[0];
        int i11 = littleEndianToInt ^ iArr2[0];
        int i12 = 1;
        int i13 = littleEndianToInt2 ^ iArr2[1];
        int i14 = littleEndianToInt3 ^ iArr2[2];
        int i15 = littleEndianToInt4 ^ iArr2[3];
        int i16 = 1;
        while (i16 < this.ROUNDS - i12) {
            byte[] bArr3 = f18912S;
            int mcol = mcol((((bArr3[i11 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(i13 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i15 >> 24) & 255] << 24)) ^ iArr[i16][c10];
            int mcol2 = mcol((((bArr3[i13 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i15 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i11 >> 24) & 255] << 24)) ^ iArr[i16][i12];
            char c11 = c10;
            int mcol3 = mcol(((((bArr3[(i15 >> 8) & 255] & UByte.MAX_VALUE) << 8) ^ (bArr3[i14 & 255] & UByte.MAX_VALUE)) ^ ((bArr3[(i11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i13 >> 24) & 255] << 24)) ^ iArr[i16][2];
            int mcol4 = mcol((((bArr3[i15 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(i11 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i13 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i14 >> 24) & 255] << 24));
            int i17 = i16 + 1;
            int i18 = mcol4 ^ iArr[i16][3];
            int mcol5 = mcol((((bArr3[mcol & 255] & UByte.MAX_VALUE) ^ ((bArr3[(mcol2 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(mcol3 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(i18 >> 24) & 255] << 24)) ^ iArr[i17][c11];
            int mcol6 = mcol((((bArr3[mcol2 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(mcol3 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(i18 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(mcol >> 24) & 255] << 24)) ^ iArr[i17][i12];
            int i19 = i12;
            int mcol7 = mcol(((((bArr3[(i18 >> 8) & 255] & UByte.MAX_VALUE) << 8) ^ (bArr3[mcol3 & 255] & UByte.MAX_VALUE)) ^ ((bArr3[(mcol >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(mcol2 >> 24) & 255] << 24)) ^ iArr[i17][2];
            i16 += 2;
            i15 = mcol((((bArr3[i18 & 255] & UByte.MAX_VALUE) ^ ((bArr3[(mcol >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr3[(mcol2 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr3[(mcol3 >> 24) & 255] << 24)) ^ iArr[i17][3];
            c10 = c11;
            i11 = mcol5;
            i13 = mcol6;
            i14 = mcol7;
            i12 = i19;
        }
        char c12 = c10;
        int i20 = i12;
        byte[] bArr4 = f18912S;
        int mcol8 = mcol((((bArr4[i11 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i13 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i15 >> 24) & 255] << 24)) ^ iArr[i16][c12];
        int mcol9 = mcol((((bArr4[i13 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i15 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i11 >> 24) & 255] << 24)) ^ iArr[i16][i20];
        int mcol10 = mcol((((bArr4[i14 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i15 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i13 >> 24) & 255] << 24)) ^ iArr[i16][2];
        int mcol11 = mcol((((bArr4[i15 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(i11 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(i13 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(i14 >> 24) & 255] << 24)) ^ iArr[i16][3];
        int i21 = (((bArr4[mcol8 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(mcol9 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(mcol10 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(mcol11 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i16 + 1];
        int i22 = i21 ^ iArr3[c12];
        int i23 = ((((bArr4[mcol9 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(mcol10 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(mcol11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(mcol8 >> 24) & 255] << 24)) ^ iArr3[i20];
        int i24 = iArr3[2] ^ ((((bArr4[mcol10 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(mcol11 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(mcol8 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(mcol9 >> 24) & 255] << 24));
        int i25 = ((((bArr4[mcol11 & 255] & UByte.MAX_VALUE) ^ ((bArr4[(mcol8 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr4[(mcol9 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr4[(mcol10 >> 24) & 255] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i22, bArr2, i10);
        Pack.intToLittleEndian(i23, bArr2, i10 + 4);
        Pack.intToLittleEndian(i24, bArr2, i10 + 8);
        Pack.intToLittleEndian(i25, bArr2, i10 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z2) {
        int i3;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28551));
        }
        int i10 = length >>> 2;
        this.ROUNDS = i10 + 6;
        int i11 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10 + 7, 4);
        char c10 = 3;
        if (i10 == 4) {
            i3 = 1;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i12 = 1; i12 <= 10; i12++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i12 - 1];
                int[] iArr2 = iArr[i12];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i10 == 6) {
            i3 = 1;
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i13 = 1;
            int i14 = 1;
            while (true) {
                int[] iArr3 = iArr[i13];
                iArr3[0] = littleEndianToInt9;
                iArr3[1] = littleEndianToInt10;
                int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ i14);
                int[] iArr4 = iArr[i13];
                iArr4[2] = subWord;
                int i15 = littleEndianToInt6 ^ subWord;
                iArr4[3] = i15;
                int i16 = littleEndianToInt7 ^ i15;
                int[] iArr5 = iArr[i13 + 1];
                iArr5[0] = i16;
                int i17 = littleEndianToInt8 ^ i16;
                iArr5[1] = i17;
                int i18 = littleEndianToInt9 ^ i17;
                iArr5[2] = i18;
                int i19 = littleEndianToInt10 ^ i18;
                iArr5[3] = i19;
                int subWord2 = subWord(shift(i19, 8)) ^ (i14 << 1);
                i14 <<= 2;
                littleEndianToInt5 = subWord ^ subWord2;
                int[] iArr6 = iArr[i13 + 2];
                iArr6[0] = littleEndianToInt5;
                littleEndianToInt6 = i15 ^ littleEndianToInt5;
                iArr6[1] = littleEndianToInt6;
                littleEndianToInt7 = i16 ^ littleEndianToInt6;
                iArr6[2] = littleEndianToInt7;
                littleEndianToInt8 = i17 ^ littleEndianToInt7;
                iArr6[3] = littleEndianToInt8;
                i13 += 3;
                if (i13 >= 13) {
                    break;
                }
                littleEndianToInt9 = i18 ^ littleEndianToInt8;
                littleEndianToInt10 = i19 ^ littleEndianToInt9;
            }
        } else {
            if (i10 != 8) {
                throw new IllegalStateException(StubApp.getString2(28550));
            }
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = littleEndianToInt18;
            int i20 = 1;
            int i21 = 2;
            while (true) {
                int subWord3 = subWord(shift(littleEndianToInt18, 8)) ^ i20;
                i20 <<= i11;
                littleEndianToInt11 ^= subWord3;
                int[] iArr7 = iArr[i21];
                iArr7[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr7[i11] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr7[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr7[c10] = littleEndianToInt14;
                i3 = i11;
                int i22 = i21 + 1;
                char c11 = c10;
                if (i22 >= 15) {
                    break;
                }
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int[] iArr8 = iArr[i22];
                iArr8[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr8[i3] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr8[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr8[c11] = littleEndianToInt18;
                i21 += 2;
                i11 = i3;
                c10 = c11;
            }
        }
        if (!z2) {
            for (int i23 = i3; i23 < this.ROUNDS; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr9 = iArr[i23];
                    iArr9[i24] = inv_mcol(iArr9[i24]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i3) {
        int shift = shift(i3, 8) ^ i3;
        int FFmulX = i3 ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private static int mcol(int i3) {
        int shift = shift(i3, 8);
        int i10 = i3 ^ shift;
        return FFmulX(i10) ^ (shift ^ shift(i10, 16));
    }

    private static int shift(int i3, int i10) {
        return (i3 << (-i10)) | (i3 >>> i10);
    }

    private static int subWord(int i3) {
        byte[] bArr = f18912S;
        return (bArr[(i3 >> 24) & 255] << 24) | (bArr[i3 & 255] & UByte.MAX_VALUE) | ((bArr[(i3 >> 8) & 255] & UByte.MAX_VALUE) << 8) | ((bArr[(i3 >> 16) & 255] & UByte.MAX_VALUE) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(461);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28552), cipherParameters));
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z2);
        this.forEncryption = z2;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException(StubApp.getString2(28554));
        }
        if (i3 > bArr.length - 16) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 > bArr2.length - 16) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i3, bArr2, i10, iArr);
        } else {
            decryptBlock(bArr, i3, bArr2, i10, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
