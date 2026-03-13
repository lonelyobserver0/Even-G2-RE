package org.bouncycastle.pqc.math.ntru;

import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Polynomial {
    public short[] coeffs;
    protected NTRUParameterSet params;

    public Polynomial(NTRUParameterSet nTRUParameterSet) {
        this.coeffs = new short[nTRUParameterSet.n()];
        this.params = nTRUParameterSet;
    }

    public static short bothNegativeMask(short s10, short s11) {
        return (short) ((s10 & s11) >>> 15);
    }

    public static byte mod3(byte b2) {
        return (byte) ((b2 & UByte.MAX_VALUE) % 3);
    }

    public static int modQ(int i3, int i10) {
        return i3 % i10;
    }

    private void r2InvToRqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int length = this.coeffs.length;
        for (int i3 = 0; i3 < length; i3++) {
            polynomial3.coeffs[i3] = (short) (-polynomial2.coeffs[i3]);
        }
        for (int i10 = 0; i10 < length; i10++) {
            this.coeffs[i10] = polynomial.coeffs[i10];
        }
        polynomial4.rqMul(this, polynomial3);
        short[] sArr = polynomial4.coeffs;
        sArr[0] = (short) (sArr[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr2 = polynomial4.coeffs;
        sArr2[0] = (short) (sArr2[0] + 2);
        rqMul(polynomial4, polynomial5);
        polynomial4.rqMul(this, polynomial3);
        short[] sArr3 = polynomial4.coeffs;
        sArr3[0] = (short) (sArr3[0] + 2);
        polynomial5.rqMul(polynomial4, this);
        polynomial4.rqMul(polynomial5, polynomial3);
        short[] sArr4 = polynomial4.coeffs;
        sArr4[0] = (short) (sArr4[0] + 2);
        rqMul(polynomial4, polynomial5);
    }

    public abstract void lift(Polynomial polynomial);

    public void mod3PhiN() {
        int n10 = this.params.n();
        for (int i3 = 0; i3 < n10; i3++) {
            short[] sArr = this.coeffs;
            sArr[i3] = mod3((short) ((sArr[n10 - 1] * 2) + sArr[i3]));
        }
    }

    public void modQPhiN() {
        int n10 = this.params.n();
        for (int i3 = 0; i3 < n10; i3++) {
            short[] sArr = this.coeffs;
            sArr[i3] = (short) (sArr[i3] - sArr[n10 - 1]);
        }
    }

    public abstract void r2Inv(Polynomial polynomial);

    public void r2Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i3;
        int length = this.coeffs.length;
        short s10 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i10 = 0; i10 < length; i10++) {
            polynomial2.coeffs[i10] = 1;
        }
        int i11 = 0;
        while (true) {
            i3 = length - 1;
            if (i11 >= i3) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i11] = (short) ((sArr[i3] ^ sArr[i11]) & 1);
            i11++;
        }
        polynomial3.coeffs[i3] = 0;
        int i12 = 0;
        short s11 = 1;
        for (int i13 = 1; i12 < (i3 * 2) - i13; i13 = 1) {
            for (int i14 = i3; i14 > 0; i14--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i14] = sArr2[i14 - 1];
            }
            polynomial4.coeffs[s10] = s10;
            short s12 = polynomial3.coeffs[s10];
            short s13 = (short) (polynomial2.coeffs[s10] & s12);
            int i15 = -s11;
            short bothNegativeMask = bothNegativeMask((short) i15, (short) (-s12));
            s11 = (short) (((short) (s11 ^ ((i15 ^ s11) & bothNegativeMask))) + i13);
            int i16 = s10;
            short s14 = s10;
            while (i16 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s15 = sArr3[i16];
                short s16 = s14;
                short[] sArr4 = polynomial3.coeffs;
                short s17 = (short) (bothNegativeMask & (s15 ^ sArr4[i16]));
                sArr3[i16] = (short) (s15 ^ s17);
                sArr4[i16] = (short) (s17 ^ sArr4[i16]);
                short[] sArr5 = polynomial4.coeffs;
                short s18 = sArr5[i16];
                short[] sArr6 = polynomial5.coeffs;
                short s19 = (short) ((sArr6[i16] ^ s18) & bothNegativeMask);
                sArr5[i16] = (short) (s18 ^ s19);
                sArr6[i16] = (short) (sArr6[i16] ^ s19);
                i16++;
                s14 = s16;
            }
            short s20 = s14;
            for (int i17 = s14; i17 < length; i17++) {
                short[] sArr7 = polynomial3.coeffs;
                sArr7[i17] = (short) (sArr7[i17] ^ (polynomial2.coeffs[i17] & s13));
            }
            for (int i18 = s20; i18 < length; i18++) {
                short[] sArr8 = polynomial5.coeffs;
                sArr8[i18] = (short) (sArr8[i18] ^ (polynomial4.coeffs[i18] & s13));
            }
            int i19 = s20;
            while (i19 < i3) {
                short[] sArr9 = polynomial3.coeffs;
                int i20 = i19 + 1;
                sArr9[i19] = sArr9[i20];
                i19 = i20;
            }
            polynomial3.coeffs[i3] = s20;
            i12++;
            s10 = s20;
        }
        short s21 = s10;
        for (int i21 = s21; i21 < i3; i21++) {
            this.coeffs[i21] = polynomial4.coeffs[(length - 2) - i21];
        }
        this.coeffs[i3] = s21;
    }

    public abstract void rqInv(Polynomial polynomial);

    public void rqInv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        polynomial2.r2Inv(polynomial);
        r2InvToRqInv(polynomial2, polynomial, polynomial3, polynomial4, polynomial5);
    }

    public void rqMul(Polynomial polynomial, Polynomial polynomial2) {
        int i3;
        int length = this.coeffs.length;
        int i10 = 0;
        while (i10 < length) {
            this.coeffs[i10] = 0;
            for (int i11 = 1; i11 < length - i10; i11++) {
                short[] sArr = this.coeffs;
                sArr[i10] = (short) ((polynomial.coeffs[i10 + i11] * polynomial2.coeffs[length - i11]) + sArr[i10]);
            }
            int i12 = 0;
            while (true) {
                i3 = i10 + 1;
                if (i12 < i3) {
                    short[] sArr2 = this.coeffs;
                    sArr2[i10] = (short) ((polynomial.coeffs[i10 - i12] * polynomial2.coeffs[i12]) + sArr2[i10]);
                    i12++;
                }
            }
            i10 = i3;
        }
    }

    public void rqSumZeroFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        sqFromBytes(bArr);
        int i3 = length - 1;
        this.coeffs[i3] = 0;
        for (int i10 = 0; i10 < this.params.packDegree(); i10++) {
            short[] sArr = this.coeffs;
            sArr[i3] = (short) (sArr[i3] - sArr[i10]);
        }
    }

    public byte[] rqSumZeroToBytes(int i3) {
        return sqToBytes(i3);
    }

    public void rqToS3(Polynomial polynomial) {
        int length = this.coeffs.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.coeffs[i3] = (short) modQ(polynomial.coeffs[i3] & UShort.MAX_VALUE, this.params.q());
            short logQ = (short) (this.coeffs[i3] >>> (this.params.logQ() - 1));
            short[] sArr = this.coeffs;
            sArr[i3] = (short) (sArr[i3] + (logQ << (1 - (this.params.logQ() & 1))));
        }
        mod3PhiN();
    }

    public void s3FromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        for (int i3 = 0; i3 < this.params.packDegree() / 5; i3++) {
            byte b2 = bArr[i3];
            short[] sArr = this.coeffs;
            int i10 = i3 * 5;
            sArr[i10] = b2;
            int i11 = b2 & UByte.MAX_VALUE;
            sArr[i10 + 1] = (short) ((i11 * 171) >>> 9);
            sArr[i10 + 2] = (short) ((i11 * 57) >>> 9);
            sArr[i10 + 3] = (short) ((i11 * 19) >>> 9);
            sArr[i10 + 4] = (short) ((i11 * 203) >>> 14);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int packDegree = this.params.packDegree() / 5;
            byte b10 = bArr[packDegree];
            int i12 = 0;
            while (true) {
                int i13 = (packDegree * 5) + i12;
                if (i13 >= this.params.packDegree()) {
                    break;
                }
                this.coeffs[i13] = b10;
                b10 = (byte) (((b10 & UByte.MAX_VALUE) * 171) >> 9);
                i12++;
            }
        }
        this.coeffs[length - 1] = 0;
        mod3PhiN();
    }

    public abstract void s3Inv(Polynomial polynomial);

    public void s3Inv(Polynomial polynomial, Polynomial polynomial2, Polynomial polynomial3, Polynomial polynomial4, Polynomial polynomial5) {
        int i3;
        int length = this.coeffs.length;
        short s10 = 0;
        polynomial5.coeffs[0] = 1;
        for (int i10 = 0; i10 < length; i10++) {
            polynomial2.coeffs[i10] = 1;
        }
        int i11 = 0;
        while (true) {
            i3 = length - 1;
            if (i11 >= i3) {
                break;
            }
            short[] sArr = polynomial.coeffs;
            polynomial3.coeffs[(length - 2) - i11] = mod3((short) (((sArr[i3] & 3) * 2) + (sArr[i11] & 3)));
            i11++;
        }
        polynomial3.coeffs[i3] = 0;
        int i12 = 0;
        short s11 = 1;
        for (int i13 = 1; i12 < (i3 * 2) - i13; i13 = 1) {
            for (int i14 = i3; i14 > 0; i14--) {
                short[] sArr2 = polynomial4.coeffs;
                sArr2[i14] = sArr2[i14 - 1];
            }
            polynomial4.coeffs[s10] = s10;
            short mod3 = mod3((byte) (polynomial3.coeffs[s10] * 2 * polynomial2.coeffs[s10]));
            int i15 = -s11;
            short bothNegativeMask = bothNegativeMask((short) i15, (short) (-polynomial3.coeffs[s10]));
            s11 = (short) (((short) (s11 ^ ((i15 ^ s11) & bothNegativeMask))) + i13);
            int i16 = s10;
            short s12 = s10;
            while (i16 < length) {
                short[] sArr3 = polynomial2.coeffs;
                short s13 = sArr3[i16];
                short s14 = s12;
                short[] sArr4 = polynomial3.coeffs;
                short s15 = (short) (bothNegativeMask & (s13 ^ sArr4[i16]));
                sArr3[i16] = (short) (s13 ^ s15);
                sArr4[i16] = (short) (s15 ^ sArr4[i16]);
                short[] sArr5 = polynomial4.coeffs;
                short s16 = sArr5[i16];
                short[] sArr6 = polynomial5.coeffs;
                short s17 = (short) ((sArr6[i16] ^ s16) & bothNegativeMask);
                sArr5[i16] = (short) (s16 ^ s17);
                sArr6[i16] = (short) (sArr6[i16] ^ s17);
                i16++;
                s12 = s14;
            }
            short s18 = s12;
            for (int i17 = s12; i17 < length; i17++) {
                polynomial3.coeffs[i17] = mod3((byte) ((polynomial2.coeffs[i17] * mod3) + r8[i17]));
            }
            for (int i18 = s18; i18 < length; i18++) {
                polynomial5.coeffs[i18] = mod3((byte) ((polynomial4.coeffs[i18] * mod3) + r8[i18]));
            }
            int i19 = s18;
            while (i19 < i3) {
                short[] sArr7 = polynomial3.coeffs;
                int i20 = i19 + 1;
                sArr7[i19] = sArr7[i20];
                i19 = i20;
            }
            polynomial3.coeffs[i3] = s18;
            i12++;
            s10 = s18;
        }
        short s19 = s10;
        short s20 = polynomial2.coeffs[s19];
        for (int i21 = s19; i21 < i3; i21++) {
            this.coeffs[i21] = mod3((byte) (polynomial4.coeffs[(length - 2) - i21] * s20));
        }
        this.coeffs[i3] = s19;
    }

    public void s3Mul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        mod3PhiN();
    }

    public byte[] s3ToBytes(int i3) {
        byte[] bArr = new byte[i3];
        byte b2 = 0;
        for (int i10 = 0; i10 < this.params.packDegree() / 5; i10++) {
            short[] sArr = this.coeffs;
            int i11 = i10 * 5;
            bArr[i10] = (byte) (((((byte) (((((byte) (((((byte) (((((byte) (sArr[i11 + 4] & 255)) * 3) + sArr[i11 + 3]) & 255)) * 3) + sArr[i11 + 2]) & 255)) * 3) + sArr[i11 + 1]) & 255)) * 3) + sArr[i11]) & 255);
        }
        if (this.params.packDegree() > (this.params.packDegree() / 5) * 5) {
            int packDegree = this.params.packDegree() / 5;
            int i12 = packDegree * 5;
            for (int packDegree2 = (this.params.packDegree() - i12) - 1; packDegree2 >= 0; packDegree2--) {
                b2 = (byte) (((b2 * 3) + this.coeffs[i12 + packDegree2]) & 255);
            }
            bArr[packDegree] = b2;
        }
        return bArr;
    }

    public abstract void sqFromBytes(byte[] bArr);

    public void sqMul(Polynomial polynomial, Polynomial polynomial2) {
        rqMul(polynomial, polynomial2);
        modQPhiN();
    }

    public abstract byte[] sqToBytes(int i3);

    public void trinaryZqToZ3() {
        int length = this.coeffs.length;
        for (int i3 = 0; i3 < length; i3++) {
            short[] sArr = this.coeffs;
            sArr[i3] = (short) modQ(sArr[i3] & UShort.MAX_VALUE, this.params.q());
            short[] sArr2 = this.coeffs;
            short s10 = sArr2[i3];
            sArr2[i3] = (short) ((s10 ^ (s10 >>> (this.params.logQ() - 1))) & 3);
        }
    }

    public void z3ToZq() {
        int length = this.coeffs.length;
        for (int i3 = 0; i3 < length; i3++) {
            short[] sArr = this.coeffs;
            short s10 = sArr[i3];
            sArr[i3] = (short) (s10 | ((-(s10 >>> 1)) & (this.params.q() - 1)));
        }
    }

    public static short mod3(short s10) {
        return (short) ((s10 & UShort.MAX_VALUE) % 3);
    }
}
