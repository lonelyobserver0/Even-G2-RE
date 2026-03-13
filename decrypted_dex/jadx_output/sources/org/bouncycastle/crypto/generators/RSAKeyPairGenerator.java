package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private RSAKeyGenerationParameters param;

    private static int getNumberOfIterations(int i3, int i10) {
        if (i3 >= 1536) {
            if (i10 <= 100) {
                return 3;
            }
            if (i10 <= 128) {
                return 4;
            }
            return u.c(i10, CertificateBody.profileType, 2, 4);
        }
        if (i3 >= 1024) {
            if (i10 <= 100) {
                return 4;
            }
            if (i10 <= 112) {
                return 5;
            }
            return u.c(i10, 111, 2, 5);
        }
        if (i3 < 512) {
            if (i10 <= 80) {
                return 40;
            }
            return u.c(i10, 79, 2, 40);
        }
        if (i10 <= 80) {
            return 5;
        }
        if (i10 <= 100) {
            return 7;
        }
        return u.c(i10, 99, 2, 7);
    }

    public BigInteger chooseRandomPrime(int i3, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i10 = 0; i10 != i3 * 5; i10++) {
            BigInteger createRandomPrime = BigIntegers.createRandomPrime(i3, 1, this.param.getRandom());
            BigInteger mod = createRandomPrime.mod(bigInteger);
            BigInteger bigInteger3 = ONE;
            if (!mod.equals(bigInteger3) && createRandomPrime.multiply(createRandomPrime).compareTo(bigInteger2) >= 0 && isProbablePrime(createRandomPrime) && bigInteger.gcd(createRandomPrime.subtract(bigInteger3)).equals(bigInteger3)) {
                return createRandomPrime;
            }
        }
        throw new IllegalStateException(StubApp.getString2(28987));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger chooseRandomPrime;
        BigInteger chooseRandomPrime2;
        BigInteger multiply;
        RSAKeyPairGenerator rSAKeyPairGenerator = this;
        int strength = rSAKeyPairGenerator.param.getStrength();
        int i3 = (strength + 1) / 2;
        int i10 = strength - i3;
        int i11 = strength / 2;
        int i12 = i11 - 100;
        int i13 = strength / 3;
        if (i12 < i13) {
            i12 = i13;
        }
        int i14 = strength >> 2;
        BigInteger pow = BigInteger.valueOf(2L).pow(i11);
        BigInteger bigInteger = ONE;
        BigInteger shiftLeft = bigInteger.shiftLeft(strength - 1);
        BigInteger shiftLeft2 = bigInteger.shiftLeft(i12);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z2 = false;
        while (!z2) {
            BigInteger publicExponent = rSAKeyPairGenerator.param.getPublicExponent();
            do {
                chooseRandomPrime = rSAKeyPairGenerator.chooseRandomPrime(i3, publicExponent, shiftLeft);
                while (true) {
                    chooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i10, publicExponent, shiftLeft);
                    BigInteger abs = chooseRandomPrime2.subtract(chooseRandomPrime).abs();
                    if (abs.bitLength() >= i12 && abs.compareTo(shiftLeft2) > 0) {
                        multiply = chooseRandomPrime.multiply(chooseRandomPrime2);
                        if (multiply.bitLength() == strength) {
                            break;
                        }
                        chooseRandomPrime = chooseRandomPrime.max(chooseRandomPrime2);
                    } else {
                        rSAKeyPairGenerator = this;
                        strength = strength;
                    }
                }
            } while (WNafUtil.getNafWeight(multiply) < i14);
            if (chooseRandomPrime.compareTo(chooseRandomPrime2) < 0) {
                chooseRandomPrime2 = chooseRandomPrime;
                chooseRandomPrime = chooseRandomPrime2;
            }
            BigInteger bigInteger2 = ONE;
            BigInteger subtract = chooseRandomPrime.subtract(bigInteger2);
            BigInteger subtract2 = chooseRandomPrime2.subtract(bigInteger2);
            int i15 = strength;
            BigInteger modInverse = publicExponent.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) > 0) {
                z2 = true;
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, multiply, publicExponent, true), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(multiply, publicExponent, modInverse, chooseRandomPrime, chooseRandomPrime2, modInverse.remainder(subtract), modInverse.remainder(subtract2), BigIntegers.modOddInverse(chooseRandomPrime, chooseRandomPrime2), true));
            }
            rSAKeyPairGenerator = this;
            strength = i15;
        }
        return asymmetricCipherKeyPair;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (RSAKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28988), ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), null, CryptoServicePurpose.KEYGEN));
    }

    public boolean isProbablePrime(BigInteger bigInteger) {
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.param.getRandom(), getNumberOfIterations(bigInteger.bitLength(), this.param.getCertainty()));
    }
}
