package org.bouncycastle.jcajce.provider.asymmetric.util;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410Util {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof GOST3410PrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(30863));
        }
        GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) privateKey;
        GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410PrivateKey.getParameters().getPublicKeyParameters();
        return new GOST3410PrivateKeyParameters(gOST3410PrivateKey.getX(), new GOST3410Parameters(publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA()));
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof GOST3410PublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(30864).concat(publicKey.getClass().getName()));
        }
        GOST3410PublicKey gOST3410PublicKey = (GOST3410PublicKey) publicKey;
        GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410PublicKey.getParameters().getPublicKeyParameters();
        return new GOST3410PublicKeyParameters(gOST3410PublicKey.getY(), new GOST3410Parameters(publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA()));
    }
}
