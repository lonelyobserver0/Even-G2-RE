package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DHKeyGeneratorHelper {
    static final DHKeyGeneratorHelper INSTANCE = new DHKeyGeneratorHelper();
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    private DHKeyGeneratorHelper() {
    }

    public BigInteger calculatePrivate(DHParameters dHParameters, SecureRandom secureRandom) {
        BigInteger createRandomInRange;
        BigInteger bit;
        int l9 = dHParameters.getL();
        if (l9 != 0) {
            int i3 = l9 >>> 2;
            do {
                bit = BigIntegers.createRandomBigInteger(l9, secureRandom).setBit(l9 - 1);
            } while (WNafUtil.getNafWeight(bit) < i3);
            return bit;
        }
        BigInteger bigInteger = TWO;
        int m4 = dHParameters.getM();
        BigInteger shiftLeft = m4 != 0 ? ONE.shiftLeft(m4 - 1) : bigInteger;
        BigInteger q10 = dHParameters.getQ();
        if (q10 == null) {
            q10 = dHParameters.getP();
        }
        BigInteger subtract = q10.subtract(bigInteger);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            createRandomInRange = BigIntegers.createRandomInRange(shiftLeft, subtract, secureRandom);
        } while (WNafUtil.getNafWeight(createRandomInRange) < bitLength);
        return createRandomInRange;
    }

    public BigInteger calculatePublic(DHParameters dHParameters, BigInteger bigInteger) {
        return dHParameters.getG().modPow(bigInteger, dHParameters.getP());
    }
}
