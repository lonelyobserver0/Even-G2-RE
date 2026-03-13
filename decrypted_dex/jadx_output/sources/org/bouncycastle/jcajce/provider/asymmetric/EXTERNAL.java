package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bc.ExternalValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.ExternalPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EXTERNAL {
    private static final String PREFIX = StubApp.getString2(30098);
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> externalAttributes;

    public static class ExternalKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public ExternalKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
            throw new UnsupportedOperationException(StubApp.getString2(30094));
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return new ExternalPublicKey(ExternalValue.getInstance(subjectPublicKeyInfo.parsePublicKey()));
        }
    }

    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
                }
                throw new InvalidKeyException(StubApp.getString2(29647));
            } catch (IOException e10) {
                throw new InvalidKeyException(u.q(e10, new StringBuilder(StubApp.getString2(29648))));
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
            return EXTERNAL.baseConverter.generatePrivate(privateKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return EXTERNAL.baseConverter.generatePublic(subjectPublicKeyInfo);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String string2 = StubApp.getString2(30095);
            String string22 = StubApp.getString2(30096);
            StringBuilder r8 = a.r(configurableProvider, string2, string22, StubApp.getString2(29651));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.external_value;
            StringBuilder q10 = a.q(r8, aSN1ObjectIdentifier, configurableProvider, string22, StubApp.getString2(29652));
            q10.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(q10.toString(), string22);
            AsymmetricKeyInfoConverter unused = EXTERNAL.baseConverter = new ExternalKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, EXTERNAL.baseConverter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        externalAttributes = hashMap;
        hashMap.put(StubApp.getString2(29653), StubApp.getString2(30097));
        hashMap.put(StubApp.getString2(29655), StubApp.getString2(19963));
    }
}
