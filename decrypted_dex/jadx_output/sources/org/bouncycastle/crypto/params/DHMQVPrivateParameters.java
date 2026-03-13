package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHMQVPrivateParameters implements CipherParameters {
    private DHPrivateKeyParameters ephemeralPrivateKey;
    private DHPublicKeyParameters ephemeralPublicKey;
    private DHPrivateKeyParameters staticPrivateKey;

    public DHMQVPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2) {
        this(dHPrivateKeyParameters, dHPrivateKeyParameters2, null);
    }

    public DHPrivateKeyParameters getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public DHPrivateKeyParameters getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public DHMQVPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2, DHPublicKeyParameters dHPublicKeyParameters) {
        if (dHPrivateKeyParameters == null) {
            throw new NullPointerException(StubApp.getString2(29186));
        }
        if (dHPrivateKeyParameters2 == null) {
            throw new NullPointerException(StubApp.getString2(29185));
        }
        DHParameters parameters = dHPrivateKeyParameters.getParameters();
        if (!parameters.equals(dHPrivateKeyParameters2.getParameters())) {
            throw new IllegalArgumentException(StubApp.getString2(29184));
        }
        if (dHPublicKeyParameters == null) {
            dHPublicKeyParameters = new DHPublicKeyParameters(parameters.getG().modPow(dHPrivateKeyParameters2.getX(), parameters.getP()), parameters);
        } else if (!parameters.equals(dHPublicKeyParameters.getParameters())) {
            throw new IllegalArgumentException(StubApp.getString2(29183));
        }
        this.staticPrivateKey = dHPrivateKeyParameters;
        this.ephemeralPrivateKey = dHPrivateKeyParameters2;
        this.ephemeralPublicKey = dHPublicKeyParameters;
    }
}
