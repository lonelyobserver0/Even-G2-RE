package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.crypto.generators.SCrypt;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.ScryptKeySpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SCRYPT {

    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int scheme;

        public BasePBKDF2(String str, int i3) {
            super(str, MiscObjectIdentifiers.id_scrypt);
            this.scheme = i3;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof ScryptKeySpec)) {
                throw new InvalidKeySpecException(StubApp.getString2(31733));
            }
            ScryptKeySpec scryptKeySpec = (ScryptKeySpec) keySpec;
            if (scryptKeySpec.getSalt() == null) {
                throw new IllegalArgumentException(StubApp.getString2(28995));
            }
            if (scryptKeySpec.getCostParameter() <= 1) {
                throw new IllegalArgumentException(StubApp.getString2(32166));
            }
            if (scryptKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException(StubApp.getString2(32022) + scryptKeySpec.getKeyLength());
            }
            if (scryptKeySpec.getPassword().length == 0) {
                throw new IllegalArgumentException(StubApp.getString2(32021));
            }
            return new BCPBEKey(this.algName, new KeyParameter(SCrypt.generate(PasswordConverter.UTF8.convert(scryptKeySpec.getPassword()), scryptKeySpec.getSalt(), scryptKeySpec.getCostParameter(), scryptKeySpec.getBlockSize(), scryptKeySpec.getParallelizationParameter(), scryptKeySpec.getKeyLength() / 8)));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SCRYPT.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            String string2 = StubApp.getString2(32167);
            a.x(sb2, str, string2, configurableProvider, StubApp.getString2(32168));
            a.A(configurableProvider, str, string2, StubApp.getString2(31568), MiscObjectIdentifiers.id_scrypt);
        }
    }

    public static class ScryptWithUTF8 extends BasePBKDF2 {
        public ScryptWithUTF8() {
            super(StubApp.getString2(32169), 5);
        }
    }

    private SCRYPT() {
    }
}
