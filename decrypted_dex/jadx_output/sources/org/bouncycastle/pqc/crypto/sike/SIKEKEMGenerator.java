package org.bouncycastle.pqc.crypto.sike;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEKEMGenerator implements EncapsulatedSecretGenerator {
    private final SecureRandom sr;

    public SIKEKEMGenerator(SecureRandom secureRandom) {
        this.sr = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(34172), 0, asymmetricKeyParameter, CryptoServicePurpose.ENCRYPTION));
        return generateEncapsulated(asymmetricKeyParameter, ((SIKEPublicKeyParameters) asymmetricKeyParameter).getParameters().getEngine().getDefaultSessionKeySize());
    }

    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter, int i3) {
        System.err.println(StubApp.getString2(34171));
        SIKEPublicKeyParameters sIKEPublicKeyParameters = (SIKEPublicKeyParameters) asymmetricKeyParameter;
        SIKEEngine engine = sIKEPublicKeyParameters.getParameters().getEngine();
        byte[] bArr = new byte[engine.getCipherTextSize()];
        byte[] bArr2 = new byte[i3 / 8];
        engine.crypto_kem_enc(bArr, bArr2, sIKEPublicKeyParameters.getPublicKey(), this.sr);
        return new SecretWithEncapsulationImpl(bArr2, bArr);
    }
}
