package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHPublicKeyParameters extends DHKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f19074y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f19074y = validate(bigInteger, dHParameters);
    }

    private static int legendre(BigInteger bigInteger, BigInteger bigInteger2) {
        int bitLength = bigInteger2.bitLength();
        int[] fromBigInteger = Nat.fromBigInteger(bitLength, bigInteger);
        int[] fromBigInteger2 = Nat.fromBigInteger(bitLength, bigInteger2);
        int length = fromBigInteger2.length;
        int i3 = 0;
        while (true) {
            int i10 = fromBigInteger[0];
            if (i10 == 0) {
                Nat.shiftDownWord(length, fromBigInteger, 0);
            } else {
                int numberOfTrailingZeros = Integers.numberOfTrailingZeros(i10);
                if (numberOfTrailingZeros > 0) {
                    Nat.shiftDownBits(length, fromBigInteger, numberOfTrailingZeros, 0);
                    int i11 = fromBigInteger2[0];
                    i3 ^= (numberOfTrailingZeros << 1) & (i11 ^ (i11 >>> 1));
                }
                int compare = Nat.compare(length, fromBigInteger, fromBigInteger2);
                if (compare == 0) {
                    break;
                }
                if (compare < 0) {
                    i3 ^= fromBigInteger[0] & fromBigInteger2[0];
                    int[] iArr = fromBigInteger2;
                    fromBigInteger2 = fromBigInteger;
                    fromBigInteger = iArr;
                }
                while (true) {
                    int i12 = length - 1;
                    if (fromBigInteger[i12] != 0) {
                        break;
                    }
                    length = i12;
                }
                Nat.sub(length, fromBigInteger, fromBigInteger2, fromBigInteger);
            }
        }
        if (Nat.isOne(length, fromBigInteger2)) {
            return 1 - (i3 & 2);
        }
        return 0;
    }

    private BigInteger validate(BigInteger bigInteger, DHParameters dHParameters) {
        if (bigInteger == null) {
            throw new NullPointerException(StubApp.getString2(29196));
        }
        BigInteger p8 = dHParameters.getP();
        BigInteger bigInteger2 = TWO;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(p8.subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException(StubApp.getString2(29195));
        }
        BigInteger q10 = dHParameters.getQ();
        if (q10 != null && (!(p8.testBit(0) && p8.bitLength() - 1 == q10.bitLength() && p8.shiftRight(1).equals(q10)) ? ONE.equals(bigInteger.modPow(q10, p8)) : 1 == legendre(bigInteger, p8))) {
            throw new IllegalArgumentException(StubApp.getString2(29194));
        }
        return bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f19074y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f19074y;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f19074y.hashCode() ^ super.hashCode();
    }
}
