package org.bouncycastle.pqc.jcajce.provider.rainbow;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.rainbow.RainbowPublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowKeysToParams {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCRainbowPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34706));
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) privateKey;
        return new RainbowPrivateKeyParameters(bCRainbowPrivateKey.getInvA1(), bCRainbowPrivateKey.getB1(), bCRainbowPrivateKey.getInvA2(), bCRainbowPrivateKey.getB2(), bCRainbowPrivateKey.getVi(), bCRainbowPrivateKey.getLayers());
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCRainbowPublicKey) {
            BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) publicKey;
            return new RainbowPublicKeyParameters(bCRainbowPublicKey.getDocLength(), bCRainbowPublicKey.getCoeffQuadratic(), bCRainbowPublicKey.getCoeffSingular(), bCRainbowPublicKey.getCoeffScalar());
        }
        throw new InvalidKeyException(StubApp.getString2(34707).concat(publicKey.getClass().getName()));
    }
}
