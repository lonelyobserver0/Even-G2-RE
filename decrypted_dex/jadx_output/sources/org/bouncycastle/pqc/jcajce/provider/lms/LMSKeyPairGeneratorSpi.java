package org.bouncycastle.pqc.jcajce.provider.lms;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.HSSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.lms.LMSParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.jcajce.spec.LMSHSSKeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.LMSHSSParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMSKeyPairGeneratorSpi extends KeyPairGenerator {
    private AsymmetricCipherKeyPairGenerator engine;
    private boolean initialised;
    private KeyGenerationParameters param;
    private SecureRandom random;
    private ASN1ObjectIdentifier treeDigest;

    public LMSKeyPairGeneratorSpi() {
        super(StubApp.getString2(28198));
        this.engine = new LMSKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            LMSKeyGenerationParameters lMSKeyGenerationParameters = new LMSKeyGenerationParameters(new LMSParameters(LMSigParameters.lms_sha256_n32_h10, LMOtsParameters.sha256_n32_w2), this.random);
            this.param = lMSKeyGenerationParameters;
            this.engine.init(lMSKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        if (this.engine instanceof LMSKeyPairGenerator) {
            return new KeyPair(new BCLMSPublicKey((LMSPublicKeyParameters) generateKeyPair.getPublic()), new BCLMSPrivateKey((LMSPrivateKeyParameters) generateKeyPair.getPrivate()));
        }
        return new KeyPair(new BCLMSPublicKey((HSSPublicKeyParameters) generateKeyPair.getPublic()), new BCLMSPrivateKey((HSSPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        throw new IllegalArgumentException(StubApp.getString2(34638));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        AsymmetricCipherKeyPairGenerator hSSKeyPairGenerator;
        if (algorithmParameterSpec instanceof LMSKeyGenParameterSpec) {
            LMSKeyGenParameterSpec lMSKeyGenParameterSpec = (LMSKeyGenParameterSpec) algorithmParameterSpec;
            this.param = new LMSKeyGenerationParameters(new LMSParameters(lMSKeyGenParameterSpec.getSigParams(), lMSKeyGenParameterSpec.getOtsParams()), secureRandom);
            hSSKeyPairGenerator = new LMSKeyPairGenerator();
        } else {
            int i3 = 0;
            if (algorithmParameterSpec instanceof LMSHSSKeyGenParameterSpec) {
                LMSKeyGenParameterSpec[] lMSSpecs = ((LMSHSSKeyGenParameterSpec) algorithmParameterSpec).getLMSSpecs();
                LMSParameters[] lMSParametersArr = new LMSParameters[lMSSpecs.length];
                while (i3 != lMSSpecs.length) {
                    lMSParametersArr[i3] = new LMSParameters(lMSSpecs[i3].getSigParams(), lMSSpecs[i3].getOtsParams());
                    i3++;
                }
                this.param = new HSSKeyGenerationParameters(lMSParametersArr, secureRandom);
                hSSKeyPairGenerator = new HSSKeyPairGenerator();
            } else if (algorithmParameterSpec instanceof LMSParameterSpec) {
                LMSParameterSpec lMSParameterSpec = (LMSParameterSpec) algorithmParameterSpec;
                this.param = new LMSKeyGenerationParameters(new LMSParameters(lMSParameterSpec.getSigParams(), lMSParameterSpec.getOtsParams()), secureRandom);
                hSSKeyPairGenerator = new LMSKeyPairGenerator();
            } else {
                if (!(algorithmParameterSpec instanceof LMSHSSParameterSpec)) {
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(34665));
                }
                LMSParameterSpec[] lMSSpecs2 = ((LMSHSSParameterSpec) algorithmParameterSpec).getLMSSpecs();
                LMSParameters[] lMSParametersArr2 = new LMSParameters[lMSSpecs2.length];
                while (i3 != lMSSpecs2.length) {
                    lMSParametersArr2[i3] = new LMSParameters(lMSSpecs2[i3].getSigParams(), lMSSpecs2[i3].getOtsParams());
                    i3++;
                }
                this.param = new HSSKeyGenerationParameters(lMSParametersArr2, secureRandom);
                hSSKeyPairGenerator = new HSSKeyPairGenerator();
            }
        }
        this.engine = hSSKeyPairGenerator;
        hSSKeyPairGenerator.init(this.param);
        this.initialised = true;
    }
}
