package org.bouncycastle.pqc.crypto.falcon;

import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconCodec {
    final byte[] max_fg_bits = {0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 5};
    final byte[] max_FG_bits = {0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    final byte[] max_sig_bits = {0, 10, 11, 11, 12, 12, 12, 12, 12, 12, 12};

    public int comp_decode(short[] sArr, int i3, int i10, byte[] bArr, int i11, int i12) {
        int i13 = 1 << i10;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            if (i16 >= i12) {
                return 0;
            }
            i14 = (i14 << 8) | (bArr[i11 + i16] & UByte.MAX_VALUE);
            i16++;
            int i18 = i14 >>> i15;
            int i19 = i18 & 128;
            int i20 = i18 & CertificateBody.profileType;
            do {
                if (i15 == 0) {
                    if (i16 >= i12) {
                        return 0;
                    }
                    i14 = (i14 << 8) | (bArr[i11 + i16] & UByte.MAX_VALUE);
                    i16++;
                    i15 = 8;
                }
                i15--;
                if (((i14 >>> i15) & 1) == 0) {
                    i20 += 128;
                } else {
                    if (i19 != 0 && i20 == 0) {
                        return 0;
                    }
                    int i21 = i3 + i17;
                    if (i19 != 0) {
                        i20 = -i20;
                    }
                    sArr[i21] = (short) i20;
                }
            } while (i20 <= 2047);
            return 0;
        }
        if ((((1 << i15) - 1) & i14) != 0) {
            return 0;
        }
        return i16;
    }

    public int comp_encode(byte[] bArr, int i3, int i10, short[] sArr, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            short s10 = sArr[i11 + i14];
            if (s10 < -2047 || s10 > 2047) {
                return 0;
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            int i19 = i16 << 1;
            short s11 = sArr[i11 + i18];
            int i20 = s11;
            if (s11 < 0) {
                i19 |= 1;
                i20 = -s11;
            }
            int i21 = (i19 << 7) | (i20 & CertificateBody.profileType);
            int i22 = (i20 >>> 7) + 1;
            i16 = (i21 << i22) | 1;
            i15 = i15 + 8 + i22;
            while (i15 >= 8) {
                i15 -= 8;
                if (bArr != null) {
                    if (i17 >= i10) {
                        return 0;
                    }
                    bArr[i3 + i17] = (byte) (i16 >>> i15);
                }
                i17++;
            }
        }
        if (i15 <= 0) {
            return i17;
        }
        if (bArr != null) {
            if (i17 >= i10) {
                return 0;
            }
            bArr[i3 + i17] = (byte) (i16 << (8 - i15));
        }
        return i17 + 1;
    }

    public int modq_decode(short[] sArr, int i3, int i10, byte[] bArr, int i11, int i12) {
        int i13 = 1 << i10;
        int i14 = ((i13 * 14) + 7) >> 3;
        if (i14 > i12) {
            return 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i13) {
            int i18 = i11 + 1;
            i16 = (i16 << 8) | (bArr[i11] & UByte.MAX_VALUE);
            int i19 = i17 + 8;
            if (i19 >= 14) {
                i17 -= 6;
                int i20 = (i16 >>> i17) & 16383;
                if (i20 >= 12289) {
                    return 0;
                }
                sArr[i3 + i15] = (short) i20;
                i15++;
            } else {
                i17 = i19;
            }
            i11 = i18;
        }
        if ((((1 << i17) - 1) & i16) != 0) {
            return 0;
        }
        return i14;
    }

    public int modq_encode(byte[] bArr, int i3, int i10, short[] sArr, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            if ((65535 & sArr[i11 + i14]) >= 12289) {
                return 0;
            }
        }
        int i15 = ((i13 * 14) + 7) >> 3;
        if (bArr != null) {
            if (i15 > i10) {
                return 0;
            }
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                i17 = (i17 << 14) | (sArr[i11 + i18] & UShort.MAX_VALUE);
                i16 += 14;
                while (i16 >= 8) {
                    i16 -= 8;
                    bArr[i3] = (byte) (i17 >> i16);
                    i3++;
                }
            }
            if (i16 > 0) {
                bArr[i3] = (byte) (i17 << (8 - i16));
            }
        }
        return i15;
    }

    public int trim_i16_decode(short[] sArr, int i3, int i10, int i11, byte[] bArr, int i12, int i13) {
        int i14 = 1 << i10;
        int i15 = ((i14 * i11) + 7) >> 3;
        if (i15 > i13) {
            return 0;
        }
        int i16 = (1 << i11) - 1;
        int i17 = 1 << (i11 - 1);
        int i18 = i12;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < i14) {
            int i22 = i18 + 1;
            i20 = (i20 << 8) | (bArr[i18] & 255);
            i21 += 8;
            while (i21 >= i11 && i19 < i14) {
                i21 -= i11;
                int i23 = (i20 >>> i21) & i16;
                int i24 = i23 | (-(i23 & i17));
                if (i24 == (-i17)) {
                    return 0;
                }
                sArr[i3 + i19] = (short) (i24 | (-(i24 & i17)));
                i19++;
            }
            i18 = i22;
        }
        if ((((1 << i21) - 1) & i20) != 0) {
            return 0;
        }
        return i15;
    }

    public int trim_i16_encode(byte[] bArr, int i3, int i10, short[] sArr, int i11, int i12, int i13) {
        int i14 = 1 << i12;
        int i15 = (1 << (i13 - 1)) - 1;
        int i16 = -i15;
        for (int i17 = 0; i17 < i14; i17++) {
            short s10 = sArr[i11 + i17];
            if (s10 < i16 || s10 > i15) {
                return 0;
            }
        }
        int i18 = ((i14 * i13) + 7) >> 3;
        if (bArr != null) {
            if (i18 > i10) {
                return 0;
            }
            int i19 = (1 << i13) - 1;
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < i14; i22++) {
                i21 = (i21 << i13) | (sArr[i11 + i22] & 4095 & i19);
                i20 += i13;
                while (i20 >= 8) {
                    i20 -= 8;
                    bArr[i3] = (byte) (i21 >> i20);
                    i3++;
                }
            }
            if (i20 > 0) {
                bArr[i3] = (byte) (i21 << (8 - i20));
            }
        }
        return i18;
    }

    public int trim_i8_decode(byte[] bArr, int i3, int i10, int i11, byte[] bArr2, int i12, int i13) {
        int i14 = 1 << i10;
        int i15 = ((i14 * i11) + 7) >> 3;
        if (i15 > i13) {
            return 0;
        }
        int i16 = (1 << i11) - 1;
        int i17 = 1 << (i11 - 1);
        int i18 = i12;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < i14) {
            int i22 = i18 + 1;
            i20 = (i20 << 8) | (bArr2[i18] & 255);
            i21 += 8;
            while (i21 >= i11 && i19 < i14) {
                i21 -= i11;
                int i23 = (i20 >>> i21) & i16;
                int i24 = i23 | (-(i23 & i17));
                if (i24 == (-i17)) {
                    return 0;
                }
                bArr[i3 + i19] = (byte) i24;
                i19++;
            }
            i18 = i22;
        }
        if ((((1 << i21) - 1) & i20) != 0) {
            return 0;
        }
        return i15;
    }

    public int trim_i8_encode(byte[] bArr, int i3, int i10, byte[] bArr2, int i11, int i12, int i13) {
        int i14 = 1 << i12;
        int i15 = (1 << (i13 - 1)) - 1;
        int i16 = -i15;
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = bArr2[i11 + i17];
            if (i18 < i16 || i18 > i15) {
                return 0;
            }
        }
        int i19 = ((i14 * i13) + 7) >> 3;
        if (bArr != null) {
            if (i19 > i10) {
                return 0;
            }
            int i20 = (1 << i13) - 1;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < i14; i23++) {
                i22 = (i22 << i13) | (bArr2[i11 + i23] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & i20);
                i21 += i13;
                while (i21 >= 8) {
                    i21 -= 8;
                    bArr[i3] = (byte) (i22 >>> i21);
                    i3++;
                }
            }
            if (i21 > 0) {
                bArr[i3] = (byte) (i22 << (8 - i21));
            }
        }
        return i19;
    }
}
