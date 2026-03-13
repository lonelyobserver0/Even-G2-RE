package org.bouncycastle.util.encoders;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UTF8 {
    private static final byte C_CR1 = 1;
    private static final byte C_CR2 = 2;
    private static final byte C_CR3 = 3;
    private static final byte C_ILL = 0;
    private static final byte C_L2A = 4;
    private static final byte C_L3A = 5;
    private static final byte C_L3B = 6;
    private static final byte C_L3C = 7;
    private static final byte C_L4A = 8;
    private static final byte C_L4B = 9;
    private static final byte C_L4C = 10;
    private static final byte S_CS1 = 0;
    private static final byte S_CS2 = 16;
    private static final byte S_CS3 = 32;
    private static final byte S_END = -1;
    private static final byte S_ERR = -2;
    private static final byte S_P3A = 48;
    private static final byte S_P3B = 64;
    private static final byte S_P4A = 80;
    private static final byte S_P4B = 96;
    private static final short[] firstUnitTable = new short[128];
    private static final byte[] transitionTable;

    static {
        byte[] bArr = new byte[112];
        transitionTable = bArr;
        byte[] bArr2 = new byte[128];
        fill(bArr2, 0, 15, C_CR1);
        fill(bArr2, 16, 31, C_CR2);
        fill(bArr2, 32, 63, C_CR3);
        fill(bArr2, 64, 65, (byte) 0);
        fill(bArr2, 66, 95, (byte) 4);
        fill(bArr2, 96, 96, C_L3A);
        fill(bArr2, 97, 108, C_L3B);
        fill(bArr2, 109, 109, C_L3C);
        fill(bArr2, 110, 111, C_L3B);
        fill(bArr2, 112, 112, C_L4A);
        fill(bArr2, 113, 115, C_L4B);
        fill(bArr2, 116, 116, C_L4C);
        fill(bArr2, 117, CertificateBody.profileType, (byte) 0);
        fill(bArr, 0, bArr.length - 1, S_ERR);
        fill(bArr, 8, 11, (byte) -1);
        fill(bArr, 24, 27, (byte) 0);
        fill(bArr, 40, 43, (byte) 16);
        fill(bArr, 58, 59, (byte) 0);
        fill(bArr, 72, 73, (byte) 0);
        fill(bArr, 89, 91, (byte) 16);
        fill(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, C_L3C, C_L3C, C_L3C};
        byte[] bArr4 = {S_ERR, S_ERR, S_ERR, S_ERR, 0, S_P3A, 16, S_P3B, S_P4A, S_CS3, S_P4B};
        for (int i3 = 0; i3 < 128; i3++) {
            byte b2 = bArr2[i3];
            firstUnitTable[i3] = (short) (bArr4[b2] | ((bArr3[b2] & i3) << 8));
        }
    }

    private static void fill(byte[] bArr, int i3, int i10, byte b2) {
        while (i3 <= i10) {
            bArr[i3] = b2;
            i3++;
        }
    }

    public static int transcodeToUTF16(byte[] bArr, int i3, int i10, char[] cArr) {
        int i11 = i10 + i3;
        int i12 = 0;
        while (i3 < i11) {
            int i13 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 < 0) {
                short s10 = firstUnitTable[b2 & ByteCompanionObject.MAX_VALUE];
                int i14 = s10 >>> 8;
                byte b10 = (byte) s10;
                while (b10 >= 0) {
                    if (i13 >= bArr.length) {
                        return -1;
                    }
                    int i15 = i13 + 1;
                    byte b11 = bArr[i13];
                    i14 = (i14 << 6) | (b11 & 63);
                    b10 = transitionTable[b10 + ((b11 & 255) >>> 4)];
                    i13 = i15;
                }
                if (b10 == -2) {
                    return -1;
                }
                if (i14 <= 65535) {
                    if (i12 >= cArr.length) {
                        return -1;
                    }
                    cArr[i12] = (char) i14;
                    i12++;
                } else {
                    if (i12 >= cArr.length - 1) {
                        return -1;
                    }
                    int i16 = i12 + 1;
                    cArr[i12] = (char) ((i14 >>> 10) + 55232);
                    i12 += 2;
                    cArr[i16] = (char) ((i14 & 1023) | 56320);
                }
                i3 = i13;
            } else {
                if (i12 >= cArr.length) {
                    return -1;
                }
                cArr[i12] = (char) b2;
                i3 = i13;
                i12++;
            }
        }
        return i12;
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        return transcodeToUTF16(bArr, 0, bArr.length, cArr);
    }
}
