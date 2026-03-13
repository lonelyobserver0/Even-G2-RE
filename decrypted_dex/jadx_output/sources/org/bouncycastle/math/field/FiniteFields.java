package org.bouncycastle.math.field;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class FiniteFields {
    static final FiniteField GF_2 = new PrimeField(BigInteger.valueOf(2));
    static final FiniteField GF_3 = new PrimeField(BigInteger.valueOf(3));

    public static PolynomialExtensionField getBinaryExtensionField(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException(StubApp.getString2(33016));
        }
        for (int i3 = 1; i3 < iArr.length; i3++) {
            if (iArr[i3] <= iArr[i3 - 1]) {
                throw new IllegalArgumentException(StubApp.getString2(33015));
            }
        }
        return new GenericPolynomialExtensionField(GF_2, new GF2Polynomial(iArr));
    }

    public static FiniteField getPrimeField(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException(StubApp.getString2(33017));
        }
        if (bitLength < 3) {
            int intValueExact = BigIntegers.intValueExact(bigInteger);
            if (intValueExact == 2) {
                return GF_2;
            }
            if (intValueExact == 3) {
                return GF_3;
            }
        }
        return new PrimeField(bigInteger);
    }
}
