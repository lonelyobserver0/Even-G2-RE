package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SM2KeyExchangePrivateParameters implements CipherParameters {
    private final ECPrivateKeyParameters ephemeralPrivateKey;
    private final ECPoint ephemeralPublicPoint;
    private final boolean initiator;
    private final ECPrivateKeyParameters staticPrivateKey;
    private final ECPoint staticPublicPoint;

    public SM2KeyExchangePrivateParameters(boolean z2, ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
        if (eCPrivateKeyParameters == null) {
            throw new NullPointerException(StubApp.getString2(29186));
        }
        if (eCPrivateKeyParameters2 == null) {
            throw new NullPointerException(StubApp.getString2(29185));
        }
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        if (!parameters.equals(eCPrivateKeyParameters2.getParameters())) {
            throw new IllegalArgumentException(StubApp.getString2(29184));
        }
        FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
        this.initiator = z2;
        this.staticPrivateKey = eCPrivateKeyParameters;
        this.staticPublicPoint = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters.getD()).normalize();
        this.ephemeralPrivateKey = eCPrivateKeyParameters2;
        this.ephemeralPublicPoint = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters2.getD()).normalize();
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public ECPoint getEphemeralPublicPoint() {
        return this.ephemeralPublicPoint;
    }

    public ECPrivateKeyParameters getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public ECPoint getStaticPublicPoint() {
        return this.staticPublicPoint;
    }

    public boolean isInitiator() {
        return this.initiator;
    }
}
