package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.ElGamalParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalParametersGenerator {
    private int certainty;
    private SecureRandom random;
    private int size;

    public ElGamalParameters generateParameters() {
        BigInteger[] generateSafePrimes = DHParametersHelper.generateSafePrimes(this.size, this.certainty, this.random);
        BigInteger bigInteger = generateSafePrimes[0];
        return new ElGamalParameters(bigInteger, DHParametersHelper.selectGenerator(bigInteger, generateSafePrimes[1], this.random));
    }

    public void init(int i3, int i10, SecureRandom secureRandom) {
        this.size = i3;
        this.certainty = i10;
        this.random = secureRandom;
    }
}
