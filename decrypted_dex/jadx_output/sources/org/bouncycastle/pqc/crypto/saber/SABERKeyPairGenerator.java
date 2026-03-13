package org.bouncycastle.pqc.crypto.saber;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SABERKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* renamed from: l, reason: collision with root package name */
    private int f19462l;
    private SecureRandom random;
    private SABERKeyGenerationParameters saberParams;

    private AsymmetricCipherKeyPair genKeyPair() {
        SABEREngine engine = this.saberParams.getParameters().getEngine();
        byte[] bArr = new byte[engine.getPrivateKeySize()];
        byte[] bArr2 = new byte[engine.getPublicKeySize()];
        engine.crypto_kem_keypair(bArr2, bArr, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new SABERPublicKeyParameters(this.saberParams.getParameters(), bArr2), (AsymmetricKeyParameter) new SABERPrivateKeyParameters(this.saberParams.getParameters(), bArr));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.saberParams = (SABERKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f19462l = this.saberParams.getParameters().getL();
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
