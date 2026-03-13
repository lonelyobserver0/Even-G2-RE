package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f19081y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.f19081y = validate(bigInteger, dSAParameters);
    }

    private BigInteger validate(BigInteger bigInteger, DSAParameters dSAParameters) {
        if (dSAParameters == null) {
            return bigInteger;
        }
        BigInteger bigInteger2 = TWO;
        if (bigInteger2.compareTo(bigInteger) > 0 || dSAParameters.getP().subtract(bigInteger2).compareTo(bigInteger) < 0 || !ONE.equals(bigInteger.modPow(dSAParameters.getQ(), dSAParameters.getP()))) {
            throw new IllegalArgumentException(StubApp.getString2(29199));
        }
        return bigInteger;
    }

    public BigInteger getY() {
        return this.f19081y;
    }
}
