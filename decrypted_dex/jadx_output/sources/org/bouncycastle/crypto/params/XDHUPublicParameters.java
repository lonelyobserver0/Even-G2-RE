package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XDHUPublicParameters implements CipherParameters {
    private AsymmetricKeyParameter ephemeralPublicKey;
    private AsymmetricKeyParameter staticPublicKey;

    public XDHUPublicParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        if (asymmetricKeyParameter == null) {
            throw new NullPointerException(StubApp.getString2(29189));
        }
        if (!(asymmetricKeyParameter instanceof X448PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PublicKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(29245));
        }
        if (asymmetricKeyParameter2 == null) {
            throw new NullPointerException(StubApp.getString2(29188));
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            throw new IllegalArgumentException(StubApp.getString2(29200));
        }
        this.staticPublicKey = asymmetricKeyParameter;
        this.ephemeralPublicKey = asymmetricKeyParameter2;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public AsymmetricKeyParameter getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
