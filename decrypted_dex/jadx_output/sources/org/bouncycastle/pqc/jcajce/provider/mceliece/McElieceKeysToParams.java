package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePrivateKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McElieceKeysToParams {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCMcEliecePrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34686));
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) privateKey;
        return new McEliecePrivateKeyParameters(bCMcEliecePrivateKey.getN(), bCMcEliecePrivateKey.getK(), bCMcEliecePrivateKey.getField(), bCMcEliecePrivateKey.getGoppaPoly(), bCMcEliecePrivateKey.getP1(), bCMcEliecePrivateKey.getP2(), bCMcEliecePrivateKey.getSInv());
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCMcEliecePublicKey) {
            return ((BCMcEliecePublicKey) publicKey).getKeyParams();
        }
        throw new InvalidKeyException(StubApp.getString2(34687).concat(publicKey.getClass().getName()));
    }
}
