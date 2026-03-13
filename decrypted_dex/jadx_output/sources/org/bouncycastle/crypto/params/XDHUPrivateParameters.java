package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XDHUPrivateParameters implements CipherParameters {
    private AsymmetricKeyParameter ephemeralPrivateKey;
    private AsymmetricKeyParameter ephemeralPublicKey;
    private AsymmetricKeyParameter staticPrivateKey;

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this(asymmetricKeyParameter, asymmetricKeyParameter2, null);
    }

    public AsymmetricKeyParameter getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public AsymmetricKeyParameter getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2, AsymmetricKeyParameter asymmetricKeyParameter3) {
        if (asymmetricKeyParameter == null) {
            throw new NullPointerException(StubApp.getString2(29186));
        }
        boolean z2 = asymmetricKeyParameter instanceof X448PrivateKeyParameters;
        if (!z2 && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(29245));
        }
        if (asymmetricKeyParameter2 == null) {
            throw new NullPointerException(StubApp.getString2(29185));
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            throw new IllegalArgumentException(StubApp.getString2(29198));
        }
        if (asymmetricKeyParameter3 == null) {
            asymmetricKeyParameter3 = asymmetricKeyParameter2 instanceof X448PrivateKeyParameters ? ((X448PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey() : ((X25519PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey();
        } else {
            boolean z10 = asymmetricKeyParameter3 instanceof X448PublicKeyParameters;
            String string2 = StubApp.getString2(29197);
            if (z10 && !z2) {
                throw new IllegalArgumentException(string2);
            }
            if ((asymmetricKeyParameter3 instanceof X25519PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
                throw new IllegalArgumentException(string2);
            }
        }
        this.staticPrivateKey = asymmetricKeyParameter;
        this.ephemeralPrivateKey = asymmetricKeyParameter2;
        this.ephemeralPublicKey = asymmetricKeyParameter3;
    }
}
