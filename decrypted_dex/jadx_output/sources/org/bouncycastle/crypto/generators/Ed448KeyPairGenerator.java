package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ed448KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        Ed448PrivateKeyParameters ed448PrivateKeyParameters = new Ed448PrivateKeyParameters(this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) ed448PrivateKeyParameters.generatePublicKey(), (AsymmetricKeyParameter) ed448PrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28910), BERTags.FLAGS, null, CryptoServicePurpose.KEYGEN));
    }
}
