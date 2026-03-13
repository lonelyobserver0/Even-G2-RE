package org.bouncycastle.pqc.jcajce.provider.kyber;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.jcajce.SecretKeyWithEncapsulation;
import org.bouncycastle.jcajce.spec.KEMExtractSpec;
import org.bouncycastle.jcajce.spec.KEMGenerateSpec;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMExtractor;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMGenerator;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KyberKeyGeneratorSpi extends KeyGeneratorSpi {
    private KEMExtractSpec extSpec;
    private KEMGenerateSpec genSpec;
    private SecureRandom random;

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        KEMGenerateSpec kEMGenerateSpec = this.genSpec;
        if (kEMGenerateSpec != null) {
            SecretWithEncapsulation generateEncapsulated = new KyberKEMGenerator(this.random).generateEncapsulated(((BCKyberPublicKey) kEMGenerateSpec.getPublicKey()).getKeyParams());
            SecretKeyWithEncapsulation secretKeyWithEncapsulation = new SecretKeyWithEncapsulation(new SecretKeySpec(generateEncapsulated.getSecret(), this.genSpec.getKeyAlgorithmName()), generateEncapsulated.getEncapsulation());
            try {
                generateEncapsulated.destroy();
                return secretKeyWithEncapsulation;
            } catch (DestroyFailedException unused) {
                throw new IllegalStateException(StubApp.getString2(34636));
            }
        }
        KyberKEMExtractor kyberKEMExtractor = new KyberKEMExtractor(((BCKyberPrivateKey) this.extSpec.getPrivateKey()).getKeyParams());
        byte[] encapsulation = this.extSpec.getEncapsulation();
        byte[] extractSecret = kyberKEMExtractor.extractSecret(encapsulation);
        SecretKeyWithEncapsulation secretKeyWithEncapsulation2 = new SecretKeyWithEncapsulation(new SecretKeySpec(extractSecret, this.extSpec.getKeyAlgorithmName()), encapsulation);
        Arrays.clear(extractSecret);
        return secretKeyWithEncapsulation2;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i3, SecureRandom secureRandom) {
        throw new UnsupportedOperationException(StubApp.getString2(29315));
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        throw new UnsupportedOperationException(StubApp.getString2(29315));
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        this.random = secureRandom;
        if (algorithmParameterSpec instanceof KEMGenerateSpec) {
            this.genSpec = (KEMGenerateSpec) algorithmParameterSpec;
            this.extSpec = null;
        } else {
            if (!(algorithmParameterSpec instanceof KEMExtractSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(34637));
            }
            this.genSpec = null;
            this.extSpec = (KEMExtractSpec) algorithmParameterSpec;
        }
    }
}
