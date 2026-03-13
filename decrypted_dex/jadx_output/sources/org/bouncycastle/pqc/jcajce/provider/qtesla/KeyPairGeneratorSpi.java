package org.bouncycastle.pqc.jcajce.provider.qtesla;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAKeyGenerationParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAKeyPairGenerator;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static final Map catLookup;
    private QTESLAKeyPairGenerator engine;
    private boolean initialised;
    private QTESLAKeyGenerationParameters param;
    private SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        catLookup = hashMap;
        hashMap.put(QTESLASecurityCategory.getName(5), Integers.valueOf(5));
        hashMap.put(QTESLASecurityCategory.getName(6), Integers.valueOf(6));
    }

    public KeyPairGeneratorSpi() {
        super(StubApp.getString2(34701));
        this.engine = new QTESLAKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            QTESLAKeyGenerationParameters qTESLAKeyGenerationParameters = new QTESLAKeyGenerationParameters(6, this.random);
            this.param = qTESLAKeyGenerationParameters;
            this.engine.init(qTESLAKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCqTESLAPublicKey((QTESLAPublicKeyParameters) generateKeyPair.getPublic()), new BCqTESLAPrivateKey((QTESLAPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        throw new IllegalArgumentException(StubApp.getString2(34638));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof QTESLAParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(34702));
        }
        QTESLAKeyGenerationParameters qTESLAKeyGenerationParameters = new QTESLAKeyGenerationParameters(((Integer) catLookup.get(((QTESLAParameterSpec) algorithmParameterSpec).getSecurityCategory())).intValue(), secureRandom);
        this.param = qTESLAKeyGenerationParameters;
        this.engine.init(qTESLAKeyGenerationParameters);
        this.initialised = true;
    }
}
