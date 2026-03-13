package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalUtil {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ElGamalPrivateKey) {
            ElGamalPrivateKey elGamalPrivateKey = (ElGamalPrivateKey) privateKey;
            return new ElGamalPrivateKeyParameters(elGamalPrivateKey.getX(), new ElGamalParameters(elGamalPrivateKey.getParameters().getP(), elGamalPrivateKey.getParameters().getG()));
        }
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(30757));
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new ElGamalPrivateKeyParameters(dHPrivateKey.getX(), new ElGamalParameters(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ElGamalPublicKey) {
            ElGamalPublicKey elGamalPublicKey = (ElGamalPublicKey) publicKey;
            return new ElGamalPublicKeyParameters(elGamalPublicKey.getY(), new ElGamalParameters(elGamalPublicKey.getParameters().getP(), elGamalPublicKey.getParameters().getG()));
        }
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(30758));
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new ElGamalPublicKeyParameters(dHPublicKey.getY(), new ElGamalParameters(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
    }
}
