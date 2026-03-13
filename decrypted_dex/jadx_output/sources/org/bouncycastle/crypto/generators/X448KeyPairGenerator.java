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
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X448KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        X448PrivateKeyParameters x448PrivateKeyParameters = new X448PrivateKeyParameters(this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) x448PrivateKeyParameters.generatePublicKey(), (AsymmetricKeyParameter) x448PrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(28998), BERTags.FLAGS, null, CryptoServicePurpose.KEYGEN));
    }
}
