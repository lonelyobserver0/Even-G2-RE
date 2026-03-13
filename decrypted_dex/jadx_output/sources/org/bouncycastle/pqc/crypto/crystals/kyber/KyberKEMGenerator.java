package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KyberKEMGenerator implements EncapsulatedSecretGenerator {
    private final SecureRandom sr;

    public KyberKEMGenerator(SecureRandom secureRandom) {
        this.sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        KyberPublicKeyParameters kyberPublicKeyParameters = (KyberPublicKeyParameters) asymmetricKeyParameter;
        KyberEngine engine = kyberPublicKeyParameters.getParameters().getEngine();
        engine.init(this.sr);
        byte[][] kemEncrypt = engine.kemEncrypt(kyberPublicKeyParameters.getPublicKey());
        return new SecretWithEncapsulationImpl(kemEncrypt[0], kemEncrypt[1]);
    }
}
