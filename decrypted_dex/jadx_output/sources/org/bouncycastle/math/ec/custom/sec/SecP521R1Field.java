package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat512;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SecP521R1Field {
    private static final int P16 = 511;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f19262P = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, P16};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        int add = Nat.add(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (add > P16 || (add == P16 && Nat.eq(16, iArr3, f19262P))) {
            add = (Nat.inc(16, iArr3) + add) & P16;
        }
        iArr3[16] = add;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        int inc = Nat.inc(16, iArr, iArr2) + iArr[16];
        if (inc > P16 || (inc == P16 && Nat.eq(16, iArr2, f19262P))) {
            inc = (Nat.inc(16, iArr2) + inc) & P16;
        }
        iArr2[16] = inc;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat.fromBigInteger(521, bigInteger);
        if (Nat.eq(17, fromBigInteger, f19262P)) {
            Nat.zero(17, fromBigInteger);
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i3 = iArr[16];
        iArr2[16] = (Nat.shiftDownBit(16, iArr, i3, iArr2) >>> 23) | (i3 >>> 1);
    }

    public static void implMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat512.mul(iArr, iArr2, iArr3);
        int i3 = iArr[16];
        int i10 = iArr2[16];
        iArr3[32] = (i3 * i10) + Nat.mul31BothAdd(16, i3, iArr2, i10, iArr, iArr3, 16);
    }

    public static void implSquare(int[] iArr, int[] iArr2) {
        Nat512.square(iArr, iArr2);
        int i3 = iArr[16];
        iArr2[32] = (i3 * i3) + Nat.mulWordAddTo(16, i3 << 1, iArr, 0, iArr2, 16);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f19262P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 17; i10++) {
            i3 |= iArr[i10];
        }
        return (((i3 >>> 1) | (i3 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = Nat.create(33);
        implMultiply(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(17, f19262P, iArr, iArr2);
        } else {
            int[] iArr3 = f19262P;
            Nat.sub(17, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & P16;
        } while (Nat.lessThan(17, iArr, f19262P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i3 = iArr[32];
        int addTo = Nat.addTo(16, iArr, iArr2) + (Nat.shiftDownBits(16, iArr, 16, 9, i3, iArr2, 0) >>> 23) + (i3 >>> 9);
        if (addTo > P16 || (addTo == P16 && Nat.eq(16, iArr2, f19262P))) {
            addTo = (Nat.inc(16, iArr2) + addTo) & P16;
        }
        iArr2[16] = addTo;
    }

    public static void reduce23(int[] iArr) {
        int i3 = iArr[16];
        int addWordTo = Nat.addWordTo(16, i3 >>> 9, iArr) + (i3 & P16);
        if (addWordTo > P16 || (addWordTo == P16 && Nat.eq(16, iArr, f19262P))) {
            addWordTo = (Nat.inc(16, iArr) + addWordTo) & P16;
        }
        iArr[16] = addWordTo;
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = Nat.create(33);
        implSquare(iArr, create);
        reduce(create, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2) {
        int[] create = Nat.create(33);
        implSquare(iArr, create);
        while (true) {
            reduce(create, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                implSquare(iArr2, create);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        int sub = (Nat.sub(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (sub < 0) {
            sub = (Nat.dec(16, iArr3) + sub) & P16;
        }
        iArr3[16] = sub;
    }

    public static void twice(int[] iArr, int[] iArr2) {
        int i3 = iArr[16];
        iArr2[16] = (Nat.shiftUpBit(16, iArr, i3 << 23, iArr2) | (i3 << 1)) & P16;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        implMultiply(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        implSquare(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i3, int[] iArr2, int[] iArr3) {
        implSquare(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i3--;
            if (i3 <= 0) {
                return;
            } else {
                implSquare(iArr2, iArr3);
            }
        }
    }
}
