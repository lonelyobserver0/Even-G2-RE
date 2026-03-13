package org.bouncycastle.crypto.constraints;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ConstraintUtils {
    public static int bitsOfSecurityFor(BigInteger bigInteger) {
        return bitsOfSecurityForFF(bigInteger.bitLength());
    }

    public static int bitsOfSecurityForFF(int i3) {
        if (i3 < 2048) {
            return i3 >= 1024 ? 80 : 20;
        }
        if (i3 < 3072) {
            return 112;
        }
        if (i3 >= 7680) {
            return i3 >= 15360 ? 256 : 192;
        }
        return 128;
    }

    public static int bitsOfSecurityFor(ECCurve eCCurve) {
        int fieldSize = (eCCurve.getFieldSize() + 1) / 2;
        if (fieldSize > 256) {
            return 256;
        }
        return fieldSize;
    }
}
