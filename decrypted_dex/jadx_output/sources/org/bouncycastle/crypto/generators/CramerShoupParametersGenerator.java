package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.CramerShoupParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CramerShoupParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int certainty;
    private SecureRandom random;
    private int size;

    public static class ParametersHelper {
        private static final BigInteger TWO = BigInteger.valueOf(2);

        private ParametersHelper() {
        }

        public static BigInteger[] generateSafePrimes(int i3, int i10, SecureRandom secureRandom) {
            BigInteger createRandomPrime;
            BigInteger add;
            int i11 = i3 - 1;
            while (true) {
                createRandomPrime = BigIntegers.createRandomPrime(i11, 2, secureRandom);
                add = createRandomPrime.shiftLeft(1).add(CramerShoupParametersGenerator.ONE);
                if (!add.isProbablePrime(i10) || (i10 > 2 && !createRandomPrime.isProbablePrime(i10))) {
                }
            }
            return new BigInteger[]{add, createRandomPrime};
        }

        public static BigInteger selectGenerator(BigInteger bigInteger, SecureRandom secureRandom) {
            BigInteger modPow;
            BigInteger subtract = bigInteger.subtract(TWO);
            do {
                BigInteger bigInteger2 = TWO;
                modPow = BigIntegers.createRandomInRange(bigInteger2, subtract, secureRandom).modPow(bigInteger2, bigInteger);
            } while (modPow.equals(CramerShoupParametersGenerator.ONE));
            return modPow;
        }
    }

    public CramerShoupParameters generateParameters() {
        BigInteger selectGenerator;
        BigInteger bigInteger = ParametersHelper.generateSafePrimes(this.size, this.certainty, this.random)[1];
        BigInteger selectGenerator2 = ParametersHelper.selectGenerator(bigInteger, this.random);
        do {
            selectGenerator = ParametersHelper.selectGenerator(bigInteger, this.random);
        } while (selectGenerator2.equals(selectGenerator));
        return new CramerShoupParameters(bigInteger, selectGenerator2, selectGenerator, new SHA256Digest());
    }

    public void init(int i3, int i10, SecureRandom secureRandom) {
        this.size = i3;
        this.certainty = i10;
        this.random = secureRandom;
    }

    public CramerShoupParameters generateParameters(DHParameters dHParameters) {
        BigInteger selectGenerator;
        BigInteger p8 = dHParameters.getP();
        BigInteger g10 = dHParameters.getG();
        do {
            selectGenerator = ParametersHelper.selectGenerator(p8, this.random);
        } while (g10.equals(selectGenerator));
        return new CramerShoupParameters(p8, g10, selectGenerator, new SHA256Digest());
    }
}
