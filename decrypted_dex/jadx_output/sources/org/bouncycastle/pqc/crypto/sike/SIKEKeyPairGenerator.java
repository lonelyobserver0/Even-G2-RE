package org.bouncycastle.pqc.crypto.sike;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SIKEKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SecureRandom random;
    private SIKEKeyGenerationParameters sikeParams;

    private AsymmetricCipherKeyPair genKeyPair() {
        System.err.println(StubApp.getString2(34171));
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(34173), 0, this.sikeParams.getParameters(), CryptoServicePurpose.KEYGEN));
        SIKEEngine engine = this.sikeParams.getParameters().getEngine();
        byte[] bArr = new byte[engine.getPrivateKeySize()];
        byte[] bArr2 = new byte[engine.getPublicKeySize()];
        engine.crypto_kem_keypair(bArr2, bArr, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SIKEPublicKeyParameters(this.sikeParams.getParameters(), bArr2), (AsymmetricKeyParameter) new SIKEPrivateKeyParameters(this.sikeParams.getParameters(), bArr));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.sikeParams = (SIKEKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }
}
