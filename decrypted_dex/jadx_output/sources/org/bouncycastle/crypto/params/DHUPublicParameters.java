package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHUPublicParameters implements CipherParameters {
    private DHPublicKeyParameters ephemeralPublicKey;
    private DHPublicKeyParameters staticPublicKey;

    public DHUPublicParameters(DHPublicKeyParameters dHPublicKeyParameters, DHPublicKeyParameters dHPublicKeyParameters2) {
        if (dHPublicKeyParameters == null) {
            throw new NullPointerException(StubApp.getString2(29189));
        }
        if (dHPublicKeyParameters2 == null) {
            throw new NullPointerException(StubApp.getString2(29188));
        }
        if (!dHPublicKeyParameters.getParameters().equals(dHPublicKeyParameters2.getParameters())) {
            throw new IllegalArgumentException(StubApp.getString2(29187));
        }
        this.staticPublicKey = dHPublicKeyParameters;
        this.ephemeralPublicKey = dHPublicKeyParameters2;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public DHPublicKeyParameters getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
