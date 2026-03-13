package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class HarakaBase implements Digest {
    protected static final int DIGEST_SIZE = 32;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[][] f18801S = {new byte[]{99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118}, new byte[]{-54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64}, new byte[]{-73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21}, new byte[]{4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117}, new byte[]{9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124}, new byte[]{83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49}, new byte[]{-48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88}, new byte[]{81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46}, new byte[]{-51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115}, new byte[]{96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37}, new byte[]{-32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121}, new byte[]{-25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8}, new byte[]{-70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118}, new byte[]{112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98}, new byte[]{-31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33}, new byte[]{-116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22}};

    public static byte[] aesEnc(byte[] bArr, byte[] bArr2) {
        byte[] mixColumns = mixColumns(shiftRows(subBytes(bArr)));
        xorReverse(mixColumns, bArr2);
        return mixColumns;
    }

    private static byte[] mixColumns(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 4;
            int i12 = i11 + 1;
            int i13 = i11 + 2;
            int i14 = i11 + 3;
            bArr2[i3] = (byte) ((((xTime(bArr[i11]) ^ xTime(bArr[i12])) ^ bArr[i12]) ^ bArr[i13]) ^ bArr[i14]);
            bArr2[i3 + 1] = (byte) ((((bArr[i11] ^ xTime(bArr[i12])) ^ xTime(bArr[i13])) ^ bArr[i13]) ^ bArr[i14]);
            int i15 = i3 + 3;
            bArr2[i3 + 2] = (byte) ((((bArr[i11] ^ bArr[i12]) ^ xTime(bArr[i13])) ^ xTime(bArr[i14])) ^ bArr[i14]);
            i3 += 4;
            bArr2[i15] = (byte) ((((xTime(bArr[i11]) ^ bArr[i11]) ^ bArr[i12]) ^ bArr[i13]) ^ xTime(bArr[i14]));
        }
        return bArr2;
    }

    public static byte sBox(byte b2) {
        return f18801S[(b2 & UByte.MAX_VALUE) >>> 4][b2 & 15];
    }

    public static byte[] shiftRows(byte[] bArr) {
        return new byte[]{bArr[0], bArr[5], bArr[10], bArr[15], bArr[4], bArr[9], bArr[14], bArr[3], bArr[8], bArr[13], bArr[2], bArr[7], bArr[12], bArr[1], bArr[6], bArr[11]};
    }

    public static byte[] subBytes(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        bArr2[0] = sBox(bArr[0]);
        bArr2[1] = sBox(bArr[1]);
        bArr2[2] = sBox(bArr[2]);
        bArr2[3] = sBox(bArr[3]);
        bArr2[4] = sBox(bArr[4]);
        bArr2[5] = sBox(bArr[5]);
        bArr2[6] = sBox(bArr[6]);
        bArr2[7] = sBox(bArr[7]);
        bArr2[8] = sBox(bArr[8]);
        bArr2[9] = sBox(bArr[9]);
        bArr2[10] = sBox(bArr[10]);
        bArr2[11] = sBox(bArr[11]);
        bArr2[12] = sBox(bArr[12]);
        bArr2[13] = sBox(bArr[13]);
        bArr2[14] = sBox(bArr[14]);
        bArr2[15] = sBox(bArr[15]);
        return bArr2;
    }

    public static byte xTime(byte b2) {
        int i3 = b2 >>> 7;
        int i10 = b2 << 1;
        if (i3 > 0) {
            i10 ^= 27;
        }
        return (byte) (i10 & 255);
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[16];
        int i10 = 0;
        while (i10 < 16) {
            bArr3[i10] = (byte) (bArr2[i3] ^ bArr[i10]);
            i10++;
            i3++;
        }
        return bArr3;
    }

    public static void xorReverse(byte[] bArr, byte[] bArr2) {
        bArr[0] = (byte) (bArr[0] ^ bArr2[15]);
        bArr[1] = (byte) (bArr[1] ^ bArr2[14]);
        bArr[2] = (byte) (bArr[2] ^ bArr2[13]);
        bArr[3] = (byte) (bArr[3] ^ bArr2[12]);
        bArr[4] = (byte) (bArr[4] ^ bArr2[11]);
        bArr[5] = (byte) (bArr[5] ^ bArr2[10]);
        bArr[6] = (byte) (bArr[6] ^ bArr2[9]);
        bArr[7] = (byte) (bArr[7] ^ bArr2[8]);
        bArr[8] = (byte) (bArr2[7] ^ bArr[8]);
        bArr[9] = (byte) (bArr2[6] ^ bArr[9]);
        bArr[10] = (byte) (bArr2[5] ^ bArr[10]);
        bArr[11] = (byte) (bArr2[4] ^ bArr[11]);
        bArr[12] = (byte) (bArr2[3] ^ bArr[12]);
        bArr[13] = (byte) (bArr2[2] ^ bArr[13]);
        bArr[14] = (byte) (bArr2[1] ^ bArr[14]);
        bArr[15] = (byte) (bArr2[0] ^ bArr[15]);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }
}
