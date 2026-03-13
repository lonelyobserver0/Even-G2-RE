package org.bouncycastle.pqc.crypto.falcon;

import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconCommon {
    static final int[] l2bound = {0, 101498, 208714, 428865, 892039, 1852696, 3842630, 7959734, 16468416, 34034726, 70265242};

    /* JADX WARN: Multi-variable type inference failed */
    public void hash_to_point_ct(SHAKE256 shake256, short[] sArr, int i3, int i10, short[] sArr2, int i11) {
        int i12;
        short s10;
        char c10;
        int i13;
        boolean z2;
        short s11;
        int i14 = 0;
        short[] sArr3 = new short[63];
        int i15 = 1 << i10;
        int i16 = i15 << 1;
        short s12 = new short[]{0, 65, 67, 71, 77, 86, 100, 122, 154, 205, 287}[i10];
        int i17 = i15 + s12;
        for (int i18 = 0; i18 < i17; i18++) {
            byte[] bArr = new byte[2];
            shake256.inner_shake256_extract(bArr, 0, 2);
            int i19 = ((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            int i20 = i19 - ((((i19 - 24578) >>> 31) - 1) & 24578);
            int i21 = i20 - ((((i20 - 24578) >>> 31) - 1) & 24578);
            int i22 = (((i19 - 61445) >>> 31) - 1) | (i21 - ((((i21 - 12289) >>> 31) - 1) & 12289));
            if (i18 < i15) {
                sArr[i3 + i18] = (short) i22;
            } else if (i18 < i16) {
                sArr2[(i11 + i18) - i15] = (short) i22;
            } else {
                sArr3[i18 - i16] = (short) i22;
            }
        }
        int i23 = 1;
        while (i23 <= s12) {
            int i24 = i14;
            int i25 = i24;
            while (i24 < i17) {
                if (i24 < i15) {
                    i12 = i3 + i24;
                    s10 = sArr[i12];
                    c10 = 1;
                } else if (i24 < i16) {
                    i12 = (i11 + i24) - i15;
                    s10 = sArr2[i12];
                    c10 = 2;
                } else {
                    i12 = i24 - i16;
                    s10 = sArr3[i12];
                    c10 = 3;
                }
                int i26 = i24 - i25;
                int i27 = (s10 >>> 15) - 1;
                i25 -= i27;
                if (i24 >= i23) {
                    int i28 = i24 - i23;
                    if (i28 < i15) {
                        i13 = (i3 + i24) - i23;
                        s11 = sArr[i13];
                        z2 = true;
                    } else if (i28 < i16) {
                        i13 = (i11 + i28) - i15;
                        s11 = sArr2[i13];
                        z2 = 2;
                    } else {
                        i13 = i28 - i16;
                        z2 = 3;
                        s11 = sArr3[i13];
                    }
                    int i29 = i27 & (-(((i26 & i23) + 511) >> 9));
                    if (c10 == 1) {
                        sArr[i12] = (short) (((s10 ^ s11) & i29) ^ s10);
                    } else if (c10 == 2) {
                        sArr2[i12] = (short) (((s10 ^ s11) & i29) ^ s10);
                    } else {
                        sArr3[i12] = (short) (((s10 ^ s11) & i29) ^ s10);
                    }
                    boolean z10 = z2;
                    if (z10 == 1) {
                        sArr[i13] = (short) (s11 ^ ((s10 ^ s11) & i29));
                    } else if (z10 == 2) {
                        sArr2[i13] = (short) (s11 ^ ((s10 ^ s11) & i29));
                    } else {
                        sArr3[i13] = (short) (s11 ^ ((s10 ^ s11) & i29));
                    }
                }
                i24++;
            }
            i23 <<= 1;
            i14 = 0;
        }
    }

    public void hash_to_point_vartime(SHAKE256 shake256, short[] sArr, int i3, int i10) {
        int i11 = 1 << i10;
        while (i11 > 0) {
            byte[] bArr = new byte[2];
            shake256.inner_shake256_extract(bArr, 0, 2);
            int i12 = ((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            if (i12 < 61445) {
                while (i12 >= 12289) {
                    i12 -= 12289;
                }
                sArr[i3] = (short) i12;
                i11--;
                i3++;
            }
        }
    }

    public int is_short(short[] sArr, int i3, short[] sArr2, int i10, int i11) {
        int i12 = 1 << i11;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i12) {
            short s10 = sArr[i3 + i13];
            int i16 = (s10 * s10) + i14;
            int i17 = i15 | i16;
            short s11 = sArr2[i10 + i13];
            int i18 = (s11 * s11) + i16;
            i13++;
            i15 = i17 | i18;
            i14 = i18;
        }
        return (((long) ((-(i15 >>> 31)) | i14)) & BodyPartID.bodyIdMax) <= ((long) l2bound[i11]) ? 1 : 0;
    }

    public int is_short_half(int i3, short[] sArr, int i10, int i11) {
        int i12 = 1 << i11;
        int i13 = -(i3 >>> 31);
        for (int i14 = 0; i14 < i12; i14++) {
            short s10 = sArr[i10 + i14];
            i3 += s10 * s10;
            i13 |= i3;
        }
        return (((long) (i3 | (-(i13 >>> 31)))) & BodyPartID.bodyIdMax) <= ((long) l2bound[i11]) ? 1 : 0;
    }
}
