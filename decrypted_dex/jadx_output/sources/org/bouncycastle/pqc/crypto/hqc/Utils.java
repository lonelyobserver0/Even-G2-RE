package org.bouncycastle.pqc.crypto.hqc;

import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static long bitMask(long j, long j3) {
        return (1 << ((int) (j % j3))) - 1;
    }

    public static void copyBytes(int[] iArr, int i3, int[] iArr2, int i10, int i11) {
        System.arraycopy(iArr, i3, iArr2, i10, i11 / 2);
    }

    public static void fromBitArrayToByteArray(byte[] bArr, byte[] bArr2) {
        long length = bArr2.length;
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            int i11 = i3 + 8;
            if (i11 >= bArr2.length) {
                int i12 = bArr2[i3];
                for (int length2 = (bArr2.length - i3) - 1; length2 >= 1; length2--) {
                    i12 |= bArr2[i3 + length2] << length2;
                }
                bArr[i10] = (byte) i12;
            } else {
                int i13 = bArr2[i3];
                for (int i14 = 7; i14 >= 1; i14--) {
                    i13 |= bArr2[i3 + i14] << i14;
                }
                bArr[i10] = (byte) i13;
            }
            i10++;
            i3 = i11;
        }
    }

    public static void fromBitArrayToLongArray(long[] jArr, byte[] bArr) {
        long length = bArr.length;
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            int i11 = i3 + 64;
            if (i11 >= bArr.length) {
                long j = bArr[i3];
                for (int length2 = (bArr.length - i3) - 1; length2 >= 1; length2--) {
                    j |= bArr[i3 + length2] << length2;
                }
                jArr[i10] = j;
            } else {
                long j3 = bArr[i3];
                for (int i12 = 63; i12 >= 1; i12--) {
                    j3 |= bArr[i3 + i12] << i12;
                }
                jArr[i10] = j3;
            }
            i10++;
            i3 = i11;
        }
    }

    public static void fromByte32ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i3 = 0; i3 != iArr.length; i3 += 2) {
            int i10 = i3 / 2;
            long j = iArr[i3] & BodyPartID.bodyIdMax;
            jArr[i10] = j;
            jArr[i10] = j | (iArr[i3 + 1] << 32);
        }
    }

    public static void fromByteArrayToBitArray(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 8;
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 != 8; i11++) {
                bArr[(i10 * 8) + i11] = (byte) ((bArr2[i10] & (1 << i11)) >>> i11);
            }
        }
        if (bArr.length % 8 != 0) {
            for (int i12 = length * 8; i12 < bArr.length; i12++) {
                bArr[i12] = (byte) ((bArr2[length] & (1 << i3)) >>> i3);
                i3++;
            }
        }
    }

    public static void fromByteArrayToLongArray(long[] jArr, byte[] bArr) {
        if (bArr.length % 8 != 0) {
            byte[] bArr2 = new byte[((bArr.length + 7) / 8) * 8];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < jArr.length; i10++) {
            jArr[i10] = Pack.littleEndianToLong(bArr, i3);
            i3 += 8;
        }
    }

    public static byte[] fromListOfPos1ToBitArray(int[] iArr, int i3) {
        byte[] bArr = new byte[i3];
        for (int i10 : iArr) {
            bArr[i10] = 1;
        }
        return bArr;
    }

    public static void fromLongArrayToBitArray(byte[] bArr, long[] jArr) {
        int length = bArr.length / 64;
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 != 64; i11++) {
                bArr[(i10 * 64) + i11] = (byte) ((jArr[i10] & (1 << i11)) >>> i11);
            }
        }
        if (bArr.length % 64 != 0) {
            for (int i12 = length * 64; i12 < bArr.length; i12++) {
                bArr[i12] = (byte) ((jArr[length] & (1 << i3)) >>> i3);
                i3++;
            }
        }
    }

    public static void fromLongArrayToByte32Array(int[] iArr, long[] jArr) {
        for (int i3 = 0; i3 != jArr.length; i3++) {
            int i10 = i3 * 2;
            long j = jArr[i3];
            iArr[i10] = (int) j;
            iArr[i10 + 1] = (int) (j >> 32);
        }
    }

    public static void fromLongArrayToByteArray(byte[] bArr, long[] jArr, int i3) {
        int length = bArr.length / 8;
        int i10 = 0;
        for (int i11 = 0; i11 != length; i11++) {
            Pack.longToLittleEndian(jArr[i11], bArr, i11 * 8);
        }
        if (bArr.length % 8 != 0) {
            int i12 = length * 8;
            while (i12 < bArr.length) {
                bArr[i12] = (byte) (jArr[length] >>> (i10 * 8));
                i12++;
                i10++;
            }
        }
    }

    public static int getByte64SizeFromBitSize(int i3) {
        return (i3 + 63) / 64;
    }

    public static int getByteSizeFromBitSize(int i3) {
        return (i3 + 7) / 8;
    }

    public static byte[] removeLast0Bits(byte[] bArr) {
        int length = bArr.length - 1;
        while (true) {
            if (length < 0) {
                length = 0;
                break;
            }
            if (bArr[length] == 1) {
                break;
            }
            length--;
        }
        int i3 = length + 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }

    public static void resizeArray(long[] jArr, int i3, long[] jArr2, int i10, int i11, int i12) {
        if (i3 >= i10) {
            System.arraycopy(jArr2, 0, jArr, 0, (i10 + 7) / 8);
            return;
        }
        int i13 = i3 % 64;
        int i14 = i13 != 0 ? 64 - i13 : 0;
        System.arraycopy(jArr2, 0, jArr, 0, i11);
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i12 - 1;
            jArr[i16] = jArr[i16] & (LongCompanionObject.MAX_VALUE >> i15);
        }
    }

    public static int toUnsigned16Bits(int i3) {
        return i3 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public static int toUnsigned8bits(int i3) {
        return i3 & 255;
    }
}
