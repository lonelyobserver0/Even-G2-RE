package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHExtendedPrivateKeySpec extends DHPrivateKeySpec {
    private final DHParameterSpec params;

    public DHExtendedPrivateKeySpec(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        super(bigInteger, dHParameterSpec.getP(), dHParameterSpec.getG());
        this.params = dHParameterSpec;
    }

    public DHParameterSpec getParams() {
        return this.params;
    }
}
