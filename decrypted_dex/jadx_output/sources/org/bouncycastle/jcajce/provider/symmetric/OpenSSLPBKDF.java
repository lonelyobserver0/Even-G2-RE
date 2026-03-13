package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class OpenSSLPBKDF {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = OpenSSLPBKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            a.x(new StringBuilder(), PREFIX, StubApp.getString2(32017), configurableProvider, StubApp.getString2(32018));
        }
    }

    public static class PBKDF extends BaseSecretKeyFactory {
        public PBKDF() {
            super(StubApp.getString2(32019), null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException(StubApp.getString2(31733));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                throw new InvalidKeySpecException(StubApp.getString2(32024));
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                throw new InvalidKeySpecException(StubApp.getString2(32023) + pBEKeySpec.getIterationCount());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException(StubApp.getString2(32022) + pBEKeySpec.getKeyLength());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                throw new IllegalArgumentException(StubApp.getString2(32021));
            }
            OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new OpenSSLPBEParametersGenerator();
            openSSLPBEParametersGenerator.init(Strings.toUTF8ByteArray(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
            return new SecretKeySpec(((KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(pBEKeySpec.getKeyLength())).getKey(), StubApp.getString2(32020));
        }
    }

    private OpenSSLPBKDF() {
    }
}
