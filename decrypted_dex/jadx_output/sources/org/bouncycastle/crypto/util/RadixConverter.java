package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import java.math.BigInteger;
import kotlin.UShort;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RadixConverter {
    private static final int DEFAULT_POWERS_TO_CACHE = 10;
    private static final double LOG_LONG_MAX_VALUE = Math.log(9.223372036854776E18d);
    private final int digitsGroupLength;
    private final BigInteger[] digitsGroupSpacePowers;
    private final BigInteger digitsGroupSpaceSize;
    private final int radix;

    public RadixConverter(int i3) {
        this(i3, 10);
    }

    private long fromEncoding(int i3, int i10, short[] sArr) {
        long j = 0;
        while (i3 < i10) {
            j = (j * this.radix) + (sArr[i3] & UShort.MAX_VALUE);
            i3++;
        }
        return j;
    }

    private BigInteger[] precomputeDigitsGroupPowers(int i3, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr = new BigInteger[i3];
        BigInteger bigInteger2 = bigInteger;
        for (int i10 = 0; i10 < i3; i10++) {
            bigIntegerArr[i10] = bigInteger2;
            bigInteger2 = bigInteger2.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    private int toEncoding(long j, int i3, short[] sArr) {
        int i10;
        for (int i11 = 0; i11 < this.digitsGroupLength && i3 >= 0; i11++) {
            if (j == 0) {
                i10 = i3 - 1;
                sArr[i3] = 0;
            } else {
                i10 = i3 - 1;
                int i12 = this.radix;
                sArr[i3] = (short) (j % i12);
                j /= i12;
            }
            i3 = i10;
        }
        if (j == 0) {
            return i3;
        }
        throw new IllegalStateException(StubApp.getString2(29387));
    }

    public int getDigitsGroupLength() {
        return this.digitsGroupLength;
    }

    public int getRadix() {
        return this.radix;
    }

    public RadixConverter(int i3, int i10) {
        this.radix = i3;
        int floor = (int) Math.floor(LOG_LONG_MAX_VALUE / Math.log(i3));
        this.digitsGroupLength = floor;
        BigInteger pow = BigInteger.valueOf(i3).pow(floor);
        this.digitsGroupSpaceSize = pow;
        this.digitsGroupSpacePowers = precomputeDigitsGroupPowers(i10, pow);
    }

    public BigInteger fromEncoding(short[] sArr) {
        BigInteger bigInteger = BigIntegers.ONE;
        int length = sArr.length;
        int i3 = length - this.digitsGroupLength;
        BigInteger bigInteger2 = null;
        int i10 = 0;
        while (true) {
            int i11 = this.digitsGroupLength;
            if (i3 <= (-i11)) {
                return bigInteger2;
            }
            if (i3 < 0) {
                i11 += i3;
                i3 = 0;
            }
            BigInteger valueOf = BigInteger.valueOf(fromEncoding(i3, Math.min(i11 + i3, length), sArr));
            if (i10 == 0) {
                bigInteger2 = valueOf;
            } else {
                BigInteger[] bigIntegerArr = this.digitsGroupSpacePowers;
                bigInteger = i10 <= bigIntegerArr.length ? bigIntegerArr[i10 - 1] : bigInteger.multiply(this.digitsGroupSpaceSize);
                bigInteger2 = bigInteger2.add(valueOf.multiply(bigInteger));
            }
            i10++;
            i3 -= this.digitsGroupLength;
        }
    }

    public void toEncoding(BigInteger bigInteger, int i3, short[] sArr) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException();
        }
        int i10 = i3 - 1;
        do {
            if (bigInteger.equals(BigInteger.ZERO)) {
                sArr[i10] = 0;
                i10--;
            } else {
                BigInteger[] divideAndRemainder = bigInteger.divideAndRemainder(this.digitsGroupSpaceSize);
                BigInteger bigInteger2 = divideAndRemainder[0];
                i10 = toEncoding(divideAndRemainder[1].longValue(), i10, sArr);
                bigInteger = bigInteger2;
            }
        } while (i10 >= 0);
        if (bigInteger.signum() != 0) {
            throw new IllegalArgumentException();
        }
    }
}
