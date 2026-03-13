package org.bouncycastle.crypto.ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ECUtil {
    public static BigInteger generateK(BigInteger bigInteger, SecureRandom secureRandom) {
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, secureRandom);
            if (!createRandomBigInteger.equals(ECConstants.ZERO) && createRandomBigInteger.compareTo(bigInteger) < 0) {
                return createRandomBigInteger;
            }
        }
    }
}
