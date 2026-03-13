package org.bouncycastle.jcajce.provider.asymmetric.edec;

import com.stub.StubApp;
import i2.u;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.crypto.util.PublicKeyFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class EdECUtil {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCXDHPrivateKey) {
            return ((BCXDHPrivateKey) privateKey).engineGetKeyParameters();
        }
        if (privateKey instanceof BCEdDSAPrivateKey) {
            return ((BCEdDSAPrivateKey) privateKey).engineGetKeyParameters();
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded != null) {
                return PrivateKeyFactory.createKey(encoded);
            }
            throw new InvalidKeyException(StubApp.getString2("30677"));
        } catch (Exception e10) {
            throw new InvalidKeyException(u.r(e10, new StringBuilder(StubApp.getString2(30678))));
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCXDHPublicKey) {
            return ((BCXDHPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof BCEdDSAPublicKey) {
            return ((BCEdDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded != null) {
                return PublicKeyFactory.createKey(encoded);
            }
            throw new InvalidKeyException(StubApp.getString2("30679"));
        } catch (Exception e10) {
            throw new InvalidKeyException(u.r(e10, new StringBuilder(StubApp.getString2(30680))));
        }
    }
}
