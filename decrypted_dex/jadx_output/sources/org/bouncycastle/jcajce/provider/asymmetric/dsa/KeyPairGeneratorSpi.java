package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    DSAKeyPairGenerator engine;
    boolean initialised;
    DSAKeyGenerationParameters param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super(StubApp.getString2(28060));
        this.engine = new DSAKeyPairGenerator();
        this.strength = 2048;
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        DSAParametersGenerator dSAParametersGenerator;
        int i3;
        SecureRandom secureRandom;
        if (!this.initialised) {
            Integer valueOf = Integers.valueOf(this.strength);
            if (params.containsKey(valueOf)) {
                this.param = (DSAKeyGenerationParameters) params.get(valueOf);
            } else {
                synchronized (lock) {
                    try {
                        if (params.containsKey(valueOf)) {
                            this.param = (DSAKeyGenerationParameters) params.get(valueOf);
                        } else {
                            int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                            int i10 = this.strength;
                            if (i10 == 1024) {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                if (Properties.isOverrideSet(StubApp.getString2("30587"))) {
                                    i3 = this.strength;
                                    secureRandom = this.random;
                                    dSAParametersGenerator.init(i3, defaultCertainty, secureRandom);
                                    DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                    this.param = dSAKeyGenerationParameters;
                                    params.put(valueOf, dSAKeyGenerationParameters);
                                } else {
                                    dSAParametersGenerator.init(new DSAParameterGenerationParameters(1024, 160, defaultCertainty, this.random));
                                    DSAKeyGenerationParameters dSAKeyGenerationParameters2 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                    this.param = dSAKeyGenerationParameters2;
                                    params.put(valueOf, dSAKeyGenerationParameters2);
                                }
                            } else if (i10 > 1024) {
                                DSAParameterGenerationParameters dSAParameterGenerationParameters = new DSAParameterGenerationParameters(i10, 256, defaultCertainty, this.random);
                                dSAParametersGenerator = new DSAParametersGenerator(new SHA256Digest());
                                dSAParametersGenerator.init(dSAParameterGenerationParameters);
                                DSAKeyGenerationParameters dSAKeyGenerationParameters22 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                this.param = dSAKeyGenerationParameters22;
                                params.put(valueOf, dSAKeyGenerationParameters22);
                            } else {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                i3 = this.strength;
                                secureRandom = this.random;
                                dSAParametersGenerator.init(i3, defaultCertainty, secureRandom);
                                DSAKeyGenerationParameters dSAKeyGenerationParameters222 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                this.param = dSAKeyGenerationParameters222;
                                params.put(valueOf, dSAKeyGenerationParameters222);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCDSAPublicKey((DSAPublicKeyParameters) generateKeyPair.getPublic()), new BCDSAPrivateKey((DSAPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        boolean z2;
        if (i3 < 512 || i3 > 4096 || ((i3 < 1024 && i3 % 64 != 0) || (i3 >= 1024 && i3 % 1024 != 0))) {
            throw new InvalidParameterException(StubApp.getString2(30588));
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i3);
        if (dSADefaultParameters != null) {
            DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = dSAKeyGenerationParameters;
            this.engine.init(dSAKeyGenerationParameters);
            z2 = true;
        } else {
            this.strength = i3;
            this.random = secureRandom;
            z2 = false;
        }
        this.initialised = z2;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(30589));
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.param = dSAKeyGenerationParameters;
        this.engine.init(dSAKeyGenerationParameters);
        this.initialised = true;
    }
}
