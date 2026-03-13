package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAKeyParameters extends AsymmetricKeyParameter {
    private BigInteger exponent;
    private BigInteger modulus;
    private static final BigIntegers.Cache validated = new BigIntegers.Cache();
    private static final BigInteger SMALL_PRIMES_PRODUCT = new BigInteger(StubApp.getString2(29226), 16);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    public RSAKeyParameters(boolean z2, BigInteger bigInteger, BigInteger bigInteger2) {
        this(z2, bigInteger, bigInteger2, false);
    }

    private BigInteger validate(BigInteger bigInteger, boolean z2) {
        if (!z2) {
            if ((bigInteger.intValue() & 1) == 0) {
                throw new IllegalArgumentException(StubApp.getString2(29233));
            }
            if (Properties.isOverrideSet(StubApp.getString2(29228))) {
                return bigInteger;
            }
            if (Properties.asInteger(StubApp.getString2(29229), 15360) < bigInteger.bitLength()) {
                throw new IllegalArgumentException(StubApp.getString2(29232));
            }
            if (!bigInteger.gcd(SMALL_PRIMES_PRODUCT).equals(ONE)) {
                throw new IllegalArgumentException(StubApp.getString2(29231));
            }
            int bitLength = bigInteger.bitLength() / 2;
            if (!Primes.enhancedMRProbablePrimeTest(bigInteger, CryptoServicesRegistrar.getSecureRandom(), bitLength >= 1536 ? 3 : bitLength >= 1024 ? 4 : bitLength >= 512 ? 7 : 50).isProvablyComposite()) {
                throw new IllegalArgumentException(StubApp.getString2(29230));
            }
        }
        validated.add(bigInteger);
        return bigInteger;
    }

    public BigInteger getExponent() {
        return this.exponent;
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public RSAKeyParameters(boolean z2, BigInteger bigInteger, BigInteger bigInteger2, boolean z10) {
        super(z2);
        if (!z2 && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException(StubApp.getString2(29227));
        }
        this.modulus = validated.contains(bigInteger) ? bigInteger : validate(bigInteger, z10);
        this.exponent = bigInteger2;
    }
}
