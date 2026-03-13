package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.util.Vector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NaccacheSternPrivateKeyParameters extends NaccacheSternKeyParameters {
    private BigInteger phi_n;
    private Vector smallPrimes;

    public NaccacheSternPrivateKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, int i3, Vector vector, BigInteger bigInteger3) {
        super(true, bigInteger, bigInteger2, i3);
        this.smallPrimes = vector;
        this.phi_n = bigInteger3;
    }

    public BigInteger getPhi_n() {
        return this.phi_n;
    }

    public Vector getSmallPrimes() {
        return this.smallPrimes;
    }
}
